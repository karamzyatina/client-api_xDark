package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.item.*;

@SidedApi(Side.SERVER)
public interface ItemHandler
{
    ItemStack getItem(final World world, final int x, final int y, final int z, final BlockState state);
}
