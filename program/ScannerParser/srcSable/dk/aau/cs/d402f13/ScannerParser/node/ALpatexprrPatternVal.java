/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class ALpatexprrPatternVal extends PPatternVal
{
    private TLPar _lPar_;
    private PPattern _pattern_;
    private TRPar _rPar_;
    private TInteger _integer_;

    public ALpatexprrPatternVal()
    {
        // Constructor
    }

    public ALpatexprrPatternVal(
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PPattern _pattern_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TInteger _integer_)
    {
        // Constructor
        setLPar(_lPar_);

        setPattern(_pattern_);

        setRPar(_rPar_);

        setInteger(_integer_);

    }

    @Override
    public Object clone()
    {
        return new ALpatexprrPatternVal(
            cloneNode(this._lPar_),
            cloneNode(this._pattern_),
            cloneNode(this._rPar_),
            cloneNode(this._integer_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALpatexprrPatternVal(this);
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PPattern getPattern()
    {
        return this._pattern_;
    }

    public void setPattern(PPattern node)
    {
        if(this._pattern_ != null)
        {
            this._pattern_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pattern_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public TInteger getInteger()
    {
        return this._integer_;
    }

    public void setInteger(TInteger node)
    {
        if(this._integer_ != null)
        {
            this._integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integer_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lPar_)
            + toString(this._pattern_)
            + toString(this._rPar_)
            + toString(this._integer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._pattern_ == child)
        {
            this._pattern_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._pattern_ == oldChild)
        {
            setPattern((PPattern) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
