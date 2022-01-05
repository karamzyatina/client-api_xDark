package dev.xdark.clientapi.world.chunk;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface ExtendedBlockStorage
{
    BlockState get(final int x, final int y, final int z);
    
    void set(final int x, final int y, final int z, final BlockState state);
    
    boolean isEmpty();
    
    int getYLocation();
    
    void setSkyLight(final int x, final int y, final int z, final int value);
    
    int getSkyLight(final int x, final int y, final int z);
    
    void setBlockLight(final int x, final int y, final int z, final int value);
    
    int getBlockLight(final int x, final int y, final int z);
    
    int getBlockRefCount();
}
