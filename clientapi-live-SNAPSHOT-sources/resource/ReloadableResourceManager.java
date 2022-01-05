package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface ReloadableResourceManager extends ResourceManager
{
    void reloadResources(final List<ResourcePack> resourcePacks);
    
    void registerReloadListener(final ResourceManagerReloadListener reloadListener);
    
    void unregisterReloadListener(final ResourceManagerReloadListener reloadListener);
}
