package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public interface VertexFormat
{
    @SidedApi(Side.SERVER)
    void clear();
    
    boolean hasNormal();
    
    int getNormalOffset();
    
    boolean hasColor();
    
    int getColorOffset();
    
    boolean hasUvOffset(final int id);
    
    int getUvOffsetById(final int id);
    
    int getIntegerSize();
    
    int getSize();
    
    int getOffset(final int index);
}
