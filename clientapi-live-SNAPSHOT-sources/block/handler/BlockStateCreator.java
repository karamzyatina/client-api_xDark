package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface BlockStateCreator
{
    BlockStateContainer createBlockState(final Block block);
}
