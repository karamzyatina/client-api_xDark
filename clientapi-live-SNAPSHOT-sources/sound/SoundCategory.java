package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface SoundCategory
{
    public static final SoundCategory MASTER = SideEffects.objectValue();
    public static final SoundCategory MUSIC = SideEffects.objectValue();
    public static final SoundCategory RECORDS = SideEffects.objectValue();
    public static final SoundCategory WEATHER = SideEffects.objectValue();
    public static final SoundCategory BLOCKS = SideEffects.objectValue();
    public static final SoundCategory HOSTIL = SideEffects.objectValue();
    public static final SoundCategory NEUTRAL = SideEffects.objectValue();
    public static final SoundCategory PLAYERS = SideEffects.objectValue();
    public static final SoundCategory AMBIENT = SideEffects.objectValue();
    public static final SoundCategory VOICE = SideEffects.objectValue();
    
    String getName();
}
