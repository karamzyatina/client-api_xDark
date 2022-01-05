package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;

@SidedApi(Side.SERVER)
public interface SoundHandler
{
    String playSound(final SoundRequest request);
    
    void playDelayedSound(final SoundRequest request, final int delay);
    
    void pauseSounds();
    
    void stopSounds();
    
    void resumeSounds();
    
    void setSoundLevel(final SoundCategory category, final float volume);
    
    void stopSound(final String source);
    
    boolean isSoundPlaying(final String source);
    
    void stop(final ResourceLocation location, final SoundCategory category);
    
    void addListener(final SoundListener listener);
    
    void removeListener(final SoundListener listener);
    
    void setVolume(final String source, final float volume);
    
    void setPitch(final String source, final float pitch);
    
    void setPosition(final String source, final float x, final float y, final float z);
    
    void setAttenuation(final String source, final SoundRequest.AttenuationType type);
    
    void setDistOrRoll(final String source, final float distOrRoll);
    
    void pause(final String source);
    
    void play(final String source);
    
    boolean playing(final String source);
}
