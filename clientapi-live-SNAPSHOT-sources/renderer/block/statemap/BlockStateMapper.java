package dev.xdark.clientapi.renderer.block.statemap;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.renderer.block.model.*;
import java.util.*;
import dev.xdark.clientapi.resource.*;

@SidedApi(Side.SERVER)
public interface BlockStateMapper
{
    void registerBlockStateMapper(final Block block, final StateMapper stateMapper);
    
    void registerBuiltInBlocks(final Block... blocks);
    
    Map<BlockState, ModelResourceLocation> putAllStateModelLocations();
    
    Set<ResourceLocation> getBlockStateLocations(final Block block);
    
    Map<BlockState, ModelResourceLocation> getVariants(final Block block);
}
