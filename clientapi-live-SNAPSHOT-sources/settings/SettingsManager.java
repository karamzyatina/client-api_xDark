package dev.xdark.clientapi.settings;

import dev.xdark.clientapi.*;

@Deprecated
@SidedApi(Side.BOTH)
public interface SettingsManager
{
    KeyBinding getBindingByCode(final int code);
    
    KeyBinding getBindingByName(final String name);
}
