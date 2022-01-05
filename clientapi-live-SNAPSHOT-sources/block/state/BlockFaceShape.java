package dev.xdark.clientapi.block.state;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BlockFaceShape
{
    public static final BlockFaceShape SOLID = SideEffects.objectValue();
    public static final BlockFaceShape BOWL = SideEffects.objectValue();
    public static final BlockFaceShape CENTER_SMALL = SideEffects.objectValue();
    public static final BlockFaceShape MIDDLE_POLE_THIN = SideEffects.objectValue();
    public static final BlockFaceShape CENTER = SideEffects.objectValue();
    public static final BlockFaceShape MIDDLE_POLE = SideEffects.objectValue();
    public static final BlockFaceShape CENTER_BIG = SideEffects.objectValue();
    public static final BlockFaceShape MIDDLE_POLE_THICK = SideEffects.objectValue();
    public static final BlockFaceShape UNDEFINED = SideEffects.objectValue();
}
