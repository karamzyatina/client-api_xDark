package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface TemperatureCategoryProvider
{
    TemperatureCategory getCategory(final Biome biome);
}
