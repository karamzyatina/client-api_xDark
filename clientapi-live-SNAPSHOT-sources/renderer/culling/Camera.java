package dev.xdark.clientapi.renderer.culling;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.math.*;

@SidedApi(Side.SERVER)
public interface Camera
{
    boolean isBoundingBoxInFrustum(final AxisAlignedBB aabb);
    
    void setPosition(final double x, final double y, final double z);
}
