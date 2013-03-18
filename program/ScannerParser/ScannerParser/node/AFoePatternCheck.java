/* This file was generated by SableCC (http://www.sablecc.org/). */

package ScannerParser.node;

import ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class AFoePatternCheck extends PPatternCheck
{
    private TFoe _foe_;

    public AFoePatternCheck()
    {
        // Constructor
    }

    public AFoePatternCheck(
        @SuppressWarnings("hiding") TFoe _foe_)
    {
        // Constructor
        setFoe(_foe_);

    }

    @Override
    public Object clone()
    {
        return new AFoePatternCheck(
            cloneNode(this._foe_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFoePatternCheck(this);
    }

    public TFoe getFoe()
    {
        return this._foe_;
    }

    public void setFoe(TFoe node)
    {
        if(this._foe_ != null)
        {
            this._foe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._foe_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._foe_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._foe_ == child)
        {
            this._foe_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._foe_ == oldChild)
        {
            setFoe((TFoe) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
