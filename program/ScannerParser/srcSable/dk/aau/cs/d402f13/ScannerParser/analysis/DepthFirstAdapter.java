/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.analysis;

import java.util.*;
import dk.aau.cs.d402f13.ScannerParser.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
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
        {
            List<PFunctionDef> copy = new ArrayList<PFunctionDef>(node.getFunctionDef());
            for(PFunctionDef e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getGameDecl() != null)
        {
            node.getGameDecl().apply(this);
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
        if(node.getDefine() != null)
        {
            node.getDefine().apply(this);
        }
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        {
            List<TVariable> copy = new ArrayList<TVariable>(node.getVariable());
            for(TVariable e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
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
        if(node.getGame() != null)
        {
            node.getGame().apply(this);
        }
        if(node.getDeclStruct() != null)
        {
            node.getDeclStruct().apply(this);
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
        if(node.getLBrc() != null)
        {
            node.getLBrc().apply(this);
        }
        {
            List<PDecl> copy = new ArrayList<PDecl>(node.getDecl());
            for(PDecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBrc() != null)
        {
            node.getRBrc().apply(this);
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
        if(node.getKeyword() != null)
        {
            node.getKeyword().apply(this);
        }
        if(node.getStructure() != null)
        {
            node.getStructure().apply(this);
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
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getStructure() != null)
        {
            node.getStructure().apply(this);
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

    public void inAStarSharedOperator(AStarSharedOperator node)
    {
        defaultIn(node);
    }

    public void outAStarSharedOperator(AStarSharedOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStarSharedOperator(AStarSharedOperator node)
    {
        inAStarSharedOperator(node);
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        outAStarSharedOperator(node);
    }

    public void inAPlusSharedOperator(APlusSharedOperator node)
    {
        defaultIn(node);
    }

    public void outAPlusSharedOperator(APlusSharedOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusSharedOperator(APlusSharedOperator node)
    {
        inAPlusSharedOperator(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusSharedOperator(node);
    }

    public void inANormOpOperator(ANormOpOperator node)
    {
        defaultIn(node);
    }

    public void outANormOpOperator(ANormOpOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANormOpOperator(ANormOpOperator node)
    {
        inANormOpOperator(node);
        if(node.getNormalOperator() != null)
        {
            node.getNormalOperator().apply(this);
        }
        outANormOpOperator(node);
    }

    public void inASharedOpOperator(ASharedOpOperator node)
    {
        defaultIn(node);
    }

    public void outASharedOpOperator(ASharedOpOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASharedOpOperator(ASharedOpOperator node)
    {
        inASharedOpOperator(node);
        if(node.getSharedOperator() != null)
        {
            node.getSharedOperator().apply(this);
        }
        outASharedOpOperator(node);
    }

    public void inASlashOperator(ASlashOperator node)
    {
        defaultIn(node);
    }

    public void outASlashOperator(ASlashOperator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASlashOperator(ASlashOperator node)
    {
        inASlashOperator(node);
        if(node.getSlash() != null)
        {
            node.getSlash().apply(this);
        }
        outASlashOperator(node);
    }

    public void inAStarStarQmarkPlus(AStarStarQmarkPlus node)
    {
        defaultIn(node);
    }

    public void outAStarStarQmarkPlus(AStarStarQmarkPlus node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStarStarQmarkPlus(AStarStarQmarkPlus node)
    {
        inAStarStarQmarkPlus(node);
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        outAStarStarQmarkPlus(node);
    }

    public void inAQmarkStarQmarkPlus(AQmarkStarQmarkPlus node)
    {
        defaultIn(node);
    }

    public void outAQmarkStarQmarkPlus(AQmarkStarQmarkPlus node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAQmarkStarQmarkPlus(AQmarkStarQmarkPlus node)
    {
        inAQmarkStarQmarkPlus(node);
        if(node.getQmark() != null)
        {
            node.getQmark().apply(this);
        }
        outAQmarkStarQmarkPlus(node);
    }

    public void inAPlusStarQmarkPlus(APlusStarQmarkPlus node)
    {
        defaultIn(node);
    }

    public void outAPlusStarQmarkPlus(APlusStarQmarkPlus node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusStarQmarkPlus(APlusStarQmarkPlus node)
    {
        inAPlusStarQmarkPlus(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusStarQmarkPlus(node);
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
        if(node.getElement() != null)
        {
            node.getElement().apply(this);
        }
        if(node.getOperator() != null)
        {
            node.getOperator().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAElopexpExpression(node);
    }

    public void inAAssignExpression(AAssignExpression node)
    {
        defaultIn(node);
    }

    public void outAAssignExpression(AAssignExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignExpression(AAssignExpression node)
    {
        inAAssignExpression(node);
        if(node.getAssignment() != null)
        {
            node.getAssignment().apply(this);
        }
        outAAssignExpression(node);
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
        if(node.getList() != null)
        {
            node.getList().apply(this);
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
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
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
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAExprElement(node);
    }

    public void inAThisElement(AThisElement node)
    {
        defaultIn(node);
    }

    public void outAThisElement(AThisElement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAThisElement(AThisElement node)
    {
        inAThisElement(node);
        if(node.getThis() != null)
        {
            node.getThis().apply(this);
        }
        outAThisElement(node);
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
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getPattern() != null)
        {
            node.getPattern().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
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

    public void inAVarExpr(AVarExpr node)
    {
        defaultIn(node);
    }

    public void outAVarExpr(AVarExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExpr(AVarExpr node)
    {
        inAVarExpr(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getEql() != null)
        {
            node.getEql().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAVarExpr(node);
    }

    public void inAAssignment(AAssignment node)
    {
        defaultIn(node);
    }

    public void outAAssignment(AAssignment node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignment(AAssignment node)
    {
        inAAssignment(node);
        if(node.getLet() != null)
        {
            node.getLet().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getEql() != null)
        {
            node.getEql().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        {
            List<PVarExpr> copy = new ArrayList<PVarExpr>(node.getVarExpr());
            for(PVarExpr e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIn() != null)
        {
            node.getIn().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAssignment(node);
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
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getMid() != null)
        {
            node.getMid().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
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
        if(node.getPound() != null)
        {
            node.getPound().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        {
            List<TVariable> copy = new ArrayList<TVariable>(node.getVariable());
            for(TVariable e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        if(node.getArrow() != null)
        {
            node.getArrow().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
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
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        {
            List<PElement> copy = new ArrayList<PElement>(node.getElement());
            for(PElement e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
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
        {
            List<PPatternExpr> copy = new ArrayList<PPatternExpr>(node.getPatternExpr());
            for(PPatternExpr e : copy)
            {
                e.apply(this);
            }
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
        if(node.getStarQmarkPlus() != null)
        {
            node.getStarQmarkPlus().apply(this);
        }
        outAPatvalPatternExpr(node);
    }

    public void inAPatvalexprPatternExpr(APatvalexprPatternExpr node)
    {
        defaultIn(node);
    }

    public void outAPatvalexprPatternExpr(APatvalexprPatternExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPatvalexprPatternExpr(APatvalexprPatternExpr node)
    {
        inAPatvalexprPatternExpr(node);
        if(node.getPatternVal() != null)
        {
            node.getPatternVal().apply(this);
        }
        if(node.getPatternOr() != null)
        {
            node.getPatternOr().apply(this);
        }
        if(node.getPatternExpr() != null)
        {
            node.getPatternExpr().apply(this);
        }
        outAPatvalexprPatternExpr(node);
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
        if(node.getEmark() != null)
        {
            node.getEmark().apply(this);
        }
        if(node.getPatternCheck() != null)
        {
            node.getPatternCheck().apply(this);
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
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getPattern() != null)
        {
            node.getPattern().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outALpatexprrPatternVal(node);
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
