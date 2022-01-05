package dev.xdark.clientapi.block;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface BlockStainedGlass extends Block
{
    @SidedApi(Side.SERVER)
    public interface Builder extends Block.Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        BlockStainedGlass build();
    }
}
