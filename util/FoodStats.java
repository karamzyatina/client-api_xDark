package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public interface FoodStats
{
    @SidedApi(Side.SERVER)
    void addStats(final int foodLevel, final float foodSaturationLevel);
    
    int getFoodLevel();
    
    boolean needFood();
    
    @SidedApi(Side.SERVER)
    void addExhaustion(final float exhaustion);
    
    float getSaturationLevel();
    
    @SidedApi(Side.SERVER)
    void setFoodLevel(final int foodLevel);
    
    @SidedApi(Side.SERVER)
    void setFoodSaturationLevel(final float foodSaturationLevel);
}
