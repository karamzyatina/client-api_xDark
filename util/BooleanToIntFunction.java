package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;

@FunctionalInterface
@SidedApi(Side.BOTH)
public interface BooleanToIntFunction
{
    int applyAsInt(final boolean value);
}
