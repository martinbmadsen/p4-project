/* This file was generated by SableCC (http://www.sablecc.org/). */

package ScannerParser.node;

import ScannerParser.analysis.*;

@SuppressWarnings("nls")
public final class TVariable extends Token
{
    public TVariable(String text)
    {
        setText(text);
    }

    public TVariable(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVariable(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVariable(this);
    }
}
