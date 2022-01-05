package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.renderer.texture.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.render.*;

@SidedApi(Side.SERVER)
public interface BakedQuad
{
    TextureAtlasSprite getSprite();
    
    int[] getVertexData();
    
    boolean hasTintIndex();
    
    int getTintIndex();
    
    EnumFacing getFace();
    
    int[] getVertexDataSingle();
    
    VertexFormat getFormat();
    
    boolean shouldApplyDiffuseLighting();
}
