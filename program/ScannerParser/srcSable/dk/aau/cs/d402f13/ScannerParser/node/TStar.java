/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class TStar extends Token
{
    public TStar(String text)
    {
        setText(text);
    }

    public TStar(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStar(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStar(this);
    }
}
