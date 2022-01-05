package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.*;
import java.io.*;
import java.util.*;
import java.awt.image.*;

@SidedApi(Side.BOTH)
public interface ResourcePack
{
    InputStream getInputStream(final ResourceLocation location) throws IOException;
    
    boolean resourceExists(final ResourceLocation location);
    
    Set<String> getResourceDomains();
    
    BufferedImage getPackImage() throws IOException;
    
    String getPackName();
}
