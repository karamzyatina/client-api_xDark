package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;

@SidedApi(Side.SERVER)
public interface CollidableHandler
{
    boolean isCollideable(final Block block);
}
