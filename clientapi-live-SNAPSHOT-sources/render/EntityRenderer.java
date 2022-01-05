package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.renderer.culling.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.entity.*;

@SidedApi(Side.SERVER)
public interface EntityRenderer
{
    void disableLightmap();
    
    void enableLightmap();
    
    void drawNameplate(final FontRenderer fontRenderer, final String name, final float x, final float y, final float z, final int verticalShift, final float viewerYaw, final float viewerPitch, final boolean isThirdPersonFrontal, final boolean isSneaking);
    
    void drawNameplate(final Object entity, final FontRenderer fontRenderer, final String name, final float x, final float y, final float z, final int verticalShift, final float viewerYaw, final float viewerPitch, final boolean isThirdPersonFrontal, final boolean isSneaking);
    
    Camera getCamera();
    
    boolean loadShader(final ResourceLocation location);
    
    boolean setFxaaShader(final int shader);
    
    float getNightVisionBrightness(final EntityLivingBase entity, final float partialTicks);
    
    void setupOverlayRendering();
    
    boolean isShaderActive();
    
    void stopUseShader();
    
    void switchUseShader();
}
