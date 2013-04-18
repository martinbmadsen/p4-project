package dk.aau.cs.d402f13.scopechecker;

import java.util.ArrayList;

import dk.aau.cs.d402f13.utilities.ast.AstNode;
import dk.aau.cs.d402f13.utilities.errors.StandardError;

public class SemanticChecker {
  ArrayList<TypeInfo> typeTable;

  public void visit(AstNode node) throws StandardError{
    TypeVisitor typeVisitor = new TypeVisitor();
    typeVisitor.visit(node);
    typeTable = typeVisitor.getTypeTable();
    TypeExtendErrorChecker teec = new TypeExtendErrorChecker();
    teec.check(typeTable);
    TypeTablePrettyPrinter.print(typeTable);
  }
}