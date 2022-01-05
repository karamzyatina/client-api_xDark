package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface Mirror
{
    public static final Mirror NONE = SideEffects.objectValue();
    public static final Mirror LEFT_RIGHT = SideEffects.objectValue();
    public static final Mirror FRONT_BACK = SideEffects.objectValue();
    
    int mirrorRotation(final int rotation, final int count);
    
    Rotation toRotation(final EnumFacing facing);
    
    EnumFacing mirror(final EnumFacing facing);
}
