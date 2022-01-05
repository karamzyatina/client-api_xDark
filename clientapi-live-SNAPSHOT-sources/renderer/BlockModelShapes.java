package dev.xdark.clientapi.renderer;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.renderer.texture.*;
import dev.xdark.clientapi.renderer.block.model.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.renderer.block.statemap.*;

@SidedApi(Side.SERVER)
public interface BlockModelShapes
{
    BlockStateMapper getBlockStateMapper();
    
    TextureAtlasSprite getTexture(final BlockState state);
    
    BakedModel getModelForState(final BlockState state);
    
    ModelManager getModelManager();
    
    void reloadModels();
    
    void registerBlockWithStateMapper(final Block block, final StateMapper stateMapper);
    
    void registerBuiltInBlocks(final Block... blocks);
}
