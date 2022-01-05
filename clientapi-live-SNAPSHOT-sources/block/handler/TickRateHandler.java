package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;

@SidedApi(Side.SERVER)
public interface TickRateHandler
{
    int tickRate(final Block block, final World world);
}
