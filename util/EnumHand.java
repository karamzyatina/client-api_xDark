package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface EnumHand
{
    public static final EnumHand MAIN_HAND = SideEffects.objectValue();
    public static final EnumHand OFF_HAND = SideEffects.objectValue();
}
