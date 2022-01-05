package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.network.*;
import dev.xdark.clientapi.resource.*;

@SidedApi(Side.BOTH)
public interface AbstractClientPlayer extends EntityPlayer
{
    boolean hasPlayerInfo();
    
    NetworkPlayerInfo getPlayerInfo();
    
    @SidedApi(Side.SERVER)
    void setPlayerInfo(final NetworkPlayerInfo playerInfo);
    
    boolean hasSkin();
    
    ResourceLocation getLocationSkin();
    
    ResourceLocation getLocationCape();
    
    ResourceLocation getLocationElytra();
    
    String getSkinType();
    
    @SidedApi(Side.SERVER)
    float getFovModifier();
    
    boolean hasElytraCape();
}
