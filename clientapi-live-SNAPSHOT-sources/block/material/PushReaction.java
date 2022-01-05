package dev.xdark.clientapi.block.material;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface PushReaction
{
    public static final PushReaction NORMAL = SideEffects.objectValue();
    public static final PushReaction DESTROY = SideEffects.objectValue();
    public static final PushReaction BLOCK = SideEffects.objectValue();
    public static final PushReaction IGNORE = SideEffects.objectValue();
    public static final PushReaction PUSH_ONLY = SideEffects.objectValue();
}
