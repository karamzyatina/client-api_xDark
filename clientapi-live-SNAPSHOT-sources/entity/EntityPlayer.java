package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.nbt.*;
import com.mojang.authlib.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.inventory.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface EntityPlayer extends EntityLivingBase
{
    public static final DataParameter<Float> ABSORPTION = SideEffects.objectValue();
    public static final DataParameter<Integer> PLAYER_SCORE = SideEffects.objectValue();
    public static final DataParameter<Byte> PLAYER_MODEL_FLAG = SideEffects.objectValue();
    public static final DataParameter<Byte> MAIN_HAND = SideEffects.objectValue();
    public static final DataParameter<NBTTagCompound> LEFT_SHOULDER_ENTITY = SideEffects.objectValue();
    public static final DataParameter<NBTTagCompound> RIGHT_SHOULDER_ENTITY = SideEffects.objectValue();
    
    int getScore();
    
    @SidedApi(Side.SERVER)
    void setScore(final int score);
    
    @SidedApi(Side.SERVER)
    void addScore(final int score);
    
    @SidedApi(Side.SERVER)
    float getArmorVisibility();
    
    boolean isUser();
    
    @SidedApi(Side.SERVER)
    GameProfile getGameProfile();
    
    @SidedApi(Side.SERVER)
    void setGameProfile(final GameProfile gameProfile);
    
    boolean isInBed();
    
    boolean isPlayerSleeping();
    
    boolean isPlayerFullyAsleep();
    
    int getSleepTimer();
    
    @SidedApi(Side.SERVER)
    void addExperience(final int exp);
    
    @SidedApi(Side.SERVER)
    void addExperienceLevel(final int level);
    
    int xpBarCap();
    
    boolean canEat(final boolean force);
    
    boolean shouldHeal();
    
    boolean isAllowEdit();
    
    @SidedApi(Side.SERVER)
    boolean addItemStackToInventory(final ItemStack stack);
    
    boolean isSpectator();
    
    boolean isCreative();
    
    boolean isWearing(final PlayerModelPart part);
    
    boolean hasReducedDebug();
    
    @SidedApi(Side.SERVER)
    void setReducedDebug(final boolean reducedDebug);
    
    @SidedApi(Side.SERVER)
    void setPrimaryHand(final EnumHandSide hand);
    
    @SidedApi(Side.SERVER)
    NBTTagCompound getLeftShoulderEntity();
    
    @SidedApi(Side.SERVER)
    void setLeftShoulderEntity(final NBTTagCompound info);
    
    @SidedApi(Side.SERVER)
    NBTTagCompound getRightShoulderEntity();
    
    @SidedApi(Side.SERVER)
    void setRightShoulderEntity(final NBTTagCompound info);
    
    @SidedApi(Side.SERVER)
    float getCooldownPeriod();
    
    @SidedApi(Side.SERVER)
    void resetCooldown();
    
    float getLuck();
    
    @SidedApi(Side.SERVER)
    void setWearing(final PlayerModelPart part);
    
    InventoryPlayer getInventory();
    
    @SidedApi(Side.SERVER)
    Container getOpenContainer();
    
    int getExperienceLevel();
    
    @SidedApi(Side.SERVER)
    void setExperienceLevel(final int experienceLevel);
    
    int getExperienceTotal();
    
    @SidedApi(Side.SERVER)
    void setExperienceTotal(final int experienceTotal);
    
    float getExperience();
    
    @SidedApi(Side.SERVER)
    void setExperience(final float experience);
    
    FoodStats getFoodStats();
    
    @SidedApi(Side.SERVER)
    void setRenderOffset(final float renderOffsetX, final float renderOffsetY, final float renderOffsetZ);
    
    @SidedApi(Side.SERVER)
    void setRenderOffsetForSleep(final float renderOffsetX, final float renderOffsetZ);
}
