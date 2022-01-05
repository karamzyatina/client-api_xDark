package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.renderer.texture.*;
import dev.xdark.clientapi.renderer.*;

@SidedApi(Side.SERVER)
public interface ModelManager
{
    BakedModel getModel(final ModelResourceLocation location);
    
    BakedModel getMissingModel();
    
    TextureMap getTextureMap();
    
    BlockModelShapes getBlockModelShapes();
}
