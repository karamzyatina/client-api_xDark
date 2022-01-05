package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.*;
import java.io.*;
import java.util.*;
import dev.xdark.clientapi.renderer.block.model.*;

@SidedApi(Side.BOTH)
public interface ResourceManager
{
    ResourceLocation getLocation(final String namespace, final String path);
    
    Resource getResource(final ResourceLocation location) throws IOException;
    
    List<Resource> getAllResources(final ResourceLocation location) throws IOException;
    
    boolean resourceExists(final ResourceLocation location);
    
    ModelBlockDefinition loadBlockDefinition(final ResourceLocation location) throws IOException;
    
    ModelBlock loadModelBlock(final ResourceLocation location) throws IOException;
}
