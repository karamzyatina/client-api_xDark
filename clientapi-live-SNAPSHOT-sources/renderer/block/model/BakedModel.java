package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.util.*;
import java.util.*;
import dev.xdark.clientapi.renderer.texture.*;
import dev.xdark.clientapi.render.model.*;

@SidedApi(Side.SERVER)
public interface BakedModel
{
    List<BakedQuad> getQuads(final BlockState state, final EnumFacing facing, final long seed);
    
    boolean hasQuads(final BlockState state, final EnumFacing facing, final long seed);
    
    boolean isAmbientOcclusion();
    
    boolean isGui3d();
    
    boolean isBuiltInRenderer();
    
    TextureAtlasSprite getParticleTexture();
    
    ItemCameraTransforms getItemCameraTransforms();
}
