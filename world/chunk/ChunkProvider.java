package dev.xdark.clientapi.world.chunk;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface ChunkProvider
{
    Chunk getLoadedChunk(final int x, final int z);
    
    Chunk provideChunk(final int x, final int z);
    
    Chunk loadChunk(final int x, final int z);
    
    void unload(final int x, final int z);
}
