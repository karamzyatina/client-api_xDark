package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import org.lwjgl.util.vector.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface ItemTransformVec3f
{
    Vector3f getRotation();
    
    Vector3f getTranslation();
    
    Vector3f getScale();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder rotation(final Vector3f rotation);
        
        Builder translation(final Vector3f translation);
        
        Builder scale(final Vector3f scale);
        
        ItemTransformVec3f build();
    }
}
