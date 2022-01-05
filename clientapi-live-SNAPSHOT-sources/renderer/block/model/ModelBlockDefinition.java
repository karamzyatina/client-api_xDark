package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.renderer.block.model.multipart.*;
import dev.xdark.clientapi.util.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface ModelBlockDefinition
{
    boolean hasVariant(final String name);
    
    VariantList getVariant(final String name);
    
    Set<VariantList> getMultipartVariants();
    
    boolean hasMultipartData();
    
    Multipart getMultipartData();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder variants(final Map<String, VariantList> variants);
        
        Builder multipart(final Multipart multipart);
        
        Builder definitions(final List<ModelBlockDefinition> definitions);
        
        ModelBlockDefinition build();
    }
}
