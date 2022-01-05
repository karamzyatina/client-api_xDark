package dev.xdark.clientapi.renderer.texture;

import dev.xdark.clientapi.texture.*;
import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.render.*;
import dev.xdark.clientapi.renderer.block.model.*;

@SidedApi(Side.SERVER)
public interface TextureMap extends Texture
{
    boolean generateMipmaps(final TextureAtlasSprite atlasSprite);
    
    ResourceLocation getResourceLocation(final TextureAtlasSprite atlasSprite);
    
    ResourceLocation completeResourceLocation(final ResourceLocation location);
    
    TextureAtlasSprite getAtlasSprite(final String name);
    
    void updateAnimations();
    
    TextureAtlasSprite registerSprite(final ResourceLocation location);
    
    void tick();
    
    void setMipmapLevels(final int mipmapLevels);
    
    TextureAtlasSprite getMissingSprite();
    
    String getBasePath();
    
    int getMipmapLevels();
    
    TextureAtlasSprite getRegisteredSprite(final ResourceLocation location);
    
    int getCountRegisteredSprites();
    
    boolean isTextureBound();
    
    TextureAtlasSprite getIconByUV(final double u, final double v);
    
    int getCountAnimations();
    
    int getCountAnimationsActive();
    
    BakedQuad newQuad(final int[] vertexData, final int tintIndex, final EnumFacing face, final TextureAtlasSprite sprite, final boolean applyDiffuseLighting, final VertexFormat format);
    
    BakedQuad newQuad(final int[] vertexData, final int tintIndex, final EnumFacing face, final TextureAtlasSprite sprite);
}
