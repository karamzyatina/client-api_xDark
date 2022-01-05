package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface SoundRequest
{
    ResourceLocation getSoundLocation();
    
    SoundCategory getCategory();
    
    boolean canRepeat();
    
    int getRepeatDelay();
    
    float getVolume();
    
    float getPitch();
    
    float getPosX();
    
    float getPosY();
    
    float getPosZ();
    
    AttenuationType getAttenuationType();
    
    boolean isStreaming();
    
    @SidedApi(Side.SERVER)
    public interface AttenuationType
    {
        public static final AttenuationType NONE = SideEffects.objectValue();
        public static final AttenuationType LINEAR = SideEffects.objectValue();
    }
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder location(final ResourceLocation location);
        
        Builder category(final SoundCategory category);
        
        Builder repeating(final boolean repeating);
        
        Builder repeatDelay(final int repeatDelay);
        
        Builder volume(final float volume);
        
        Builder pitch(final float pitch);
        
        Builder posX(final float posX);
        
        Builder posY(final float posY);
        
        Builder posZ(final float posZ);
        
        Builder attenuationType(final AttenuationType type);
        
        Builder streaming(final boolean streaming);
        
        SoundRequest build();
    }
}
