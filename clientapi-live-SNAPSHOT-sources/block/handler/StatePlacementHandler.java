package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface StatePlacementHandler
{
    BlockState getStateForPlacement(final Block block, final World world, final int x, final int y, final int z, final EnumFacing facing, final float hitX, final float hitY, final float hitZ, final int meta, final EntityLivingBase placer);
}
