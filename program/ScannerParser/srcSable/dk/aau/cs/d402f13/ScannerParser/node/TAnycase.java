/* This file was generated by SableCC (http://www.sablecc.org/). */

package dk.aau.cs.d402f13.ScannerParser.node;

import dk.aau.cs.d402f13.ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class TAnycase extends Token
{
    public TAnycase(String text)
    {
        setText(text);
    }

    public TAnycase(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAnycase(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAnycase(this);
    }
}