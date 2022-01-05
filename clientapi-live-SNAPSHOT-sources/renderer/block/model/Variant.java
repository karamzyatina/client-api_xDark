package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface Variant
{
    ResourceLocation getModelLocation();
    
    ModelRotation getModelRotation();
    
    boolean isUVLocked();
    
    int getWeight();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder modelLocation(final ResourceLocation modelLocation);
        
        Builder rotation(final ModelRotation rotation);
        
        Builder uvLock(final boolean uvLock);
        
        Builder weight(final int weight);
        
        Variant build();
    }
}
