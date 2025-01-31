package dk.aau.cs.d402f13.utilities.ast;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class AstNode implements Iterable<AstNode> {
  public enum Type{
    //Keywords
    THIS, SUPER, PATTERN_KEYWORD, PATTERN_OPERATOR,
    //Literals
    INT_LIT, DIR_LIT, COORD_LIT, STRING_LIT,
    //Identifiers
    CONSTANT, TYPE, VAR,
    //Program structure
    PROGRAM, CONSTANT_DEF, TYPE_DEF, ABSTRACT_TYPE_DEF, TYPE_BODY,  ABSTRACT_DEF, 
    VARLIST, VARS, DATA_DEF, 
    //Expressions
    ASSIGNMENT, IF_EXPR, LAMBDA_EXPR, LIST, 
    ELEMENT, MEMBER_ACCESS, CALL_SEQUENCE,
    SET_EXPR,  
    //Patterns
    PATTERN, PATTERN_OR, PATTERN_MULTIPLIER, PATTERN_NOT,
    // OPERATIONS
    NEGATION, LO_SEQUENCE, EQ_SEQUENCE, CM_SEQUENCE, AS_SEQUENCE,
    MD_SEQUENCE,
    // Special
    NOT_OPERATOR, 
  }
  
  public Type type;
  public String value;
  public int line, offset;
  private ArrayList<AstNode> children = new ArrayList<AstNode>();
  private static int counter = 0;
  
  public String operation = null;
  
  public void addChild(AstNode child){
    if(child != null){
      this.children.add(child);
    }
  }
  
  public AstNode(Type type, String value, int line, int offset){
    this.type = type;
    this.value = value;
    this.line = line;
    this.offset = offset;
  }
  
  public int size() {
    return children.size();
  }
  
  public AstNode get(int index) {
    return children.get(index);
  }

  private void exportNode(OutputStreamWriter os) throws IOException {
    int thisN = counter;
    if (operation == null) {
      os.write("  N" + thisN + " [label=\"" + type + "\\n" + value + "\"]\n");
    }
    else {
      os.write("  N" + thisN + " [label=\"" + type + "\\n(" + operation + ") " + value + "\"]\n");
    }
    for (AstNode n : children) {
      counter++;
      os.write("  N" + thisN + " -> N" + counter + "\n");
      n.exportNode(os);
    }
  }
  
  public void export(OutputStreamWriter os) throws IOException {
    counter = 0;
    os.write("digraph ast {\n");
    exportNode(os);
    os.write("}");
  }
  
  public Iterator<AstNode> iterator() {
    return children.iterator();
  }

  public void print() {
    print("");
  }
  
  public AstNode getFirst() {
    return this.get(0);
  }
  
  public AstNode getLast() {
    return this.get(this.size() - 1);
  }
  
  private void print(String prefix){
    System.out.println(prefix + "- " + type + " (" + value + ") [" + operation + "] <" + line + ":" + offset + ">");
    for(AstNode n : children){
      n.print(prefix + " ");
    }
  }
}
