package dev.xdark.clientapi.world;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface GameMode
{
    public static final GameMode SURVIVAL = SideEffects.objectValue();
    public static final GameMode CREATIVE = SideEffects.objectValue();
    public static final GameMode ADVENTURE = SideEffects.objectValue();
    public static final GameMode SPECTATOR = SideEffects.objectValue();
    
    int getId();
    
    String getName();
    
    boolean hasLimitedInteractions();
}
