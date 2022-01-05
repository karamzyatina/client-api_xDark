package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.math.*;

@SidedApi(Side.SERVER)
public interface AccelerationModificationHandler
{
    Vec3d modifyAcceleration(final Block block, final World world, final int x, final int y, final int z, final Entity entity, final Vec3d acceleration);
}
