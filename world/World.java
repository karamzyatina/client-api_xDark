package dev.xdark.clientapi.world;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.tile.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.sound.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.biome.*;
import dev.xdark.clientapi.world.chunk.*;

@SidedApi(Side.BOTH)
public interface World extends BlockAccess
{
    boolean canSeeSky(final int x, final int y, final int z);
    
    int getLight(final int x, final int y, final int z);
    
    int getLight(final int x, final int y, final int z, final boolean checkNeighbours);
    
    int getHeight(final int x, final int z);
    
    int getChunksLowestHorizon(final int x, final int z);
    
    int getCombinedLight(final int x, final int y, final int z, final int value);
    
    float getLightBrightness(final int x, final int y, final int z);
    
    float getStarBrightness(final float partialTicks);
    
    long getTotalTime();
    
    long getTime();
    
    boolean isThundering();
    
    boolean isRaining();
    
    boolean isRainingAt(final int x, final int y, final int z);
    
    double getHorizon();
    
    int getDimension();
    
    @SidedApi(Side.SERVER)
    boolean spawnEntity(final Entity entity);
    
    @SidedApi(Side.SERVER)
    void removeEntity(final Entity entity);
    
    @SidedApi(Side.SERVER)
    TileEntity getTileEntity(final int x, final int y, final int z);
    
    @SidedApi(Side.SERVER)
    ChunkProvider getChunkProvider();
    
    @SidedApi(Side.SERVER)
    void spawnParticle(final ParticleType type, final boolean isLongDistance, final double x, final double y, final double z, final double motionX, final double motionY, final double motionZ, final int... data);
    
    @SidedApi(Side.SERVER)
    void setTime(final long time);
    
    @SidedApi(Side.SERVER)
    void playSound(final double x, final double y, final double z, final SoundEvent event, final SoundCategory category, final float volume, final float pitch, final boolean checkDistance);
    
    @SidedApi(Side.SERVER)
    boolean addWeatherEffect(final EntityWeatherEffect weatherEffect);
    
    @SidedApi(Side.SERVER)
    void removeWeatherEffect(final EntityWeatherEffect weatherEffect);
    
    @SidedApi(Side.SERVER)
    float getThunderStrength(final float delta);
    
    @SidedApi(Side.SERVER)
    void setThunderStrength(final float thunderingStrength);
    
    @SidedApi(Side.SERVER)
    float getRainStrength(final float delta);
    
    @SidedApi(Side.SERVER)
    void setRainStrength(final float rainingStrength);
    
    @SidedApi(Side.SERVER)
    Entity getEntity(final int id);
    
    @SidedApi(Side.SERVER)
    void markBlockRangeForRenderUpdate(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2);
    
    int getHeight();
    
    @SidedApi(Side.SERVER)
    void setBiome(final int x, final int z, final Biome biome);
    
    @SidedApi(Side.SERVER)
    Chunk getChunk(final int x, final int z);
    
    @SidedApi(Side.SERVER)
    boolean isChunkGeneratedAt(final int x, final int z);
}
