package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.entity.*;

@SidedApi(Side.SERVER)
public interface EntityLandHandler
{
    void onLanded(final Block block, final World world, final Entity entity);
}
