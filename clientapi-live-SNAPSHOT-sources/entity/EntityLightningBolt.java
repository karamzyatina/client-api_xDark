package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface EntityLightningBolt extends EntityWeatherEffect
{
    int getState();
    
    void setState(final int state);
    
    long getBoltVertex();
    
    void setBoltVertex(final long boltVertex);
    
    int getBoltLivingTime();
    
    void setBoltLivingTime(final int boltLivingTime);
}
