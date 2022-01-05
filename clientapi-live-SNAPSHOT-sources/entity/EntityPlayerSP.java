package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.inventory.*;

@SidedApi(Side.BOTH)
public interface EntityPlayerSP extends AbstractClientPlayer
{
    @SidedApi(Side.SERVER)
    String getServerBrand();
    
    @SidedApi(Side.SERVER)
    int getPermissionLevel();
    
    @SidedApi(Side.SERVER)
    void setXPStats(final float currentXP, final int maxXP, final int level);
    
    boolean isRidingHorse();
    
    boolean isCurrentViewEntity();
    
    boolean isRowingBoat();
    
    boolean isAutoJumpEnabled();
    
    @SidedApi(Side.SERVER)
    int displayContainerMenu(final ContainerLocalMenu menu);
    
    @SidedApi(Side.SERVER)
    void closeScreen();
    
    float getHealth();
    
    float getMaxHealth();
}
