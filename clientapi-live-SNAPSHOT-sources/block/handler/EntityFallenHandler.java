package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.entity.*;

public interface EntityFallenHandler
{
    void onFallenUpon(final Block block, final World world, final int x, final int y, final int z, final Entity entity, final float fallDistance);
}
