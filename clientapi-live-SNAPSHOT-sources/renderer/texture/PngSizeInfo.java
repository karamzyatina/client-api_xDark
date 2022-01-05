package dev.xdark.clientapi.renderer.texture;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import java.io.*;

@SidedApi(Side.SERVER)
public interface PngSizeInfo
{
    int getWidth();
    
    int getHeight();
    
    default PngSizeInfo of(final int width, final int height) {
        throw CompileStub.create();
    }
    
    default PngSizeInfo of(final InputStream in) throws IOException {
        throw CompileStub.create();
    }
}
