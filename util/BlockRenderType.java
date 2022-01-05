package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface BlockRenderType
{
    public static final BlockRenderType INVISIBLE = SideEffects.objectValue();
    public static final BlockRenderType LIQUID = SideEffects.objectValue();
    public static final BlockRenderType ENTITYBLOCK_ANIMATED = SideEffects.objectValue();
    public static final BlockRenderType MODEL = SideEffects.objectValue();
}
