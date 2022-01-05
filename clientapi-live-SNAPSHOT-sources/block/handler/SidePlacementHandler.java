package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface SidePlacementHandler
{
    boolean canPlaceBlockOnSide(final Block block, final World world, final int x, final int y, final int z, final EnumFacing facing);
}
