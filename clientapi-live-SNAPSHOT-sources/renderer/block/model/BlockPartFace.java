package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BlockPartFace
{
    EnumFacing getCullFace();
    
    int getTintIndex();
    
    String getTexture();
    
    BlockFaceUV getFaceUV();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder cullFace(final EnumFacing cullFace);
        
        Builder tintIndex(final int tintIndex);
        
        Builder texture(final String texture);
        
        Builder blockFaceUV(final BlockFaceUV blockFaceUV);
        
        BlockPartFace build();
    }
}
