package dev.xdark.clientapi.block;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.resource.*;

@SidedApi(Side.SERVER)
public interface BlockRegistry
{
    Block getBlock(final int id);
    
    BlockState getState(final int id);
    
    Block getBlock(final String idOrLocation);
    
    void register(final int id, final ResourceLocation location, final Block block);
}
