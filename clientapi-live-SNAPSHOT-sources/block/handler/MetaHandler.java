package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface MetaHandler
{
    BlockState getStateFromMeta(final Block block, final int meta);
    
    int getMetaFromState(final BlockState state);
}
