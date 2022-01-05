package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface SkyColorProvider
{
    int getSkyColorByTemperature(final Biome biome, final float temperature);
}
