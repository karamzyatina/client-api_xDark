package dev.xdark.clientapi.renderer.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.renderer.culling.*;

@SidedApi(Side.SERVER)
public interface RenderManager
{
    void setPosition(final double x, final double y, final double z);
    
     <T extends Entity> Render<T> getEntityRender(final T entity);
    
    void setPlayerViewY(final float playerViewY);
    
    boolean shouldRenderShadow();
    
    void setRenderShadow(final boolean renderShadow);
    
    void setDebugBoundingBox(final boolean debugBoundingBox);
    
    boolean isDebugBoundingBox();
    
    boolean isRenderMultipass(final Entity entity);
    
    boolean shouldRender(final Entity entity, final Camera camera, final double camX, final double camY, final double camZ);
    
    void renderEntityStatic(final Entity entity, final float partialTicks, final boolean skipDebugBox);
    
    void renderEntity(final Entity entity, final double x, final double y, final double z, final float yaw, final float pitch, final boolean skipDebugBox);
    
    void renderDebugBoundingBox(final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks);
    
    double getDistanceToCamera(final double x, final double y, final double z);
    
    void setRenderOutlines(final boolean renderOutlines);
}
