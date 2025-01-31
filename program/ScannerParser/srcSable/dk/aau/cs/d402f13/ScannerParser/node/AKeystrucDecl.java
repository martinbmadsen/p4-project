/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class AKeystrucDecl extends PDecl
{
    private TKeyword _keyword_;
    private PStructure _structure_;

    public AKeystrucDecl()
    {
        // Constructor
    }

    public AKeystrucDecl(
        @SuppressWarnings("hiding") TKeyword _keyword_,
        @SuppressWarnings("hiding") PStructure _structure_)
    {
        // Constructor
        setKeyword(_keyword_);

        setStructure(_structure_);

    }

    @Override
    public Object clone()
    {
        return new AKeystrucDecl(
            cloneNode(this._keyword_),
            cloneNode(this._structure_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAKeystrucDecl(this);
    }

    public TKeyword getKeyword()
    {
        return this._keyword_;
    }

    public void setKeyword(TKeyword node)
    {
        if(this._keyword_ != null)
        {
            this._keyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keyword_ = node;
    }

    public PStructure getStructure()
    {
        return this._structure_;
    }

    public void setStructure(PStructure node)
    {
        if(this._structure_ != null)
        {
            this._structure_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._structure_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keyword_)
            + toString(this._structure_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keyword_ == child)
        {
            this._keyword_ = null;
            return;
        }

        if(this._structure_ == child)
        {
            this._structure_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keyword_ == oldChild)
        {
            setKeyword((TKeyword) newChild);
            return;
        }

        if(this._structure_ == oldChild)
        {
            setStructure((PStructure) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
