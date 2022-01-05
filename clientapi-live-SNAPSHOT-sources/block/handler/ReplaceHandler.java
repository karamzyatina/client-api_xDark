package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;

@SidedApi(Side.SERVER)
public interface ReplaceHandler
{
    boolean isReplaceable(final Block block, final BlockAccess blockAccess, final BlockPos pos);
}
