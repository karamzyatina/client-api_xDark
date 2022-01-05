package dev.xdark.clientapi.world;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.text.*;

@SidedApi(Side.BOTH)
public interface WorldNameable
{
    String getName();
    
    boolean hasCustomName();
    
    Text getDisplayName();
}
