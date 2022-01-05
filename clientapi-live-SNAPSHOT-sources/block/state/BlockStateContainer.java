package dev.xdark.clientapi.block.state;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.block.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.block.properties.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface BlockStateContainer
{
    default BlockStateContainer of(final Block block) {
        throw CompileStub.create();
    }
    
    default BlockStateContainer of(final Block block, final Property<?> property) {
        throw CompileStub.create();
    }
    
    default BlockStateContainer of(final Block block, final Property<?>... properties) {
        throw CompileStub.create();
    }
    
    List<BlockState> getValidStates();
    
    BlockState getBaseState();
    
    Block getBlock();
    
    Collection<Property<?>> getProperties();
    
    Property<?> getProperty(final String name);
}
