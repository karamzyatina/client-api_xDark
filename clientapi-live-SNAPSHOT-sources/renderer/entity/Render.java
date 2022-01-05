package dev.xdark.clientapi.renderer.entity;

import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.*;
import dev.xdark.clientapi.renderer.culling.*;

@SidedApi(Side.SERVER)
public interface Render<T extends Entity>
{
    void setRenderOutlines(final boolean renderOutlines);
    
    boolean shouldRender(final T entity, final Camera camera, final double x, final double y, final double z);
    
    void doRender(final T entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks);
    
    boolean isMultipass();
    
    void renderMultipass(final T entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks);
}
