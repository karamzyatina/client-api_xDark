package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.text.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.world.*;
import java.util.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface Entity
{
    public static final DataParameter<Byte> FLAGS = SideEffects.objectValue();
    public static final DataParameter<Integer> AIR = SideEffects.objectValue();
    public static final DataParameter<String> CUSTOM_NAME = SideEffects.objectValue();
    public static final DataParameter<Boolean> CUSTOM_NAME_VISIBLE = SideEffects.objectValue();
    public static final DataParameter<Boolean> SILENT = SideEffects.objectValue();
    public static final DataParameter<Boolean> NO_GRAVITY = SideEffects.objectValue();
    
    int getEntityId();
    
    void setEntityId(final int entityId);
    
    UUID getUniqueID();
    
    Text getDisplayName();
    
    String getDisplayNameForRendering();
    
    String getName();
    
    boolean hasCustomName();
    
    String getCustomNameTag();
    
    boolean getAlwaysRenderNameTag();
    
    double getLastX();
    
    double getPrevX();
    
    double getX();
    
    double getLastY();
    
    double getPrevY();
    
    double getY();
    
    double getLastZ();
    
    double getPrevZ();
    
    double getZ();
    
    float getRotationYaw();
    
    float getRotationPitch();
    
    float getPrevRotationYaw();
    
    float getPrevRotationPitch();
    
    double getMotionX();
    
    double getMotionY();
    
    double getMotionZ();
    
    boolean isOnGround();
    
    float getEyeHeight();
    
    void setMotion(final double x, final double y, final double z);
    
    void setMotionX(final double x);
    
    void setMotionY(final double y);
    
    void setMotionZ(final double z);
    
    void teleport(final double x, final double y, final double z);
    
    void setAngle(final float yaw, final float pitch);
    
    void setYaw(final float yaw);
    
    void setPitch(final float pitch);
    
    void setSize(final float width, final float height);
    
    EntityDataManager getDataManager();
    
    void turn(final float yaw, final float pitch);
    
    void setFire(final int ticks);
    
    void extinguish();
    
    boolean isSilent();
    
    void setSilent(final boolean silent);
    
    boolean hasNoGravity();
    
    void setNoGravity(final boolean noGravity);
    
    boolean isImmuneToFire();
    
    boolean isWet();
    
    boolean isInWater();
    
    boolean isInLava();
    
    int getBrightnessForRender();
    
    float getBrightness();
    
    Vec3d getVectorForRotation(final float yaw, final float pitch);
    
    RayTraceResult rayTrace(final double distance, final float partialTicks);
    
    boolean isEntityAlive();
    
    boolean isEntityInsideOpaqueBlock();
    
    double getYOffset();
    
    double getMountedYOffset();
    
    boolean startRiding(final Entity entity1, final boolean force);
    
    boolean canBeRidden(final Entity entity);
    
    void removePassengers();
    
    void dismountRidingEntity();
    
    void addPassenger(final Entity entity);
    
    void removePassenger(final Entity entity);
    
    boolean canFitPassenger(final Entity entity);
    
    Vec3d getLookVec();
    
    Vec3d getForward();
    
    Iterable<ItemStack> getHeldEquipment();
    
    Iterable<ItemStack> getArmorInventoryList();
    
    Iterable<ItemStack> getEquipmentAndArmor();
    
    boolean isBurning();
    
    boolean isRiding();
    
    boolean isBeingRidden();
    
    boolean isSneaking();
    
    void setSneaking(final boolean sneaking);
    
    boolean isSprinting();
    
    void setSprinting(final boolean sprinting);
    
    boolean isGlowing();
    
    void setGlowing(final boolean glowing);
    
    boolean isInvisible();
    
    void setInvisible(final boolean invisible);
    
    int getAir();
    
    void setAir(final int air);
    
    void setInWeb();
    
    Entity[] getParts();
    
    String getCachedUniqueIdString();
    
    void setCustomNameTag(final String customNameTag);
    
    void setAlwaysRenderNameTag(final boolean alwaysRenderNameTag);
    
    boolean getAlwaysRenderNameTagForRender();
    
    EnumFacing getHorizontalFacing();
    
    EnumFacing getAdjustedHorizontalFacing();
    
    HoverEvent getHoverEvent();
    
    boolean isImmuneToExplosions();
    
    List<Entity> getPassengers();
    
    boolean isPassenger(final Entity entity);
    
    Collection<Entity> getRecursivePassengers();
    
    Entity getLowestRidingEntity();
    
    boolean isRidingSameEntity(final Entity entity);
    
    boolean isRidingOrBeingRiddenBy(final Entity entity);
    
    Entity getRidingEntity();
    
    AxisAlignedBB getEntityBoundingBox();
    
    AxisAlignedBB getRenderBoundingBox();
    
    void setEntityBoundingBox(final AxisAlignedBB aabb);
    
    void setUniqueId(final UUID uniqueId);
    
    Entity getRenderingEntity();
    
    void setRenderingEntity(final Entity entity);
    
    World getWorld();
    
    void setGlowColor(final int color);
    
    OptionalInt getGlowColor();
    
    void clearGlowColor();
    
    ResourceLocation getRenderTexture();
    
    void setRenderTexture(final ResourceLocation location);
    
    void enableRidingAnimation();
    
    void disableRidingAnimation();
}
