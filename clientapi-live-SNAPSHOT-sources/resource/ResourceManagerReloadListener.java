package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.*;

@SidedApi(Side.SERVER)
public interface ResourceManagerReloadListener
{
    void onReload(final ResourceManager resourceManager);
}
