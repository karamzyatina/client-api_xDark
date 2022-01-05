package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public interface ResourceLocation
{
    default ResourceLocation of(final String namespace, final String path) {
        throw CompileStub.create();
    }
    
    default ResourceLocation of(final String input) {
        throw CompileStub.create();
    }
    
    String getNamespace();
    
    String getPath();
    
    ResourceLocation changeNamespace(final String newNamespace);
    
    ResourceLocation changePath(final String newPath);
}
