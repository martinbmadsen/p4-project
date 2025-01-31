package dk.aau.cs.d402f13.scopechecker;

import dk.aau.cs.d402f13.utilities.scopechecker.ConstantMember;
import dk.aau.cs.d402f13.utilities.scopechecker.Data;
import dk.aau.cs.d402f13.utilities.scopechecker.FunctionMember;
import dk.aau.cs.d402f13.utilities.scopechecker.TypeSymbolInfo;
import dk.aau.cs.d402f13.utilities.scopechecker.Member;
import dk.aau.cs.d402f13.utilities.scopechecker.TypeTable;

public class TypeTablePrettyPrinter {

 
    public static void print(TypeTable tt){
      for (TypeSymbolInfo ci : tt){
        System.out.print("Type " + ci.name + " takes " + ci.args + " args" +
        (ci.varArgs ? " and has varargs," : ","));
    
        if (ci.parent != null){
          System.out.print(" extends " + ci.parent.name);
          System.out.print(" with " + ci.parentCallArgs + " args");
        }
        
        System.out.println("");
        System.out.println("  Has members:");
        for (Member m : ci.members){
          if (m instanceof FunctionMember)
            System.out.println("    " + (m.abstrct ? "abstract " : "") + 
                               " func " + m.name + ", takes " + ((FunctionMember)m).argCount() + " args" + 
                               (((FunctionMember)m).hasVarArgs() ? " and varargs" : "") );
          else if (m instanceof ConstantMember)
            System.out.println("    " + (m.abstrct ? "abstract " : "") + " const " + m.name);
          else
            System.out.println("    " + (m.abstrct ? "abstract " : "") + " unknown " + m.name);       
          }
        
        System.out.println("  Has data:");
        for (Data d : ci.data){
          System.out.println("    " + d.name);
        } 
      }
    }
}
