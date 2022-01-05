package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.inventory.*;
import java.util.*;
import dev.xdark.clientapi.potion.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface EntityLivingBase extends Entity
{
    public static final DataParameter<Byte> HAND_STATES = SideEffects.objectValue();
    public static final DataParameter<Float> HEALTH = SideEffects.objectValue();
    public static final DataParameter<Integer> POTION_EFFECTS = SideEffects.objectValue();
    public static final DataParameter<Boolean> HIDE_PARTICLES = SideEffects.objectValue();
    public static final DataParameter<Integer> ARROW_COUNT_IN_ENTITY = SideEffects.objectValue();
    
    float getHealth();
    
    float getMaxHealth();
    
    ItemStack getHeldItemMainhand();
    
    ItemStack getHeldItemOffhand();
    
    ItemStack getItemStackFromSlot(final EntityEquipmentSlot slot);
    
    boolean isHandActive();
    
    EnumHand getActiveHand();
    
    void setActiveHand(final EnumHand hand);
    
    ItemStack getActiveItemStack();
    
    int getItemInUseCount();
    
    int getItemInUseMaxCount();
    
    boolean isActiveItemStackBlocking();
    
    boolean isElytraFlying();
    
    int getTicksElytraFlying();
    
    boolean isChild();
    
    Collection<PotionEffect> getActivePotionEffects();
    
    boolean isPotionActive(final Potion potion);
    
    PotionEffect getActivePotionEffect(final Potion potion);
    
    void addPotionEffect(final PotionEffect effect);
    
    boolean isPotionApplicable(final PotionEffect effect);
    
    boolean isEntityUndead();
    
    PotionEffect removeActivePotionEffect(final Potion potion);
    
    void removePotionEffect(final Potion potion);
    
    void setHealth(final float health);
    
    boolean isOnLadder();
    
    void performHurtAnimation();
    
    int getTotalArmorValue();
    
    int getArrowCountInEntity();
    
    void setArrowCountInEntity(final int arrowCountInEntity);
    
    void swingArm(final EnumHand hand);
    
    ItemStack getHeldItem(final EnumHand hand);
    
    void setHeldItem(final EnumHand hand, final ItemStack stack);
    
    boolean hasItemInSlot(final EntityEquipmentSlot slot);
    
    void setItemInSlot(final EntityEquipmentSlot slot, final ItemStack stack);
    
    void jump();
    
    void travel(final float x, final float y, final float z);
    
    float getAIMoveSpeed();
    
    void setAIMoveSpeed(final float AIMoveSpeed);
    
    void setJumping(final boolean jumping);
    
    boolean canEntityBeSeen(final Entity entity);
    
    float getPrevRenderYawOffset();
    
    void setPrevRenderYawOffset(final float prevRenderYawOffset);
    
    float getRenderYawOffset();
    
    void setRenderYawOffset(final float renderYawOffset);
    
    EnumHandSide getPrimaryHand();
    
    boolean isJumping();
    
    float getPrevRotationYawHead();
    
    void setPrevRotationYawHead(final float prevRotationYawHead);
    
    float getRotationYawHead();
    
    void setRotationYawHead(final float rotationYawHead);
    
    float getAbsorptionAmount();
    
    void setAbsorptionAmount(final float absorptionAmount);
    
    boolean attemptTeleport(final double x, final double y, final double z);
    
    void enableSleepAnimation(final BlockPos pos, final EnumFacing facing);
    
    void disableSleepAnimation();
}
