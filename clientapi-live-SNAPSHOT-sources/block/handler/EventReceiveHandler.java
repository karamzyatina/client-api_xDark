package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.world.*;

@SidedApi(Side.SERVER)
public interface EventReceiveHandler
{
    boolean eventReceived(final BlockState state, final World world, final int x, final int y, final int z, final int id, final int param);
}
