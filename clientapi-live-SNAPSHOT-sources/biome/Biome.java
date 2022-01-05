package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface Biome
{
    int getSkyColorByTemperature(final float temperature);
    
    boolean canSnow();
    
    boolean canRain();
    
    boolean isHighHumidity();
    
    float getTemperature(final int x, final int y, final int z);
    
    int getGrassColorAtPos(final int x, final int y, final int z);
    
    int getFoliageColorAtPos(final int x, final int y, final int z);
    
    TemperatureCategory getTempCategory();
    
    float getBaseHeight();
    
    float getRainfall();
    
    int getId();
    
    String getName();
    
    float getHeightVariation();
    
    float getDefaultTemperature();
    
    int getWaterColor();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder properties(final BiomeProperties properties);
        
        Builder skyColorProvider(final SkyColorProvider skyColorProvider);
        
        Builder temperatureProvider(final TemperatureProvider temperatureProvider);
        
        Builder grassColorProvider(final GrassColorProvider grassColorProvider);
        
        Builder foliageColorProvider(final FoliageColorProvider foliageColorProvider);
        
        Builder temperatureCategoryProvider(final TemperatureCategoryProvider temperatureCategoryProvider);
        
        Builder waterColorProvider(final WaterColorProvider waterColorProvider);
        
        Biome build();
    }
}
