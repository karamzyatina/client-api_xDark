package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import org.lwjgl.util.vector.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BlockPartRotation
{
    Vector3f getOrigin();
    
    EnumFacing.Axis getAxis();
    
    float getAngle();
    
    boolean shouldRescale();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder original(final Vector3f original);
        
        Builder axis(final EnumFacing.Axis axis);
        
        Builder angle(final float angle);
        
        Builder rescale(final boolean rescale);
        
        BlockPartRotation build();
    }
}
