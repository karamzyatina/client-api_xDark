package dev.xdark.clientapi.renderer.texture;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import java.io.*;
import dev.xdark.clientapi.resource.*;
import java.util.*;
import dev.xdark.clientapi.resource.data.*;

@SidedApi(Side.SERVER)
public interface TextureAtlasSprite
{
    default TextureAtlasSprite of(final String name) {
        throw CompileStub.create();
    }
    
    int getOriginX();
    
    int getOriginY();
    
    int getIconWidth();
    
    int getIconHeight();
    
    float getMinU();
    
    float getMaxU();
    
    float getInterpolatedU(final double u);
    
    float getUnInterpolatedU(final float u);
    
    float getMinV();
    
    float getMaxV();
    
    float getInterpolatedV(final double v);
    
    float getUnInterpolatedV(final float v);
    
    String getIconName();
    
    void updateAnimation();
    
    int[][] getFrameTextureData(final int idx);
    
    int getFrameCount();
    
    void setIconWidth(final int w);
    
    void setIconHeight(final int h);
    
    void loadSprite(final PngSizeInfo sizeInfo, final boolean animation) throws IOException;
    
    void loadSpriteFrames(final TextureMap textureMap, final Resource resource, final int mipmapLevels) throws IOException;
    
    void generateMipmaps(final int mipmaps);
    
    void clearFramesTextureData();
    
    boolean hasAnimationMetadata();
    
    void setFramesTextureData(final List<int[][]> framesTextureData);
    
    int getIndexInMap();
    
    void setIndexInMap(final int indexInMap);
    
    int getAnimationIndex();
    
    void setAnimationIndex(final int animationIndex);
    
    boolean isAnimationActive();
    
    double getSpriteU16(final float u);
    
    double getSpriteV16(final float v);
    
    void bindSpriteTexture();
    
    void deleteSpriteTexture();
    
    float toSingleU(final float u);
    
    float toSingleV(final float v);
    
    List<int[][]> getFramesTextureData();
    
    AnimationMetadataSection getAnimationMetadata();
    
    void setAnimationMetadata(final AnimationMetadataSection animationMetadata);
}
