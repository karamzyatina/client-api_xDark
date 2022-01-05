package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface BlockRenderLayer
{
    public static final BlockRenderLayer SOLID = SideEffects.objectValue();
    public static final BlockRenderLayer CUTOUT_MIPPED = SideEffects.objectValue();
    public static final BlockRenderLayer CUTOUT = SideEffects.objectValue();
    public static final BlockRenderLayer TRANSLUCENT = SideEffects.objectValue();
}
