/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class ADirElement extends PElement
{
    private TDirection _direction_;

    public ADirElement()
    {
        // Constructor
    }

    public ADirElement(
        @SuppressWarnings("hiding") TDirection _direction_)
    {
        // Constructor
        setDirection(_direction_);

    }

    @Override
    public Object clone()
    {
        return new ADirElement(
            cloneNode(this._direction_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADirElement(this);
    }

    public TDirection getDirection()
    {
        return this._direction_;
    }

    public void setDirection(TDirection node)
    {
        if(this._direction_ != null)
        {
            this._direction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._direction_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._direction_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._direction_ == child)
        {
            this._direction_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._direction_ == oldChild)
        {
            setDirection((TDirection) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
