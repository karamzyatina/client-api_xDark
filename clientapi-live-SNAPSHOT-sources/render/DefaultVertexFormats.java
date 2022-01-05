package dev.xdark.clientapi.render;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.BOTH)
public final class DefaultVertexFormats
{
    public static VertexFormat BLOCK;
    public static VertexFormat ITEM;
    public static final VertexFormat PARTICLE_POSITION_TEX_COLOR_LMAP;
    public static final VertexFormat POSITION;
    public static final VertexFormat POSITION_COLOR;
    public static final VertexFormat POSITION_TEX;
    public static final VertexFormat POSITION_NORMAL;
    public static final VertexFormat POSITION_TEX_COLOR;
    public static final VertexFormat POSITION_TEX_NORMAL;
    public static final VertexFormat POSITION_TEX_LMAP_COLOR;
    public static final VertexFormat POSITION_TEX_COLOR_NORMAL;
    
    private DefaultVertexFormats() {
    }
    
    static {
        DefaultVertexFormats.BLOCK = SideEffects.objectValue();
        DefaultVertexFormats.ITEM = SideEffects.objectValue();
        PARTICLE_POSITION_TEX_COLOR_LMAP = SideEffects.objectValue();
        POSITION = SideEffects.objectValue();
        POSITION_COLOR = SideEffects.objectValue();
        POSITION_TEX = SideEffects.objectValue();
        POSITION_NORMAL = SideEffects.objectValue();
        POSITION_TEX_COLOR = SideEffects.objectValue();
        POSITION_TEX_NORMAL = SideEffects.objectValue();
        POSITION_TEX_LMAP_COLOR = SideEffects.objectValue();
        POSITION_TEX_COLOR_NORMAL = SideEffects.objectValue();
    }
}
