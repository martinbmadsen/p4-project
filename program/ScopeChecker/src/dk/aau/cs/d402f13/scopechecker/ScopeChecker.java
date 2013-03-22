package dk.aau.cs.d402f13.scopechecker;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import dk.aau.cs.d402f13.scanner.Scanner;
import dk.aau.cs.d402f13.utilities.SymbolTable;
import dk.aau.cs.d402f13.utilities.Token;
import dk.aau.cs.d402f13.utilities.SymbolTable.SymbolInfo;
import dk.aau.cs.d402f13.utilities.SymbolTable.SymbolType;
import dk.aau.cs.d402f13.utilities.errors.ScopeError;
import dk.aau.cs.d402f13.utilities.errors.StandardError;
import dk.aau.cs.d402f13.utilities.errors.SyntaxError;
import dk.aau.cs.d402f13.parser.AstNode;
import dk.aau.cs.d402f13.parser.Parser;

public class ScopeChecker {
  
  static SymbolTable currentST;
  static Boolean varDeclaringMode = false; //if true, next VAR seen is a declaration, else a use
  static void openScope(){
    currentST = new SymbolTable(currentST);
  }
  static void closeScope() throws ScopeError{
    currentST.checkErrors(); //will throw a ScannerError exception if errors are found
    currentST = currentST.getParent();
  }
  
  //Must be called after the AST has been created
 public static void checkScopes(AstNode root) throws ScopeError{
   currentST = null;
   openScope();
   insertDefaultFunctions(); //findSquares, union, ...
   traverse(root);
   closeScope();
 }
 
 static void insertDefaultFunctions() throws ScopeError{ //the functions that exists in our language
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "andSquares", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "findSquares", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "union", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "forall", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "isEmpty", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "move", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "moveAndCapture", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "isCurrentPlayer", -1, 0);
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, "isFirstMove", -1, 0);
 }

 static void traverse(AstNode node) throws ScopeError{
   switch (node.type){
     case FUNC_DEF: funcDef(node); break;
     case FUNCTION: function(node); traverseChildren(node); break;
     case VAR: var(node); break;
     default: traverseChildren(node);
   }
 }
 
 static void var(AstNode node) throws ScopeError{
   if (varDeclaringMode){
     currentST.foundDeclaredSymbol(SymbolType.VARIABLE, node.value, node.line, node.offset);
     System.out.println("Found decl of var: " + node.value + " on line: " + node.line + " offset " + node.offset);
     
   }
   else{
     currentST.foundUsedSymbol(SymbolType.VARIABLE, node.value, node.line, node.offset);
     System.out.println("Found use of var: " + node.value + " on line: " + node.line + " offset " + node.offset);
     
   }
 }
 
 
 
 static void traverseChildren(AstNode node) throws ScopeError{
 //save the iterator, since node.iterator() will return the same iterator even though .next() has been called
   Iterator<AstNode> it = node.iterator(); while (it.hasNext()){
     traverse(it.next());
   }
 }
 
 static void funcDef (AstNode node) throws ScopeError{
   //Save the name of the function defined
   Iterator<AstNode> it = node.iterator();
   String funcName = it.next().value;
   currentST.foundDeclaredSymbol(SymbolType.FUNCTION, funcName, node.line, node.offset);
   System.out.println("Found decl of func: " + funcName + " on line: " + node.line + " offset " + node.offset);
   
   //FUNC_DEF = FUNC VARLIST EXPRESSION
   varDeclaringMode = true;
   traverse(it.next()); //traverse the VARLIST
   varDeclaringMode = false;
   openScope(); //open new scope, so function arguments can be hidden
     traverse(it.next()); //traverse the expression
   closeScope();
 }
 static void function(AstNode node){
   currentST.foundUsedSymbol(SymbolType.FUNCTION, node.value, node.line, node.offset);
   System.out.println("Found use of func: " + node.value + " on line: " + node.line + " offset " + node.offset);
   
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
       case ":s":
       case ":p":
       case ":c":
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
             ast.print();
             OutputStreamWriter f = new OutputStreamWriter(
                 new FileOutputStream(
                 new File("ast.dot"), false)
             );
             ast.export(f);
             f.close();
             if (line.equals(":c")){
               checkScopes(ast);       
             }
           }
         }
         catch (StandardError e) {
           System.out.flush();
           System.err.println("Error: " + e.getMessage()
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
         }
         input = "";
         break;
       default:
         input += line + "\n";
     }
   }
 }
 
}