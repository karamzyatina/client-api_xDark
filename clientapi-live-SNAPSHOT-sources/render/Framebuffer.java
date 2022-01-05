package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface Framebuffer
{
    default Framebuffer create(final int width, final int height, final boolean useDepth, final Tessellator tessellator) {
        throw CompileStub.create();
    }
    
    void createBindFramebuffer(final int width, final int height);
    
    void deleteFramebuffer();
    
    void createFramebuffer(final int width, final int height);
    
    void setFramebufferFilter(final int framebufferFilterIn);
    
    void checkFramebufferComplete();
    
    void bindFramebufferTexture();
    
    void unbindFramebufferTexture();
    
    void bindFramebuffer(final boolean viewport);
    
    void unbindFramebuffer();
    
    void setFramebufferColor(final float red, final float green, final float blue, final float alpha);
    
    void framebufferRender(final int width, final int height);
    
    void framebufferRenderExt(final int width, final int height, final boolean material);
    
    void framebufferClear();
}
