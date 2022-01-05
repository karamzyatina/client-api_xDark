package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.gui.*;
import java.util.*;
import dev.xdark.clientapi.item.*;

@SidedApi(Side.SERVER)
public interface SubBlocksHandler
{
    void getSubBlocks(final Block block, final CreativeTab tab, final List<ItemStack> stacks);
}
