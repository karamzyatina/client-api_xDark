package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import java.util.*;

@SidedApi(Side.SERVER)
public interface ModelBakery
{
    void registerVariant(final ModelBlockDefinition definition, final ModelResourceLocation location);
    
    void loadVariantList(final ModelResourceLocation location, final List<Variant> list);
    
    void loadItemModel(final String variantName, final ResourceLocation location, final ResourceLocation itemName);
    
    void registerMultipartVariant(final ModelBlockDefinition definition, final Collection<ModelResourceLocation> locations);
}
