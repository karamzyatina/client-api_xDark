package dev.xdark.clientapi.skin;

import dev.xdark.clientapi.*;
import com.mojang.authlib.minecraft.*;
import dev.xdark.clientapi.resource.*;
import com.mojang.authlib.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface SkinManager
{
    ResourceLocation loadSkin(final MinecraftProfileTexture texture, final MinecraftProfileTexture.Type type, final SkinAvailableCallback callback);
    
    Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> loadSkinFromCache(final GameProfile profile);
}
