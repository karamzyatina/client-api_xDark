package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.*;
import java.io.*;

@SidedApi(Side.BOTH)
public interface Resource extends Closeable
{
    ResourceLocation getLocation();
    
    InputStream getInputStream();
    
    ResourcePack getPack();
}
