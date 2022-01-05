package dev.xdark.clientapi.biome;

public interface BiomeRegistry
{
    Biome getById(final int id);
    
    Biome getByInternalName(final String internalName);
    
    void register(final int id, final String internalName, final Biome biome);
}
