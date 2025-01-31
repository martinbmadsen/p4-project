/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class AElExpression extends PExpression
{
    private PElement _element_;
    private PList _list_;

    public AElExpression()
    {
        // Constructor
    }

    public AElExpression(
        @SuppressWarnings("hiding") PElement _element_,
        @SuppressWarnings("hiding") PList _list_)
    {
        // Constructor
        setElement(_element_);

        setList(_list_);

    }

    @Override
    public Object clone()
    {
        return new AElExpression(
            cloneNode(this._element_),
            cloneNode(this._list_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElExpression(this);
    }

    public PElement getElement()
    {
        return this._element_;
    }

    public void setElement(PElement node)
    {
        if(this._element_ != null)
        {
            this._element_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._element_ = node;
    }

    public PList getList()
    {
        return this._list_;
    }

    public void setList(PList node)
    {
        if(this._list_ != null)
        {
            this._list_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._list_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._element_)
            + toString(this._list_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._element_ == child)
        {
            this._element_ = null;
            return;
        }

        if(this._list_ == child)
        {
            this._list_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._element_ == oldChild)
        {
            setElement((PElement) newChild);
            return;
        }

        if(this._list_ == oldChild)
        {
            setList((PList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
