package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.text.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface PlayerModelPart
{
    public static final PlayerModelPart CAPE = SideEffects.objectValue();
    public static final PlayerModelPart JACKET = SideEffects.objectValue();
    public static final PlayerModelPart LEFT_SLEEVE = SideEffects.objectValue();
    public static final PlayerModelPart RIGHT_SLEEVE = SideEffects.objectValue();
    public static final PlayerModelPart LEFT_PANTS_LEG = SideEffects.objectValue();
    public static final PlayerModelPart RIGHT_PANTS_LEG = SideEffects.objectValue();
    public static final PlayerModelPart HAT = SideEffects.objectValue();
    
    int getMask();
    
    int getId();
    
    String getRawName();
    
    Text getName();
}
