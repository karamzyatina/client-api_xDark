package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.block.material.*;

@SidedApi(Side.SERVER)
public interface PushReactionHandler
{
    PushReaction getPushReaction(final BlockState state);
}
