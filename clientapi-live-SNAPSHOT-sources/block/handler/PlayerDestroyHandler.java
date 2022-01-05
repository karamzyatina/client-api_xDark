package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface PlayerDestroyHandler
{
    void onPlayerDestroy(final World world, final BlockPos pos, final BlockState state);
}
