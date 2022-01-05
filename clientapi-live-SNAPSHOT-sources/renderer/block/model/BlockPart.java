package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import org.lwjgl.util.vector.*;
import java.util.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BlockPart
{
    Vector3f getFrom();
    
    Vector3f getTo();
    
    Map<EnumFacing, BlockPartFace> getFaces();
    
    BlockPartRotation getPartRotation();
    
    boolean isShading();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder from(final Vector3f from);
        
        Builder to(final Vector3f to);
        
        Builder faces(final Map<EnumFacing, BlockPartFace> faces);
        
        Builder rotation(final BlockPartRotation rotation);
        
        Builder shading(final boolean shading);
        
        BlockPart build();
    }
}
