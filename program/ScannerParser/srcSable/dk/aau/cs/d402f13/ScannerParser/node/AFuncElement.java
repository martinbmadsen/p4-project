/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class AFuncElement extends PElement
{
    private TFunction _function_;

    public AFuncElement()
    {
        // Constructor
    }

    public AFuncElement(
        @SuppressWarnings("hiding") TFunction _function_)
    {
        // Constructor
        setFunction(_function_);

    }

    @Override
    public Object clone()
    {
        return new AFuncElement(
            cloneNode(this._function_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncElement(this);
    }

    public TFunction getFunction()
    {
        return this._function_;
    }

    public void setFunction(TFunction node)
    {
        if(this._function_ != null)
        {
            this._function_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._function_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._function_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._function_ == child)
        {
            this._function_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._function_ == oldChild)
        {
            setFunction((TFunction) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
