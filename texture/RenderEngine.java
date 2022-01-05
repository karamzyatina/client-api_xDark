package dev.xdark.clientapi.texture;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import java.awt.image.*;
import java.nio.file.*;

@SidedApi(Side.SERVER)
public interface RenderEngine
{
    boolean loadTexture(final ResourceLocation location, final Texture texture);
    
    ResourceLocation getDynamicTextureLocation(final String name, final DynamicTexture texture);
    
    void deleteTexture(final ResourceLocation location);
    
    void bindTexture(final ResourceLocation location);
    
    void bindTexture(final Texture texture);
    
    Texture newSimpleTexture(final ResourceLocation location);
    
    DynamicTexture newDynamicTexture(final BufferedImage image);
    
    DynamicTexture newDynamicTexture(final int width, final int height);
    
    Texture newImageTexture(final BufferedImage image, final boolean blur, final boolean clamp);
    
    Texture newRemoteTexture(final Path cachePath, final String remoteUrl, final ResourceLocation location);
}
