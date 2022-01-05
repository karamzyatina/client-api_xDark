package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface ActionResult
{
    public static final ActionResult SUCCESS = SideEffects.objectValue();
    public static final ActionResult PASS = SideEffects.objectValue();
    public static final ActionResult FAIL = SideEffects.objectValue();
}
