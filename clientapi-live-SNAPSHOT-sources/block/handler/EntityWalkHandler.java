package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.entity.*;

@SidedApi(Side.SERVER)
public interface EntityWalkHandler
{
    void onEntityWalk(final Block block, final World world, final int x, final int y, final int z, final Entity entity);
}
