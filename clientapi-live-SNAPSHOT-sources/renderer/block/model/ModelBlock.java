package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import java.util.*;
import dev.xdark.clientapi.render.model.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface ModelBlock
{
    List<BlockPart> getElements();
    
    boolean isAmbientOcclusion();
    
    boolean isGui3d();
    
    boolean isResolved();
    
    void getParentFromMap(final Map<ResourceLocation, ModelBlock> map);
    
    Collection<ResourceLocation> getOverrideLocations();
    
    boolean isTexturePresent(final String tex);
    
    String resolveTextureName(final String name);
    
    ResourceLocation getParentLocation();
    
    ModelBlock getRootModel();
    
    ItemCameraTransforms getAllTransforms();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder parent(final ResourceLocation parent);
        
        Builder elements(final List<BlockPart> elements);
        
        Builder textures(final Map<String, String> textures);
        
        Builder ambientOcclusion(final boolean ambientOcclusion);
        
        Builder gui3d(final boolean gui3d);
        
        Builder cameraTransforms(final ItemCameraTransforms cameraTransforms);
        
        Builder overrides(final List<ItemOverride> overrides);
        
        ModelBlock build();
    }
}
