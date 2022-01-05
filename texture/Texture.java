package dev.xdark.clientapi.texture;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import java.io.*;

@SidedApi(Side.SERVER)
public interface Texture
{
    void setBlurMipmap(final boolean blur, final boolean mipmap);
    
    void restoreLastBlurMipmap();
    
    void loadTexture(final ResourceManager resourceManager) throws IOException;
    
    int getGlTextureId();
    
    void deleteGlTexture();
}
