/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class AIfExpression extends PExpression
{
    private PIfExpr _ifExpr_;

    public AIfExpression()
    {
        // Constructor
    }

    public AIfExpression(
        @SuppressWarnings("hiding") PIfExpr _ifExpr_)
    {
        // Constructor
        setIfExpr(_ifExpr_);

    }

    @Override
    public Object clone()
    {
        return new AIfExpression(
            cloneNode(this._ifExpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfExpression(this);
    }

    public PIfExpr getIfExpr()
    {
        return this._ifExpr_;
    }

    public void setIfExpr(PIfExpr node)
    {
        if(this._ifExpr_ != null)
        {
            this._ifExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifExpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ifExpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ifExpr_ == child)
        {
            this._ifExpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ifExpr_ == oldChild)
        {
            setIfExpr((PIfExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
