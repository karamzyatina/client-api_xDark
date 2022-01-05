package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.util.*;
import it.unimi.dsi.fastutil.objects.*;

@SidedApi(Side.SERVER)
public interface ItemOverride
{
    ResourceLocation getLocation();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder location(final ResourceLocation location);
        
        Builder values(final Object2FloatMap<ResourceLocation> values);
        
        ItemOverride build();
    }
}
