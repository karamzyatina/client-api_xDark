package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface ParticleType
{
    public static final ParticleType EXPLOSION_NORMAL = SideEffects.objectValue();
    public static final ParticleType EXPLOSION_LARGE = SideEffects.objectValue();
    public static final ParticleType EXPLOSION_HUGE = SideEffects.objectValue();
    public static final ParticleType FIREWORKS_SPARK = SideEffects.objectValue();
    public static final ParticleType WATER_BUBBLE = SideEffects.objectValue();
    public static final ParticleType WATER_SPLASH = SideEffects.objectValue();
    public static final ParticleType WATER_WAKE = SideEffects.objectValue();
    public static final ParticleType SUSPENDED = SideEffects.objectValue();
    public static final ParticleType SUSPENDED_DEPTH = SideEffects.objectValue();
    public static final ParticleType CRIT = SideEffects.objectValue();
    public static final ParticleType CRIT_MAGIC = SideEffects.objectValue();
    public static final ParticleType SMOKE_NORMAL = SideEffects.objectValue();
    public static final ParticleType SMOKE_LARGE = SideEffects.objectValue();
    public static final ParticleType SPELL = SideEffects.objectValue();
    public static final ParticleType SPELL_INSTANT = SideEffects.objectValue();
    public static final ParticleType SPELL_MOB = SideEffects.objectValue();
    public static final ParticleType SPELL_MOB_AMBIENT = SideEffects.objectValue();
    public static final ParticleType SPELL_WITCH = SideEffects.objectValue();
    public static final ParticleType DRIP_WATER = SideEffects.objectValue();
    public static final ParticleType DRIP_LAVA = SideEffects.objectValue();
    public static final ParticleType VILLAGER_ANGRY = SideEffects.objectValue();
    public static final ParticleType VILLAGER_HAPPY = SideEffects.objectValue();
    public static final ParticleType TOWN_AURA = SideEffects.objectValue();
    public static final ParticleType NOTE = SideEffects.objectValue();
    public static final ParticleType PORTAL = SideEffects.objectValue();
    public static final ParticleType ENCHANTMENT_TABLE = SideEffects.objectValue();
    public static final ParticleType FLAME = SideEffects.objectValue();
    public static final ParticleType LAVA = SideEffects.objectValue();
    public static final ParticleType FOOTSTEP = SideEffects.objectValue();
    public static final ParticleType CLOUD = SideEffects.objectValue();
    public static final ParticleType REDSTONE = SideEffects.objectValue();
    public static final ParticleType SNOWBALL = SideEffects.objectValue();
    public static final ParticleType SNOW_SHOVEL = SideEffects.objectValue();
    public static final ParticleType SLIME = SideEffects.objectValue();
    public static final ParticleType HEART = SideEffects.objectValue();
    public static final ParticleType BARRIER = SideEffects.objectValue();
    public static final ParticleType ITEM_CRACK = SideEffects.objectValue();
    public static final ParticleType BLOCK_CRACK = SideEffects.objectValue();
    public static final ParticleType BLOCK_DUST = SideEffects.objectValue();
    public static final ParticleType WATER_DROP = SideEffects.objectValue();
    public static final ParticleType ITEM_TAKE = SideEffects.objectValue();
    public static final ParticleType MOB_APPEARANCE = SideEffects.objectValue();
    public static final ParticleType DRAGON_BREATH = SideEffects.objectValue();
    public static final ParticleType END_ROD = SideEffects.objectValue();
    public static final ParticleType DAMAGE_INDICATOR = SideEffects.objectValue();
    public static final ParticleType SWEEP_ATTACK = SideEffects.objectValue();
    public static final ParticleType FALLING_DUST = SideEffects.objectValue();
    public static final ParticleType TOTEM = SideEffects.objectValue();
    public static final ParticleType SPIT = SideEffects.objectValue();
    
    int getId();
    
    String getName();
    
    boolean ignoresRange();
    
    int getArgumentCount();
}
