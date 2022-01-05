package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public interface Tessellator
{
    void draw();
    
    BufferBuilder getBufferBuilder();
}
