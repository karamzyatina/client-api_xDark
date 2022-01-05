package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface WaterColorProvider
{
    int getColor(final Biome biome);
}
