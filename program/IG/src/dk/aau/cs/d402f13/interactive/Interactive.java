package dk.aau.cs.d402f13.interactive;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.LinkedList;

import dk.aau.cs.d402f13.interpreter.Interpreter;
import dk.aau.cs.d402f13.interpreter.stdenv.game.GameEnvironment;
import dk.aau.cs.d402f13.parser.Parser;
import dk.aau.cs.d402f13.scanner.Scanner;
//import dk.aau.cs.d402f13.scopechecker.ScopeChecker;
import dk.aau.cs.d402f13.utilities.PrettyPrinter;
import dk.aau.cs.d402f13.utilities.Token;
import dk.aau.cs.d402f13.utilities.ast.AstNode;
import dk.aau.cs.d402f13.utilities.ast.Visitor;
import dk.aau.cs.d402f13.utilities.errors.Error;
import dk.aau.cs.d402f13.utilities.errors.InternalError;
import dk.aau.cs.d402f13.utilities.errors.StandardError;
import dk.aau.cs.d402f13.utilities.errors.SyntaxError;
import dk.aau.cs.d402f13.values.ConstValue;
import dk.aau.cs.d402f13.values.FunValue;
import dk.aau.cs.d402f13.values.TypeValue;
import dk.aau.cs.d402f13.values.Value;

public class Interactive {
  private Interactive() {
    // TODO Auto-generated constructor stub
  }
  
  public static void expressionI(BufferedReader reader) throws IOException, StandardError {
    Interpreter interp = new Interpreter();
    while (true) {
      System.out.print("> ");
      String line = reader.readLine();
      if (line.equals("exit")) {
        System.out.println("Exitting expression interpreter...");
        return;
      }
      try {
        Scanner s = new Scanner(new ByteArrayInputStream(
          line.getBytes("UTF-8")
        ));
        Token ts;
        LinkedList<Token> tokens = new LinkedList<Token>();
        while ((ts = s.scan()).type != Token.Type.EOF) {
          tokens.add(ts);
        }
        Parser p = new Parser();
        AstNode ast;
        if (tokens.size() < 1) {
          continue;
        }
        if (tokens.get(0).type == Token.Type.KEY_DEFINE ||
            tokens.get(0).type == Token.Type.KEY_TYPE) {
          ast = p.parseAsDefinition(tokens);
        }
        else {
          ast = p.parseAsExpression(tokens);
        }
        //new ScopeChecker(ast);
        Value v = interp.visit(ast);
        if (v != null) 
          System.out.println(" = " + v + " (" + v.getClass().getSimpleName() + ")");
      }
      catch (Error e) {
        System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage()
            + " on input line " + e.getLine() + " column "
            + e.getColumn() + ":");
        System.out.println(line);
        for (int i = 1; i < e.getColumn(); i++) {
          System.out.print("-");
        }
        System.out.println("^");
        if (e instanceof InternalError) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = "";
    String input = "";
    while (true) {
      line = br.readLine();
      if (line == null) { return; }
      line = line.replace('\t', ' ');
      switch (line) {
        case ":q":
          System.exit(0);
          break;
        case ":e":
          System.out.println("Entering expression interpreter...");
          expressionI(br);
          input = "";
          continue;
        case ":s":
        case ":o":
        case ":p":
        case ":i":
        case ":nk":
        case ":k":
          try {
            ByteArrayInputStream bais = new ByteArrayInputStream(
              input.getBytes("UTF-8")
            );
            System.out.println("Scanning...");
            Date start = new Date();
            Scanner s = new Scanner(bais);
            LinkedList<Token> tokens = new LinkedList<Token>();
            Token ts;
            while ((ts = s.scan()).type != Token.Type.EOF) {
              tokens.add(ts);
            }
            long time = new Date().getTime() - start.getTime();
            System.out.println("Scanning took " + time + " ms");
            if (line.equals(":s")) {
              for (Token t : tokens) {
                System.out.println("" + t.type + " (" + t.value + ") <" + t.line + ":" + t.offset + ">");                
              }
            }
            else {
              System.out.println("Parsing...");
              start = new Date();
              Parser p = new Parser();
              AstNode ast = p.parse(tokens);
              time = new Date().getTime() - start.getTime();
              System.out.println("Parsing took " + time + " ms");
              if (line.equals(":p")) {
                ast.print();
                OutputStreamWriter f = new OutputStreamWriter(
                    new FileOutputStream(
                    new File("ast.dot"), false)
                );
                ast.export(f);
                f.close();
              }
              else {
                if (line.equals(":o")) {
                  System.out.println("Pretty printing...");
                  start = new Date();
                  PrettyPrinter pp = new PrettyPrinter();
                  String code = pp.visit(ast);
                  time = new Date().getTime() - start.getTime();
                  System.out.println("Pretty printing took " + time + " ms");
                  System.out.println(code);
                }
                else{
                  if (!line.equals(":nk")) {
                    System.out.println("Scope checking...");
                    start = new Date();
//                    ScopeChecker scopeChecker;
//                    scopeChecker.visit(ast);
                    time = new Date().getTime() - start.getTime();
                    System.out.println("Scope checking took " + time + " ms");
                  }
                  if (line.equals(":i") || line.equals(":nk")) {
                    System.out.println("Interpreting...");
                    start = new Date();
                    GameEnvironment env = new GameEnvironment();
                    Interpreter i = new Interpreter(env);
                    i.visit(ast);
                    time = new Date().getTime() - start.getTime();
                    System.out.println("Interpreting took " + time + " ms");
                    TypeValue game = env.findGameType();
                    if (game != null) {
                      System.out.println("Found game: " + game.getName());
                    }
                    Value main = env.getConstant("main"); 
                    if (main != null) {
                      Value v = null;
                      System.out.println("Evaluating main...");
                      start = new Date();
                      if (main instanceof ConstValue) {
                        v = ((ConstValue)main).evaluate();
                      }
                      else if (main instanceof FunValue) {
                        v = ((FunValue)main).call(i);
                      }
                      time = new Date().getTime() - start.getTime();
                      System.out.println("Evaluating main took " + time + " ms");
                      if (v != null) 
                        System.out.println(" = " + v + " (" + v.getClass().getSimpleName() + ")");
                    }
                  }
                }
              }
            }
          }
          catch (Error e) {
            System.out.flush();
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage()
                + " on input line " + e.getLine() + " column "
                + e.getColumn() + ":");
            String[] lines = input.split("\n");
            if (lines.length >= e.getLine()) {
              System.err.println(lines[e.getLine() - 1]);
              for (int i = 1; i < e.getColumn(); i++) {
                System.err.print("-");
              }
              System.err.println("^");
            }
            if (e instanceof InternalError) {
              e.printStackTrace();
            }
          }
          input = "";
          break;
        default:
          input += line + "\n";
      }
    }
  }
}
