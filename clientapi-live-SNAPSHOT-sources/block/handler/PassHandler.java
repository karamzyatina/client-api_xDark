package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;

@SidedApi(Side.SERVER)
public interface PassHandler
{
    boolean isPassable(final Block block, final BlockAccess blockAccess, final int x, final int y, final int z);
}
