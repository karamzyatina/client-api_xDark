package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.util.*;

public interface ModelResourceLocation extends ResourceLocation
{
    default ModelResourceLocation of(final String input) {
        throw CompileStub.create();
    }
    
    default ModelResourceLocation of(final ResourceLocation namespace, final String path) {
        throw CompileStub.create();
    }
    
    default ModelResourceLocation of(final String namespace, final String name) {
        throw CompileStub.create();
    }
    
    String getVariant();
}
