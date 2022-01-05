package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.block.material.*;

@SidedApi(Side.SERVER)
public interface MapColorHandler
{
    MapColor getMapColor(final BlockState state, final BlockAccess blockAccess, final BlockPos pos);
}
