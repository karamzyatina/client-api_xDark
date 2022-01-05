package dev.xdark.clientapi.renderer.block.model.multipart;

import dev.xdark.clientapi.*;
import java.util.function.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface Condition
{
    public static final Condition TRUE = SideEffects.objectValue();
    public static final Condition FALSE = SideEffects.objectValue();
    
    Predicate<BlockState> getPredicate(final BlockStateContainer container);
}
