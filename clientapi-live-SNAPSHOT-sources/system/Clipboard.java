package dev.xdark.clientapi.system;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public interface Clipboard
{
    void setContent(final String content);
}
