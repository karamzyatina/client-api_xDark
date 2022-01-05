package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.item.*;

@SidedApi(Side.SERVER)
public interface BlockPlacedHandler
{
    void onBlockPlacedBy(final World world, final BlockPos pos, final BlockState state, final EntityLivingBase entity, final ItemStack stack);
}
