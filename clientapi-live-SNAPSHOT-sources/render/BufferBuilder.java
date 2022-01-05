package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import java.nio.*;

@SidedApi(Side.BOTH)
public interface BufferBuilder
{
    void sortVertexData(final float cameraX, final float cameraY, final float cameraZ);
    
    void reset();
    
    void begin(final int glMode, final VertexFormat format);
    
    BufferBuilder tex(final double u, final double v);
    
    BufferBuilder lightmap(final int skyLight, final int blockLight);
    
    void putBrightness4(final int vertex0, final int vertex1, final int vertex2, final int vertex3);
    
    void putPosition(final double x, final double y, final double z);
    
    int getColorIndex(final int vertexIndex);
    
    void putColorMultiplier(final float red, final float green, final float blue, final int vertexIndex);
    
    void putColorRGB_F(final float red, final float green, final float blue, final int vertexIndex);
    
    void putColorRGBA(final int index, final int red, final int green, final int blue);
    
    void noColor();
    
    BufferBuilder color(final int red, final int green, final int blue, final int alpha);
    
    void addVertexData(final int[] vertexData);
    
    void endVertex();
    
    BufferBuilder pos(final double x, final double y, final double z);
    
    void putNormal(final float x, final float y, final float z);
    
    BufferBuilder normal(final float x, final float y, final float z);
    
    void setTranslation(final double x, final double y, final double z);
    
    void finishDrawing();
    
    int getVertexCount();
    
    int getDrawMode();
    
    void putColor4(final int argb);
    
    void putColorRGB_F4(final float red, final float green, final float blue);
    
    int getNextIndex();
    
    int getBufferSize();
    
    @SidedApi(Side.SERVER)
    ByteBuffer getBufferData();
    
    @SidedApi(Side.SERVER)
    void putBulkData(final ByteBuffer buffer);
    
    @SidedApi(Side.SERVER)
    State getState();
    
    @SidedApi(Side.SERVER)
    void setState(final State state);
    
    @SidedApi(Side.SERVER)
    public interface State
    {
        int[] getRawBuffer();
        
        int getVertexCount();
        
        VertexFormat getVertexFormat();
    }
}
