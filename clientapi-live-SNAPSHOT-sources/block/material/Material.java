package dev.xdark.clientapi.block.material;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface Material
{
    public static final Material AIR = SideEffects.objectValue();
    public static final Material GRASS = SideEffects.objectValue();
    public static final Material GROUND = SideEffects.objectValue();
    public static final Material WOOD = SideEffects.objectValue();
    public static final Material ROCK = SideEffects.objectValue();
    public static final Material IRON = SideEffects.objectValue();
    public static final Material ANVIL = SideEffects.objectValue();
    public static final Material WATER = SideEffects.objectValue();
    public static final Material LAVA = SideEffects.objectValue();
    public static final Material LEAVES = SideEffects.objectValue();
    public static final Material PLANTS = SideEffects.objectValue();
    public static final Material VINE = SideEffects.objectValue();
    public static final Material SPONGE = SideEffects.objectValue();
    public static final Material CLOTH = SideEffects.objectValue();
    public static final Material FIRE = SideEffects.objectValue();
    public static final Material SAND = SideEffects.objectValue();
    public static final Material CIRCUITS = SideEffects.objectValue();
    public static final Material CARPET = SideEffects.objectValue();
    public static final Material GLASS = SideEffects.objectValue();
    public static final Material REDSTONE_LIGHT = SideEffects.objectValue();
    public static final Material TNT = SideEffects.objectValue();
    public static final Material CORAL = SideEffects.objectValue();
    public static final Material ICE = SideEffects.objectValue();
    public static final Material PACKED_ICE = SideEffects.objectValue();
    public static final Material SNOW = SideEffects.objectValue();
    public static final Material CRAFTED_SNOW = SideEffects.objectValue();
    public static final Material CACTUS = SideEffects.objectValue();
    public static final Material CLAY = SideEffects.objectValue();
    public static final Material GOURD = SideEffects.objectValue();
    public static final Material DRAGON_EGG = SideEffects.objectValue();
    public static final Material PORTAL = SideEffects.objectValue();
    public static final Material CAKE = SideEffects.objectValue();
    public static final Material WEB = SideEffects.objectValue();
    
    boolean isLiquid();
    
    boolean isSolid();
    
    boolean blocksLight();
    
    boolean blocksMovement();
    
    boolean canBurn();
    
    boolean isReplaceable();
    
    boolean isOpaque();
    
    boolean isToolRequired();
    
    MapColor getMapColor();
    
    PushReaction getPushReaction();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder liquid(final boolean liquid);
        
        Builder solid(final boolean solid);
        
        Builder blocksLight(final boolean blocksLight);
        
        Builder blocksMovement(final boolean blocksMovement);
        
        Builder translucent(final boolean translucent);
        
        Builder burning(final boolean burning);
        
        Builder requiresTool(final boolean requiresTool);
        
        Builder replaceable(final boolean replaceable);
        
        Builder pushReaction(final PushReaction reaction);
        
        Builder color(final MapColor color);
        
        Builder color(final int color);
        
        Material build();
    }
}
