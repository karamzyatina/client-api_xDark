package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;

@SidedApi(Side.SERVER)
public interface BlockPlacementCheckHandler
{
    boolean canPlaceBlockAt(final Block block, final World world, final int x, final int y, final int z);
}
