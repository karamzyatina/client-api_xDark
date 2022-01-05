package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@SidedApi(Side.BOTH)
@FunctionalInterface
public interface IntToIntFunction
{
    int applyAsInt(final int i);
}
