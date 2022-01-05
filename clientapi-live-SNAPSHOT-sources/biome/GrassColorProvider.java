package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface GrassColorProvider
{
    int getColorAt(final Biome biome, final int x, final int y, final int z);
}
