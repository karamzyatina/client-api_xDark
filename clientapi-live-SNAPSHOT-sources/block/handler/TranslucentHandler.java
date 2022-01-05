package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface TranslucentHandler
{
    boolean isTranslucent(final BlockState state);
}
