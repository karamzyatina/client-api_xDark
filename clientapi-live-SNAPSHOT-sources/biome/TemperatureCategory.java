package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface TemperatureCategory
{
    public static final TemperatureCategory OCEAN = SideEffects.objectValue();
    public static final TemperatureCategory COLD = SideEffects.objectValue();
    public static final TemperatureCategory MEDIUM = SideEffects.objectValue();
    public static final TemperatureCategory WARM = SideEffects.objectValue();
}
