package dev.xdark.clientapi.world.chunk;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.world.*;

@SidedApi(Side.SERVER)
public interface Chunk
{
    int getX();
    
    int getZ();
    
    long getKey();
    
    int getTopFilledSegment();
    
    ExtendedBlockStorage[] getBlockStorageArray();
    
    BlockState getBlockState(final int x, final int y, final int z);
    
    BlockState setBlockState(final BlockPos pos, final BlockState state);
    
    boolean isEmpty();
    
    World getWorld();
    
    byte[] getBiomeArray();
    
    void setBiomeArray(final byte[] biomeArray);
}
