/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.analysis;

import java.util.*;
import dk.aau.cs.d402f13.ScannerParser.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getGameDecl() != null)
        {
            node.getGameDecl().apply(this);
        }
        {
            List<PFunctionDef> copy = new ArrayList<PFunctionDef>(node.getFunctionDef());
            Collections.reverse(copy);
            for(PFunctionDef e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
    }

    public void inAFunctionDef(AFunctionDef node)
    {
        defaultIn(node);
    }

    public void outAFunctionDef(AFunctionDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionDef(AFunctionDef node)
    {
        inAFunctionDef(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        outAFunctionDef(node);
    }

    public void inAGameDecl(AGameDecl node)
    {
        defaultIn(node);
    }

    public void outAGameDecl(AGameDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGameDecl(AGameDecl node)
    {
        inAGameDecl(node);
        if(node.getDeclStruct() != null)
        {
            node.getDeclStruct().apply(this);
        }
        if(node.getGame() != null)
        {
            node.getGame().apply(this);
        }
        outAGameDecl(node);
    }

    public void inADeclStruct(ADeclStruct node)
    {
        defaultIn(node);
    }

    public void outADeclStruct(ADeclStruct node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclStruct(ADeclStruct node)
    {
        inADeclStruct(node);
        if(node.getRBrc() != null)
        {
            node.getRBrc().apply(this);
        }
        {
            List<PDecl> copy = new ArrayList<PDecl>(node.getDecl());
            Collections.reverse(copy);
            for(PDecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLBrc() != null)
        {
            node.getLBrc().apply(this);
        }
        outADeclStruct(node);
    }

    public void inAKeystrucDecl(AKeystrucDecl node)
    {
        defaultIn(node);
    }

    public void outAKeystrucDecl(AKeystrucDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAKeystrucDecl(AKeystrucDecl node)
    {
        inAKeystrucDecl(node);
        if(node.getStructure() != null)
        {
            node.getStructure().apply(this);
        }
        if(node.getKeyword() != null)
        {
            node.getKeyword().apply(this);
        }
        outAKeystrucDecl(node);
    }

    public void inAIdstrucDecl(AIdstrucDecl node)
    {
        defaultIn(node);
    }

    public void outAIdstrucDecl(AIdstrucDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdstrucDecl(AIdstrucDecl node)
    {
        inAIdstrucDecl(node);
        if(node.getStructure() != null)
        {
            node.getStructure().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdstrucDecl(node);
    }

    public void inADeclstrucStructure(ADeclstrucStructure node)
    {
        defaultIn(node);
    }

    public void outADeclstrucStructure(ADeclstrucStructure node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclstrucStructure(ADeclstrucStructure node)
    {
        inADeclstrucStructure(node);
        if(node.getDeclStruct() != null)
        {
            node.getDeclStruct().apply(this);
        }
        outADeclstrucStructure(node);
    }

    public void inAExprStructure(AExprStructure node)
    {
        defaultIn(node);
    }

    public void outAExprStructure(AExprStructure node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprStructure(AExprStructure node)
    {
        inAExprStructure(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAExprStructure(node);
    }

    public void inAFuncExpression(AFuncExpression node)
    {
        defaultIn(node);
    }

    public void outAFuncExpression(AFuncExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncExpression(AFuncExpression node)
    {
        inAFuncExpression(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFuncExpression(node);
    }

    public void inAElopexpExpression(AElopexpExpression node)
    {
        defaultIn(node);
    }

    public void outAElopexpExpression(AElopexpExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElopexpExpression(AElopexpExpression node)
    {
        inAElopexpExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getOperator() != null)
        {
            node.getOperator().apply(this);
        }
        if(node.getElement() != null)
        {
            node.getElement().apply(this);
        }
        outAElopexpExpression(node);
    }

    public void inAIfExpression(AIfExpression node)
    {
        defaultIn(node);
    }

    public void outAIfExpression(AIfExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfExpression(AIfExpression node)
    {
        inAIfExpression(node);
        if(node.getIfExpr() != null)
        {
            node.getIfExpr().apply(this);
        }
        outAIfExpression(node);
    }

    public void inALambdaExpression(ALambdaExpression node)
    {
        defaultIn(node);
    }

    public void outALambdaExpression(ALambdaExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALambdaExpression(ALambdaExpression node)
    {
        inALambdaExpression(node);
        if(node.getLambdaExpr() != null)
        {
            node.getLambdaExpr().apply(this);
        }
        outALambdaExpression(node);
    }

    public void inAElExpression(AElExpression node)
    {
        defaultIn(node);
    }

    public void outAElExpression(AElExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElExpression(AElExpression node)
    {
        inAElExpression(node);
        if(node.getElement() != null)
        {
            node.getElement().apply(this);
        }
        outAElExpression(node);
    }

    public void inANotExpression(ANotExpression node)
    {
        defaultIn(node);
    }

    public void outANotExpression(ANotExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpression(ANotExpression node)
    {
        inANotExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        outANotExpression(node);
    }

    public void inAExprElement(AExprElement node)
    {
        defaultIn(node);
    }

    public void outAExprElement(AExprElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprElement(AExprElement node)
    {
        inAExprElement(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAExprElement(node);
    }

    public void inAVarElement(AVarElement node)
    {
        defaultIn(node);
    }

    public void outAVarElement(AVarElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarElement(AVarElement node)
    {
        inAVarElement(node);
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        outAVarElement(node);
    }

    public void inAListElement(AListElement node)
    {
        defaultIn(node);
    }

    public void outAListElement(AListElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListElement(AListElement node)
    {
        inAListElement(node);
        if(node.getList() != null)
        {
            node.getList().apply(this);
        }
        outAListElement(node);
    }

    public void inAPatElement(APatElement node)
    {
        defaultIn(node);
    }

    public void outAPatElement(APatElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPatElement(APatElement node)
    {
        inAPatElement(node);
        if(node.getPattern() != null)
        {
            node.getPattern().apply(this);
        }
        outAPatElement(node);
    }

    public void inAKeyElement(AKeyElement node)
    {
        defaultIn(node);
    }

    public void outAKeyElement(AKeyElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAKeyElement(AKeyElement node)
    {
        inAKeyElement(node);
        if(node.getKeyword() != null)
        {
            node.getKeyword().apply(this);
        }
        outAKeyElement(node);
    }

    public void inADirElement(ADirElement node)
    {
        defaultIn(node);
    }

    public void outADirElement(ADirElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADirElement(ADirElement node)
    {
        inADirElement(node);
        if(node.getDirection() != null)
        {
            node.getDirection().apply(this);
        }
        outADirElement(node);
    }

    public void inACorElement(ACorElement node)
    {
        defaultIn(node);
    }

    public void outACorElement(ACorElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACorElement(ACorElement node)
    {
        inACorElement(node);
        if(node.getCoordinate() != null)
        {
            node.getCoordinate().apply(this);
        }
        outACorElement(node);
    }

    public void inAIntElement(AIntElement node)
    {
        defaultIn(node);
    }

    public void outAIntElement(AIntElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntElement(AIntElement node)
    {
        inAIntElement(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntElement(node);
    }

    public void inAStrElement(AStrElement node)
    {
        defaultIn(node);
    }

    public void outAStrElement(AStrElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStrElement(AStrElement node)
    {
        inAStrElement(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStrElement(node);
    }

    public void inAIdElement(AIdElement node)
    {
        defaultIn(node);
    }

    public void outAIdElement(AIdElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdElement(AIdElement node)
    {
        inAIdElement(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdElement(node);
    }

    public void inAFuncElement(AFuncElement node)
    {
        defaultIn(node);
    }

    public void outAFuncElement(AFuncElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncElement(AFuncElement node)
    {
        inAFuncElement(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFuncElement(node);
    }

    public void inAFunctionCall(AFunctionCall node)
    {
        defaultIn(node);
    }

    public void outAFunctionCall(AFunctionCall node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionCall(AFunctionCall node)
    {
        inAFunctionCall(node);
        if(node.getList() != null)
        {
            node.getList().apply(this);
        }
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFunctionCall(node);
    }

    public void inAIfExpr(AIfExpr node)
    {
        defaultIn(node);
    }

    public void outAIfExpr(AIfExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfExpr(AIfExpr node)
    {
        inAIfExpr(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        outAIfExpr(node);
    }

    public void inALambdaExpr(ALambdaExpr node)
    {
        defaultIn(node);
    }

    public void outALambdaExpr(ALambdaExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALambdaExpr(ALambdaExpr node)
    {
        inALambdaExpr(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getArrow() != null)
        {
            node.getArrow().apply(this);
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        {
            List<TVariable> copy = new ArrayList<TVariable>(node.getVariable());
            Collections.reverse(copy);
            for(TVariable e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getPound() != null)
        {
            node.getPound().apply(this);
        }
        outALambdaExpr(node);
    }

    public void inAList(AList node)
    {
        defaultIn(node);
    }

    public void outAList(AList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAList(AList node)
    {
        inAList(node);
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        {
            List<PElement> copy = new ArrayList<PElement>(node.getElement());
            Collections.reverse(copy);
            for(PElement e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        outAList(node);
    }

    public void inAPattern(APattern node)
    {
        defaultIn(node);
    }

    public void outAPattern(APattern node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPattern(APattern node)
    {
        inAPattern(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        {
            List<PPatternExpr> copy = new ArrayList<PPatternExpr>(node.getPatternExpr());
            Collections.reverse(copy);
            for(PPatternExpr e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAPattern(node);
    }

    public void inAPatvalPatternExpr(APatvalPatternExpr node)
    {
        defaultIn(node);
    }

    public void outAPatvalPatternExpr(APatvalPatternExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPatvalPatternExpr(APatvalPatternExpr node)
    {
        inAPatvalPatternExpr(node);
        if(node.getPatternVal() != null)
        {
            node.getPatternVal().apply(this);
        }
        outAPatvalPatternExpr(node);
    }

    public void inAPatvalqmarkPatternExpr(APatvalqmarkPatternExpr node)
    {
        defaultIn(node);
    }

    public void outAPatvalqmarkPatternExpr(APatvalqmarkPatternExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPatvalqmarkPatternExpr(APatvalqmarkPatternExpr node)
    {
        inAPatvalqmarkPatternExpr(node);
        if(node.getStarQmarkPlus() != null)
        {
            node.getStarQmarkPlus().apply(this);
        }
        if(node.getPatternVal() != null)
        {
            node.getPatternVal().apply(this);
        }
        outAPatvalqmarkPatternExpr(node);
    }

    public void inADirPatternVal(ADirPatternVal node)
    {
        defaultIn(node);
    }

    public void outADirPatternVal(ADirPatternVal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADirPatternVal(ADirPatternVal node)
    {
        inADirPatternVal(node);
        if(node.getDirection() != null)
        {
            node.getDirection().apply(this);
        }
        outADirPatternVal(node);
    }

    public void inAVarPatternVal(AVarPatternVal node)
    {
        defaultIn(node);
    }

    public void outAVarPatternVal(AVarPatternVal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarPatternVal(AVarPatternVal node)
    {
        inAVarPatternVal(node);
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        outAVarPatternVal(node);
    }

    public void inAPatcheckPatternVal(APatcheckPatternVal node)
    {
        defaultIn(node);
    }

    public void outAPatcheckPatternVal(APatcheckPatternVal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPatcheckPatternVal(APatcheckPatternVal node)
    {
        inAPatcheckPatternVal(node);
        if(node.getPatternCheck() != null)
        {
            node.getPatternCheck().apply(this);
        }
        outAPatcheckPatternVal(node);
    }

    public void inAEmarkpatcheckPatternVal(AEmarkpatcheckPatternVal node)
    {
        defaultIn(node);
    }

    public void outAEmarkpatcheckPatternVal(AEmarkpatcheckPatternVal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmarkpatcheckPatternVal(AEmarkpatcheckPatternVal node)
    {
        inAEmarkpatcheckPatternVal(node);
        if(node.getPatternCheck() != null)
        {
            node.getPatternCheck().apply(this);
        }
        if(node.getEmark() != null)
        {
            node.getEmark().apply(this);
        }
        outAEmarkpatcheckPatternVal(node);
    }

    public void inALpatexprrPatternVal(ALpatexprrPatternVal node)
    {
        defaultIn(node);
    }

    public void outALpatexprrPatternVal(ALpatexprrPatternVal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALpatexprrPatternVal(ALpatexprrPatternVal node)
    {
        inALpatexprrPatternVal(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        {
            List<PPatternExpr> copy = new ArrayList<PPatternExpr>(node.getPatternExpr());
            Collections.reverse(copy);
            for(PPatternExpr e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outALpatexprrPatternVal(node);
    }

    public void inALpatxprrintPatternVal(ALpatxprrintPatternVal node)
    {
        defaultIn(node);
    }

    public void outALpatxprrintPatternVal(ALpatxprrintPatternVal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALpatxprrintPatternVal(ALpatxprrintPatternVal node)
    {
        inALpatxprrintPatternVal(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        {
            List<PPatternExpr> copy = new ArrayList<PPatternExpr>(node.getPatternExpr());
            Collections.reverse(copy);
            for(PPatternExpr e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outALpatxprrintPatternVal(node);
    }

    public void inAFriendPatternCheck(AFriendPatternCheck node)
    {
        defaultIn(node);
    }

    public void outAFriendPatternCheck(AFriendPatternCheck node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFriendPatternCheck(AFriendPatternCheck node)
    {
        inAFriendPatternCheck(node);
        if(node.getFriend() != null)
        {
            node.getFriend().apply(this);
        }
        outAFriendPatternCheck(node);
    }

    public void inAFoePatternCheck(AFoePatternCheck node)
    {
        defaultIn(node);
    }

    public void outAFoePatternCheck(AFoePatternCheck node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFoePatternCheck(AFoePatternCheck node)
    {
        inAFoePatternCheck(node);
        if(node.getFoe() != null)
        {
            node.getFoe().apply(this);
        }
        outAFoePatternCheck(node);
    }

    public void inAEmptyPatternCheck(AEmptyPatternCheck node)
    {
        defaultIn(node);
    }

    public void outAEmptyPatternCheck(AEmptyPatternCheck node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyPatternCheck(AEmptyPatternCheck node)
    {
        inAEmptyPatternCheck(node);
        if(node.getEmpty() != null)
        {
            node.getEmpty().apply(this);
        }
        outAEmptyPatternCheck(node);
    }

    public void inAThisPatternCheck(AThisPatternCheck node)
    {
        defaultIn(node);
    }

    public void outAThisPatternCheck(AThisPatternCheck node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAThisPatternCheck(AThisPatternCheck node)
    {
        inAThisPatternCheck(node);
        if(node.getThis() != null)
        {
            node.getThis().apply(this);
        }
        outAThisPatternCheck(node);
    }

    public void inAIdPatternCheck(AIdPatternCheck node)
    {
        defaultIn(node);
    }

    public void outAIdPatternCheck(AIdPatternCheck node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdPatternCheck(AIdPatternCheck node)
    {
        inAIdPatternCheck(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdPatternCheck(node);
    }
}
