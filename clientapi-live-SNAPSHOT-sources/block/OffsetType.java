package dev.xdark.clientapi.block;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface OffsetType
{
    public static final OffsetType NONE = SideEffects.objectValue();
    public static final OffsetType XZ = SideEffects.objectValue();
    public static final OffsetType XYZ = SideEffects.objectValue();
}
