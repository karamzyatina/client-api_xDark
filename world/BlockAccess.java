package dev.xdark.clientapi.world;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.tile.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.biome.*;

@SidedApi(Side.BOTH)
public interface BlockAccess
{
    @SidedApi(Side.SERVER)
    TileEntity getTileEntity(final int x, final int y, final int z);
    
    int getCombinedLight(final int x, final int y, final int z, final int dflt);
    
    @SidedApi(Side.SERVER)
    BlockState getBlockState(final double x, final double y, final double z);
    
    @SidedApi(Side.SERVER)
    BlockState getBlockState(final int x, final int y, final int z);
    
    @SidedApi(Side.SERVER)
    boolean isAirBlock(final int x, final int y, final int z);
    
    @SidedApi(Side.SERVER)
    Biome getBiome(final int x, final int y, final int z);
}
