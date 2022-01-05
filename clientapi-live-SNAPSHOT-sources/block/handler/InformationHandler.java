package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.world.*;
import java.util.*;
import dev.xdark.clientapi.item.*;

@SidedApi(Side.SERVER)
public interface InformationHandler
{
    void addInformation(final Block block, final ItemStack stack, final World world, final List<String> info, final TooltipFlag tooltipFlag);
}
