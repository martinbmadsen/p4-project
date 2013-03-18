/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.analysis;

import java.util.*;
import dk.aau.cs.d402f13.ScannerParser.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionDef(AFunctionDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGameDecl(AGameDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclStruct(ADeclStruct node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAKeystrucDecl(AKeystrucDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdstrucDecl(AIdstrucDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclstrucStructure(ADeclstrucStructure node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprStructure(AExprStructure node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncExpression(AFuncExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElopexprExpression(AElopexprExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfExpression(AIfExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALambdaExpression(ALambdaExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElExpression(AElExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotExpression(ANotExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALexprrElement(ALexprrElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarElement(AVarElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListElement(AListElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPatElement(APatElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAKeyElement(AKeyElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADirElement(ADirElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACorElement(ACorElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntElement(AIntElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStrElement(AStrElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdElement(AIdElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncElement(AFuncElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionCall(AFunctionCall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfExpr(AIfExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALambdaExpr(ALambdaExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAList(AList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPattern(APattern node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPatvalPatternExpr(APatvalPatternExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPatvalqmarkPatternExpr(APatvalqmarkPatternExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADirPatternVal(ADirPatternVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarPatternVal(AVarPatternVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPatcheckPatternVal(APatcheckPatternVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmarkpatcheckPatternVal(AEmarkpatcheckPatternVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALpatexprrPatternVal(ALpatexprrPatternVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALpatxprrintPatternVal(ALpatxprrintPatternVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFriendPatternCheck(AFriendPatternCheck node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFoePatternCheck(AFoePatternCheck node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyPatternCheck(AEmptyPatternCheck node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAThisPatternCheck(AThisPatternCheck node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdPatternCheck(AIdPatternCheck node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDecimal(TDecimal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLowercase(TLowercase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUppercase(TUppercase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnycase(TAnycase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQuotebs(TQuotebs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUnichar(TUnichar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStrchar(TStrchar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTKeyword(TKeyword node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOperator(TOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPatternKeyword(TPatternKeyword node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPatternOperator(TPatternOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDirection(TDirection node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStarQmarkPlus(TStarQmarkPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCoordinate(TCoordinate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFunction(TFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVariable(TVariable node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDefine(TDefine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGame(TGame node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBkt(TLBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBkt(TRBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrc(TLBrc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrc(TRBrc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPound(TPound node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLArrow(TLArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQMark(TQMark node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEmark(TEmark node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFriend(TFriend node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFoe(TFoe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEmpty(TEmpty node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThis(TThis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
