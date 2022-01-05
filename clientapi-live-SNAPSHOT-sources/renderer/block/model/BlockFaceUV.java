package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BlockFaceUV
{
    default BlockFaceUV of(final float[] uvs, final int rotation) {
        throw CompileStub.create();
    }
    
    float getVertexU(final int u);
    
    float getVertexV(final int v);
    
    int getVertexRotatedRev(final int i);
    
    void setUvs(final float[] uvs);
}
