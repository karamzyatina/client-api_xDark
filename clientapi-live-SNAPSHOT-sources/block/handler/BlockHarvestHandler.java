package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.entity.*;

@SidedApi(Side.SERVER)
public interface BlockHarvestHandler
{
    void onBlockHarvested(final World world, final BlockPos pos, final BlockState state, final EntityPlayer player);
}
