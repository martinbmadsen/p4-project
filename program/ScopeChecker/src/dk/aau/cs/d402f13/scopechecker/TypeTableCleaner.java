package dk.aau.cs.d402f13.scopechecker;

import java.util.ArrayList;
import java.util.Collections;

import dk.aau.cs.d402f13.utilities.errors.ScopeError;
import dk.aau.cs.d402f13.utilities.scopechecker.Member;
import dk.aau.cs.d402f13.utilities.scopechecker.TypeSymbolInfo;

public class TypeTableCleaner {
  public ArrayList<TypeSymbolInfo> clean(ArrayList<TypeSymbolInfo> typeTable) throws ScopeError{
   addParentReferences(typeTable);          //adds references to a types parent, since only the name is kept at the moment
   typeTable = topologicalSort(typeTable);  //topological sort, so super type always appear before children, used for member propagation
   propagateMembers(typeTable);             //if a type's has a member, this member shall also be available in the derived types
   return typeTable;
  }
  void propagateMembers(ArrayList<TypeSymbolInfo> typeTable) throws ScopeError{
    for (TypeSymbolInfo tsi : typeTable){
       if (tsi.parent != null){
         propagateAbstractFunctions(tsi); //if parent has an abstract member, give it to this type as well + check for errors
         propagateConcreteFunctions(tsi); //if parent has an concrete member, give it to this type as well + check for errors
         propagateAbstractConstants(tsi);
         propagateConcreteConstants(tsi);
       }
    }
  }
  void propagateAbstractFunctions(TypeSymbolInfo tsi) throws ScopeError{
    for (Member pm : tsi.parent.abstractFunctions){
      Boolean overridden = false;
      for (Member m : tsi.concreteFunctions){
        if (m.name.equals(pm.name)){
         if (pm.args != m.args){
          throw new ScopeError("Number of arguments does not match overloaded abstract function " + m.name, tsi);
        }
         else{
           overridden = true;
         }
      }
    }
    if (!overridden)
      tsi.addAbstractFunction(pm); //propagate the parents member to this type
    }
  }
  void propagateConcreteFunctions(TypeSymbolInfo tsi) throws ScopeError{
    for (Member pm : tsi.parent.concreteFunctions){
      Boolean overridden = false;
      for (Member m : tsi.concreteFunctions){
        if (m.name.equals(pm.name)){
         if (pm.args != m.args){
          throw new ScopeError("Number of arguments does not match overloaded concrete function " + m.name, tsi);
        }
         else{
           overridden = true;
         }
      }
    }
    if (!overridden)
      tsi.addConcreteFunction(pm); //propagate the parents constant to this type
    }
  }
  void propagateAbstractConstants(TypeSymbolInfo tsi) throws ScopeError{
    for (Member pm : tsi.parent.abstractConstants){
      Boolean overridden = false;
      for (Member m : tsi.concreteConstants){
        if (m.name.equals(pm.name)){
           overridden = true;
      }
    }
    if (!overridden)
      tsi.addAbstractConstant(pm); //propagate the parents constant to this type
    }
  }
  void propagateConcreteConstants(TypeSymbolInfo tsi) throws ScopeError{
    for (Member pm : tsi.parent.concreteConstants){
      Boolean overridden = false;
      for (Member m : tsi.concreteConstants){
        if (m.name.equals(pm.name)){
         if (pm.args != m.args){
          throw new ScopeError("Number of arguments does not match overloaded constant " + m.name, tsi);
        }
         else{
           overridden = true;
         }
      }
    }
    if (!overridden)
      tsi.addConcreteConstant(pm); //propagate the parents constant to this type
    }
  }
  ArrayList<TypeSymbolInfo> topologicalSort(ArrayList<TypeSymbolInfo> typeTable) throws ScopeError{
    ArrayList<TypeSymbolInfo> sorted = new ArrayList<TypeSymbolInfo>();
    for (TypeSymbolInfo tsi : typeTable){
    if (tsi.parent != null)
      tsi.parent.children++;
    }
    for (TypeSymbolInfo tsi: typeTable){
      while (tsi.children == 0){
        sorted.add(tsi);
        tsi.children = -1; //make sure this type is only added once
        if (tsi.parent == null){
          break;
        }
        else{
          tsi.parent.children--;
          tsi = tsi.parent;
        }
      }
    }
    Collections.reverse(sorted); //reverse list so we get super classes first
    return sorted;
  }
  void addParentReferences(ArrayList<TypeSymbolInfo> typeTable) throws ScopeError{
    //this name must be looked up in the SymbolTable to update the real reference TypeInfo t.parent
    for (TypeSymbolInfo tsi : typeTable){
      if (tsi.parentName.equals(tsi.name)){ //type cannot extend itself
        throw new ScopeError("Type cannot extend itself", tsi);
      }
      if (tsi.parentName != ""){
      Boolean foundParentType = false;
      for (TypeSymbolInfo ti2 : typeTable){
        if (tsi.parentName.equals(ti2.name)){
          tsi.parent = ti2;
          foundParentType = true;
          break;
        }
      }
      if (!foundParentType)
        throw new ScopeError("Type extends undefined type", tsi);
      }
    }
  }
  public void markAbstractTypes(ArrayList<TypeSymbolInfo> typeTable) {
    //if a type contains any abstract member (also propagated members), it must be marked as abstract for use in interpreter
    for (TypeSymbolInfo tsi : typeTable){
      if (tsi.abstractFunctions.size() != 0 || tsi.abstractConstants.size() != 0)
        tsi.markASTnodeAsAbstract();
    }
  }
}