package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface EnumHandSide
{
    public static final EnumHandSide LEFT = SideEffects.objectValue();
    public static final EnumHandSide RIGHT = SideEffects.objectValue();
    
    EnumHandSide opposite();
}
