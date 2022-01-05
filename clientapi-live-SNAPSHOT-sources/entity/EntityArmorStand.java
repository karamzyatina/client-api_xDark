package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface EntityArmorStand extends EntityLivingBase
{
    public static final Rotations DEFAULT_HEAD_ROTATION = SideEffects.objectValue();
    public static final Rotations DEFAULT_BODY_ROTATION = SideEffects.objectValue();
    public static final Rotations DEFAULT_LEFTARM_ROTATION = SideEffects.objectValue();
    public static final Rotations DEFAULT_RIGHTARM_ROTATION = SideEffects.objectValue();
    public static final Rotations DEFAULT_LEFTLEG_ROTATION = SideEffects.objectValue();
    public static final Rotations DEFAULT_RIGHTLEG_ROTATION = SideEffects.objectValue();
    public static final DataParameter<Byte> STATUS = SideEffects.objectValue();
    public static final DataParameter<Rotations> BODY_ROTATION = SideEffects.objectValue();
    public static final DataParameter<Rotations> LEFT_ARM_ROTATION = SideEffects.objectValue();
    public static final DataParameter<Rotations> RIGHT_ARM_ROTATION = SideEffects.objectValue();
    public static final DataParameter<Rotations> LEFT_LEG_ROTATION = SideEffects.objectValue();
    public static final DataParameter<Rotations> RIGHT_LEG_ROTATION = SideEffects.objectValue();
    
    void setSmall(final boolean small);
    
    boolean isSmall();
    
    void setShowArms(final boolean showArms);
    
    boolean shouldShowArms();
    
    void setNoBasePlate(final boolean noBasePlate);
    
    boolean hasNoBasePlate();
    
    void setMarker(final boolean marker);
    
    boolean hasMarker();
    
    void setHeadRotation(final Rotations rotations);
    
    void setBodyRotation(final Rotations rotations);
    
    void setLeftArmRotation(final Rotations rotations);
    
    void setRightArmRotation(final Rotations rotations);
    
    void setLeftLegRotation(final Rotations rotations);
    
    void setRightLegRotation(final Rotations rotations);
    
    Rotations getHeadRotation();
    
    Rotations getBodyRotation();
    
    Rotations getLeftArmRotation();
    
    Rotations getRightArmRotation();
    
    Rotations getLeftLegRotation();
    
    Rotations getRightLegRotation();
}
