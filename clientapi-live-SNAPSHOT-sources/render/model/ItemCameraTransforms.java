package dev.xdark.clientapi.render.model;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.renderer.block.model.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface ItemCameraTransforms
{
    public static final ItemCameraTransforms DEFAULT = SideEffects.objectValue();
    
    ItemTransformVec3f getThirdPersonLeft();
    
    ItemTransformVec3f getThirdPersonRight();
    
    ItemTransformVec3f getFirstPersonLeft();
    
    ItemTransformVec3f getFirstPersonRight();
    
    ItemTransformVec3f getHead();
    
    ItemTransformVec3f getGui();
    
    ItemTransformVec3f getGround();
    
    ItemTransformVec3f getFixed();
    
    void applyTransform(final Type type);
    
    ItemTransformVec3f getTransform(final Type type);
    
    @SidedApi(Side.BOTH)
    public interface Type
    {
        public static final Type NONE = SideEffects.objectValue();
        public static final Type THIRD_PERSON_LEFT_HAND = SideEffects.objectValue();
        public static final Type THIRD_PERSON_RIGHT_HAND = SideEffects.objectValue();
        public static final Type FIRST_PERSON_LEFT_HAND = SideEffects.objectValue();
        public static final Type FIRST_PERSON_RIGHT_HAND = SideEffects.objectValue();
        public static final Type HEAD = SideEffects.objectValue();
        public static final Type GUI = SideEffects.objectValue();
        public static final Type GROUND = SideEffects.objectValue();
        public static final Type FIXED = SideEffects.objectValue();
    }
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder thirdPersonLeft(final ItemTransformVec3f thirdPersonLeft);
        
        Builder thirdPersonRight(final ItemTransformVec3f thirdPersonRight);
        
        Builder firstPersonLeft(final ItemTransformVec3f firstPersonLeft);
        
        Builder firstPersonRight(final ItemTransformVec3f firstPersonRight);
        
        Builder head(final ItemTransformVec3f head);
        
        Builder gui(final ItemTransformVec3f gui);
        
        Builder ground(final ItemTransformVec3f ground);
        
        Builder fixed(final ItemTransformVec3f fixed);
        
        ItemCameraTransforms build();
    }
}
