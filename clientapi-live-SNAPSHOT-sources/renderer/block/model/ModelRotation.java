package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.*;
import org.lwjgl.util.vector.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface ModelRotation
{
    public static final ModelRotation X0_Y0 = SideEffects.objectValue();
    public static final ModelRotation X0_Y90 = SideEffects.objectValue();
    public static final ModelRotation X0_Y180 = SideEffects.objectValue();
    public static final ModelRotation X0_Y270 = SideEffects.objectValue();
    public static final ModelRotation X90_Y0 = SideEffects.objectValue();
    public static final ModelRotation X90_Y90 = SideEffects.objectValue();
    public static final ModelRotation X90_Y180 = SideEffects.objectValue();
    public static final ModelRotation X90_Y270 = SideEffects.objectValue();
    public static final ModelRotation X180_Y0 = SideEffects.objectValue();
    public static final ModelRotation X180_Y90 = SideEffects.objectValue();
    public static final ModelRotation X180_Y180 = SideEffects.objectValue();
    public static final ModelRotation X180_Y270 = SideEffects.objectValue();
    public static final ModelRotation X270_Y0 = SideEffects.objectValue();
    public static final ModelRotation X270_Y90 = SideEffects.objectValue();
    public static final ModelRotation X270_Y180 = SideEffects.objectValue();
    public static final ModelRotation X270_Y270 = SideEffects.objectValue();
    
    Matrix4f matrix();
    
    EnumFacing rotateFace(final EnumFacing facing);
    
    int rotateVertex(final EnumFacing facing, final int vertexIndex);
    
    default ModelRotation getModelRotation(final int x, final int y) {
        throw CompileStub.create();
    }
}
