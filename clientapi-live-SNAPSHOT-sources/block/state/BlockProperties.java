package dev.xdark.clientapi.block.state;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.world.*;
import dev.xdark.clientapi.block.material.*;
import java.util.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.math.*;

@SidedApi(Side.SERVER)
public interface BlockProperties
{
    Material getMaterial();
    
    boolean isFullBlock();
    
    int getLightOpacity();
    
    int getLightValue();
    
    boolean isTranslucent();
    
    boolean useNeighborBrightness();
    
    boolean isFullCube();
    
    float getAmbientOcclusionLightValue();
    
    boolean isBlockNormalCube();
    
    boolean isNormalCube();
    
    boolean isTopSolid();
    
    MapColor getMapColor(final BlockAccess blockAccess, final BlockPos pos);
    
    BlockState withRotation(final Rotation rotation);
    
    BlockState withMirror(final Mirror mirror);
    
    boolean hasCustomBreakingProgress();
    
    BlockRenderType getRenderType();
    
    int getPackedLightmapCoords(final BlockAccess blockAccess, final int x, final int y, final int z);
    
    boolean canProvidePower();
    
    int getWeakPower(final BlockAccess blockAccess, final int x, final int y, final int z, final EnumFacing facing);
    
    boolean hasComparatorInputOverride();
    
    int getComparatorInputOverride(final World world, final int x, final int y, final int z);
    
    float getBlockHardness(final World world, final int x, final int y, final int z);
    
    float getPlayerRelativeBlockHardness(final EntityPlayer player, final World world, final int x, final int y, final int z);
    
    int getStrongPower(final BlockAccess blockAccess, final int x, final int y, final int z, final EnumFacing facing);
    
    PushReaction getPushReaction();
    
    BlockState getActualState(final BlockAccess blockAccess, final int x, final int y, final int z);
    
    AxisAlignedBB getSelectedBoundingBox(final World world, final int x, final int y, final int z);
    
    boolean shouldSideBeRendered(final BlockAccess blockAccess, final int x, final int y, final int z, final EnumFacing facing);
    
    boolean isOpaqueCube();
    
    AxisAlignedBB getCollisionBoundingBox(final BlockAccess blockAccess, final int x, final int y, final int z);
    
    void addCollisionBoxToList(final World world, final int x, final int y, final int z, final AxisAlignedBB entityBox, final List<AxisAlignedBB> collidingBoxes, final Entity entity, final boolean isActualState);
    
    AxisAlignedBB getBoundingBox(final BlockAccess blockAccess, final int x, final int y, final int z);
    
    RayTraceResult collisionRayTrace(final World world, final int x, final int y, final int z, final Vec3d start, final Vec3d end);
    
    Vec3d getOffset(final BlockAccess blockAccess, final int x, final int y, final int z);
    
    void setOffset(final BlockAccess blockAccess, final int x, final int y, final int z, final Vec3d into);
    
    boolean causesSuffocation();
    
    BlockFaceShape getBlockFaceShape(final BlockAccess blockAccess, final int x, final int y, final int z, final EnumFacing facing);
}
