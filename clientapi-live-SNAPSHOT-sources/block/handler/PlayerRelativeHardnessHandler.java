package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.world.*;

@SidedApi(Side.SERVER)
public interface PlayerRelativeHardnessHandler
{
    float getPlayerRelativeBlockHardness(final BlockState state, final EntityPlayer player, final World world, final int x, final int y, final int z);
}
