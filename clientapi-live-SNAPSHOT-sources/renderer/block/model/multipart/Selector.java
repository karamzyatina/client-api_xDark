package dev.xdark.clientapi.renderer.block.model.multipart;

import dev.xdark.clientapi.*;
import java.util.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.renderer.block.model.*;
import java.util.function.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface Selector
{
    default Selector of(final Condition condition, final List<Variant> variants) {
        throw CompileStub.create();
    }
    
    VariantList getVariants();
    
    Predicate<BlockState> getPredicate(final BlockStateContainer container);
}
