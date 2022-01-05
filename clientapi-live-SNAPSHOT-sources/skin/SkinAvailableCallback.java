package dev.xdark.clientapi.skin;

import dev.xdark.clientapi.*;
import com.mojang.authlib.minecraft.*;
import dev.xdark.clientapi.resource.*;

@SidedApi(Side.SERVER)
@FunctionalInterface
public interface SkinAvailableCallback
{
    void skinAvailable(final MinecraftProfileTexture.Type type, final ResourceLocation location, final MinecraftProfileTexture texture);
}
