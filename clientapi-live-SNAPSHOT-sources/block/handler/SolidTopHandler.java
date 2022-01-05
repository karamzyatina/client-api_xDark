package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface SolidTopHandler
{
    boolean isTopSolid(final BlockState state);
}
