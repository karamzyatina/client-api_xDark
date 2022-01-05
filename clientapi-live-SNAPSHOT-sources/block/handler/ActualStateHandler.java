package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.world.*;

@SidedApi(Side.SERVER)
public interface ActualStateHandler
{
    BlockState getActualState(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z);
}
