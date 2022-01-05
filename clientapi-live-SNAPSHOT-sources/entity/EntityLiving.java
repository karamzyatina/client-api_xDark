package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface EntityLiving extends EntityLivingBase
{
    public static final DataParameter<Byte> AI_FLAGS = SideEffects.objectValue();
    
    int getTalkInterval();
    
    void playLivingSound();
    
    void spawnExplosionParticle();
    
    void setMoveForward(final float moveForward);
    
    void setMoveVertical(final float moveVertical);
    
    void setMoveStrafing(final float moveStrafing);
    
    boolean canEquipItem(final ItemStack item);
    
    boolean canDespawn();
    
    void despawnEntity();
    
    int getVerticalFaceSpeed();
    
    int getHorizontalFaceSpeed();
    
    void faceEntity(final Entity entity, final float maxYaw, final float maxPitch);
    
    boolean isNotColliding();
    
    boolean canBeSteered();
    
    boolean getLeashed();
    
    Entity getLeashHolder();
    
    void setNoAI(final boolean noAI);
    
    void setLeftHanded(final boolean leftHanded);
    
    boolean isAIDisabled();
    
    boolean isLeftHanded();
}
