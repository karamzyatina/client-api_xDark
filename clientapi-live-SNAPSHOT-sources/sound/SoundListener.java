package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface SoundListener
{
    void soundPlay(final String source);
    
    void soundStop(final String source);
}
