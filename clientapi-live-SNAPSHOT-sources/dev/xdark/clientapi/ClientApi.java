package dev.xdark.clientapi;

import dev.xdark.clientapi.nbt.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.event.*;
import dev.xdark.clientapi.runtime.*;
import dev.xdark.clientapi.potion.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.texture.*;
import dev.xdark.clientapi.skin.*;
import dev.xdark.clientapi.discord.*;
import dev.xdark.clientapi.thread.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.render.*;
import dev.xdark.clientapi.chat.*;
import dev.xdark.clientapi.text.*;
import dev.xdark.clientapi.input.*;
import dev.xdark.clientapi.game.*;
import dev.xdark.clientapi.system.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.network.*;
import java.util.concurrent.*;
import dev.xdark.clientapi.logging.*;
import dev.xdark.clientapi.sound.*;
import dev.xdark.clientapi.renderer.texture.*;
import dev.xdark.clientapi.renderer.block.model.*;
import dev.xdark.clientapi.settings.*;
import dev.xdark.clientapi.biome.*;
import dev.xdark.clientapi.language.*;
import dev.xdark.clientapi.jvm.*;
import dev.xdark.clientapi.p13n.*;

@SidedApi(Side.BOTH)
public interface ClientApi
{
    NBTProvider nbtProvider();
    
    ScaledResolution resolution();
    
    FontRenderer fontRenderer();
    
    FontRenderer galacticFontRenderer();
    
    OverlayRenderer overlayRenderer();
    
    ReloadableResourceManager resourceManager();
    
    Tessellator tessellator();
    
    @SidedApi(Side.SERVER)
    Framebuffer framebuffer();
    
    @Deprecated
    EventBus eventBus();
    
    @Deprecated
    EventBus messageBus();
    
    Platform platform();
    
    @SidedApi(Side.SERVER)
    PotionRegistry potionRegistry();
    
    @SidedApi(Side.SERVER)
    ItemRegistry itemRegistry();
    
    @SidedApi(Side.SERVER)
    BlockRegistry blockRegistry();
    
    @SidedApi(Side.SERVER)
    RenderEngine renderEngine();
    
    @SidedApi(Side.SERVER)
    SkinManager skinManager();
    
    DiscordRPC discordRpc();
    
    @SidedApi(Side.SERVER)
    EntityProvider entityProvider();
    
    ThreadManagement threadManagement();
    
    MathProvider mathProvider();
    
    RenderItem renderItem();
    
    Chat chat();
    
    TextProvider textProvider();
    
    @SidedApi(Side.SERVER)
    MouseHelper mouseHelper();
    
    Minecraft minecraft();
    
    Clipboard clipboard();
    
    @SidedApi(Side.SERVER)
    DataSerializers dataSerializers();
    
    ClientConnection clientConnection();
    
    ScheduledExecutorService syncExecutorService();
    
    @SidedApi(Side.SERVER)
    LoggingManagement loggingManagement();
    
    Natives natives();
    
    @SidedApi(Side.SERVER)
    SoundHandler soundHandler();
    
    @SidedApi(Side.SERVER)
    TextureMap textureMap();
    
    @SidedApi(Side.SERVER)
    ModelManager modelManager();
    
    SettingsManager settingsManager();
    
    @SidedApi(Side.SERVER)
    BiomeRegistry biomeRegistry();
    
    @SidedApi(Side.SERVER)
    LanguageManager languageManager();
    
    @SidedApi(Side.SERVER)
    ClassDefiner classDefiner();
    
    @SidedApi(Side.SERVER)
    P13nProvider p13nProvider();
}
