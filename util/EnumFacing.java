package dev.xdark.clientapi.util;

import dev.xdark.clientapi.*;
import java.util.function.*;

@SidedApi(Side.BOTH)
public interface EnumFacing
{
    public static final EnumFacing DOWN = SideEffects.objectValue();
    public static final EnumFacing UP = SideEffects.objectValue();
    public static final EnumFacing NORTH = SideEffects.objectValue();
    public static final EnumFacing SOUTH = SideEffects.objectValue();
    public static final EnumFacing WEST = SideEffects.objectValue();
    public static final EnumFacing EAST = SideEffects.objectValue();
    
    int getIndex();
    
    int getHorizontalIndex();
    
    AxisDirection getAxisDirection();
    
    EnumFacing getOpposite();
    
    EnumFacing rotateAround(final Axis axis);
    
    EnumFacing rotateX();
    
    EnumFacing rotateY();
    
    EnumFacing rotateZ();
    
    EnumFacing rotateYCCW();
    
    int getXOffset();
    
    int getYOffset();
    
    int getZOffset();
    
    String getName();
    
    Axis getAxis();
    
    @SidedApi(Side.BOTH)
    public interface Axis extends Predicate<EnumFacing>
    {
        public static final Axis X = SideEffects.objectValue();
        public static final Axis Y = SideEffects.objectValue();
        public static final Axis Z = SideEffects.objectValue();
        
        String getName();
        
        boolean isVertical();
        
        boolean isHorizontal();
        
        Plane getPlane();
    }
    
    @SidedApi(Side.BOTH)
    public interface AxisDirection
    {
        public static final AxisDirection POSITIVE = SideEffects.objectValue();
        public static final AxisDirection NEGATIVE = SideEffects.objectValue();
        
        int getOffset();
    }
    
    @SidedApi(Side.BOTH)
    public interface Plane extends Predicate<EnumFacing>, Iterable<EnumFacing>
    {
        public static final Plane HORIZONTAL = SideEffects.objectValue();
        public static final Plane VERTICAL = SideEffects.objectValue();
        
        EnumFacing[] facings();
    }
}
