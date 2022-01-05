package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
public interface Rotation
{
    public static final Rotation NONE = SideEffects.objectValue();
    public static final Rotation CLOCKWISE_90 = SideEffects.objectValue();
    public static final Rotation CLOCKWISE_180 = SideEffects.objectValue();
    public static final Rotation COUNTERCLOCKWISE_90 = SideEffects.objectValue();
    
    Rotation add(final Rotation o);
    
    EnumFacing rotate(final EnumFacing facing);
    
    int rotate(final int rot, final int p_rotate_2_);
}
