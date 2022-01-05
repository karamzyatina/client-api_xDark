package dev.xdark.clientapi.renderer.block.model.multipart;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import java.util.*;
import dev.xdark.clientapi.renderer.block.model.*;
import dev.xdark.clientapi.block.state.*;

@SidedApi(Side.SERVER)
public interface Multipart
{
    default Multipart of(final List<Selector> selectors) {
        throw CompileStub.create();
    }
    
    List<Selector> getSelectors();
    
    Set<VariantList> getVariants();
    
    void setStateContainer(final BlockStateContainer container);
    
    BlockStateContainer getStateContainer();
}
