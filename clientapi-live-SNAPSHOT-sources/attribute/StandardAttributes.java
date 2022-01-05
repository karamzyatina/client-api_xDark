package dev.xdark.clientapi.attribute;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public final class StandardAttributes
{
    public static final Attribute MAX_HEALTH;
    public static final Attribute FOLLOW_RANGE;
    public static final Attribute KNOCKBACK_RESISTANCE;
    public static final Attribute MOVEMENT_SPEED;
    public static final Attribute FLYING_SPEED;
    public static final Attribute ATTACK_DAMAGE;
    public static final Attribute ATTACK_SPEED;
    public static final Attribute ARMOR;
    public static final Attribute ARMOR_TOUGHNESS;
    public static final Attribute LUCK;
    
    private StandardAttributes() {
    }
    
    static {
        MAX_HEALTH = SideEffects.objectValue();
        FOLLOW_RANGE = SideEffects.objectValue();
        KNOCKBACK_RESISTANCE = SideEffects.objectValue();
        MOVEMENT_SPEED = SideEffects.objectValue();
        FLYING_SPEED = SideEffects.objectValue();
        ATTACK_DAMAGE = SideEffects.objectValue();
        ATTACK_SPEED = SideEffects.objectValue();
        ARMOR = SideEffects.objectValue();
        ARMOR_TOUGHNESS = SideEffects.objectValue();
        LUCK = SideEffects.objectValue();
    }
}
