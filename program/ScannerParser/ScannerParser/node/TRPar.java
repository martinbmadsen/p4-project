/* This file was generated by SableCC (http://www.sablecc.org/). */

package ScannerParser.node;

import ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class TRPar extends Token
{
    public TRPar()
    {
        super.setText(")");
    }

    public TRPar(int line, int pos)
    {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRPar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRPar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRPar text.");
    }
}
