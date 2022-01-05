package dev.xdark.clientapi.block;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.sound.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface SoundType
{
    public static final SoundType WOOD = SideEffects.objectValue();
    public static final SoundType GROUND = SideEffects.objectValue();
    public static final SoundType PLANT = SideEffects.objectValue();
    public static final SoundType STONE = SideEffects.objectValue();
    public static final SoundType METAL = SideEffects.objectValue();
    public static final SoundType GLASS = SideEffects.objectValue();
    public static final SoundType CLOTH = SideEffects.objectValue();
    public static final SoundType SAND = SideEffects.objectValue();
    public static final SoundType SNOW = SideEffects.objectValue();
    public static final SoundType LADDER = SideEffects.objectValue();
    public static final SoundType ANVIL = SideEffects.objectValue();
    public static final SoundType SLIME = SideEffects.objectValue();
    
    float getVolume();
    
    float getPitch();
    
    SoundEvent getBreakSound();
    
    SoundEvent getStepSound();
    
    SoundEvent getPlaceSound();
    
    SoundEvent getHitSound();
    
    SoundEvent getFallSound();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder volume(final float volume);
        
        Builder pitch(final float pitch);
        
        Builder breakSound(final SoundEvent event);
        
        Builder stepSound(final SoundEvent event);
        
        Builder placeSound(final SoundEvent event);
        
        Builder hitSound(final SoundEvent event);
        
        Builder fallSound(final SoundEvent event);
        
        SoundType build();
    }
}
