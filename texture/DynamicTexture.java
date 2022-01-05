package dev.xdark.clientapi.texture;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface DynamicTexture extends Texture
{
    void updateDynamicTexture();
    
    int[] getTextureData();
}
