package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BiomeProperties
{
    String getName();
    
    float getBaseHeight();
    
    float getHeightVariation();
    
    float getTemperature();
    
    float getRainfall();
    
    int getWaterColor();
    
    boolean isSnowEnabled();
    
    boolean isRainEnabled();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder name(final String name);
        
        Builder baseHeight(final float baseHeight);
        
        Builder heightVariation(final float heightVariation);
        
        Builder temperature(final float temperature);
        
        Builder rainfall(final float rainfall);
        
        Builder waterColor(final int waterColor);
        
        Builder enableSnow(final boolean enable);
        
        Builder enableRain(final boolean enable);
        
        BiomeProperties build();
    }
}
