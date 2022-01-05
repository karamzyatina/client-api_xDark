package dev.xdark.clientapi.block;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.resource.*;
import dev.xdark.clientapi.world.*;
import java.util.*;
import dev.xdark.clientapi.math.*;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.entity.*;
import dev.xdark.clientapi.block.material.*;
import dev.xdark.clientapi.gui.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.item.*;
import dev.xdark.clientapi.renderer.color.*;
import dev.xdark.clientapi.block.handler.*;

@SidedApi(Side.SERVER)
public interface Block
{
    default Block of(final int id) {
        throw CompileStub.create();
    }
    
    default Block of(final String idOrLocation) {
        throw CompileStub.create();
    }
    
    int getId();
    
    ResourceLocation getLocation();
    
    BlockState getDefaultState();
    
    BlockState getStateFromMeta(final int meta);
    
    int getMetaFromState(final BlockState state);
    
    boolean hasTileEntity();
    
    String getLocalizedName();
    
    String getTranslationKey();
    
    boolean isTopSolid(final BlockState state);
    
    boolean isFullBlock(final BlockState state);
    
    int getLightOpacity(final BlockState state);
    
    boolean isTranslucent(final BlockState state);
    
    int getLightValue(final BlockState state);
    
    boolean getUseNeighborBrightness(final BlockState state);
    
    Material getMaterial(final BlockState state);
    
    MapColor getMapColor(final BlockState state, final BlockAccess blockAccess, final BlockPos pos);
    
    BlockState getActualState(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z);
    
    BlockState withRotation(final BlockState state, final Rotation rotation);
    
    BlockState withMirror(final BlockState state, final Mirror mirror);
    
    boolean isBlockNormalCube(final BlockState state);
    
    boolean isNormalCube(final BlockState state);
    
    boolean causesSuffocation(final BlockState state);
    
    boolean isFullCube(final BlockState state);
    
    boolean hasCustomBreakingProgress(final BlockState state);
    
    boolean isPassable(final BlockAccess blockAccess, final int x, final int y, final int z);
    
    BlockRenderType getRenderType(final BlockState state);
    
    boolean isReplaceable(final BlockAccess blockAccess, final BlockPos pos);
    
    float getBlockHardness(final BlockState state, final World world, final int x, final int y, final int z);
    
    boolean tickRandomly();
    
    AxisAlignedBB getBoundingBox(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z);
    
    int getPackedLightmapCoords(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z);
    
    boolean shouldSideBeRendered(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z, final EnumFacing facing);
    
    BlockFaceShape getBlockFaceShape(final BlockAccess blockAccess, final BlockState state, final int x, final int y, final int z, final EnumFacing facing);
    
    AxisAlignedBB getSelectedBoundingBox(final BlockState blockState, final World world, final int x, final int y, final int z);
    
    void addCollisionBoxToList(final BlockState state, final World world, final int x, final int y, final int z, final AxisAlignedBB entityBox, final List<AxisAlignedBB> collidingBoxes, final Entity entity, final boolean isActualState);
    
    default void addCollisionBoxToList(final int x, final int y, final int z, final AxisAlignedBB entityBox, final List<AxisAlignedBB> boxes, final AxisAlignedBB blockBox) {
        throw CompileStub.create();
    }
    
    AxisAlignedBB getCollisionBoundingBox(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z);
    
    boolean isOpaqueCube(final BlockState state);
    
    boolean canCollideCheck(final BlockState state, final boolean hitIfLiquid);
    
    boolean isCollidable();
    
    void randomDisplayTick(final BlockState blockState, final World world, final int x, final int y, final int z, final Random random);
    
    int tickRate(final World world);
    
    float getPlayerRelativeBlockHardness(final BlockState state, final EntityPlayer player, final World world, final int x, final int y, final int z);
    
    int damageDropped(final BlockState state);
    
    RayTraceResult collisionRayTrace(final BlockState blockState, final World world, final int x, final int y, final int z, final Vec3d start, final Vec3d end);
    
    BlockRenderLayer getRenderLayer();
    
    boolean canPlaceBlockOnSide(final World world, final int x, final int y, final int z, final EnumFacing facing);
    
    boolean canPlaceBlockAt(final World world, final int x, final int y, final int z);
    
    boolean onBlockActivated(final World world, final int x, final int y, final int z, final BlockState state, final EntityPlayer player, final EnumHand hand, final EnumFacing side, final float hitX, final float hitY, final float hitZ);
    
    void onEntityWalk(final World world, final int x, final int y, final int z, final Entity entity);
    
    BlockState getStateForPlacement(final World world, final int x, final int y, final int z, final EnumFacing facing, final float hitX, final float hitY, final float hitZ, final int meta, final EntityLivingBase placer);
    
    void onBlockClicked(final World world, final int x, final int y, final int z, final EntityPlayer player);
    
    Vec3d modifyAcceleration(final World world, final int x, final int y, final int z, final Entity entity, final Vec3d acceleration);
    
    void onEntityCollision(final World world, final int x, final int y, final int z, final BlockState state, final Entity entity);
    
    boolean canProvidePower(final BlockState state);
    
    int getWeakPower(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z, final EnumFacing facing);
    
    int getStrongPower(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z, final EnumFacing facing);
    
    void onBlockPlacedBy(final World world, final BlockPos pos, final BlockState state, final EntityLivingBase entity, final ItemStack stack);
    
    boolean eventReceived(final BlockState state, final World world, final int x, final int y, final int z, final int id, final int param);
    
    PushReaction getPushReaction(final BlockState state);
    
    float getAmbientOcclusionLightValue(final BlockState state);
    
    void onFallenUpon(final World world, final int x, final int y, final int z, final Entity entity, final float fallDistance);
    
    void onLanded(final World world, final Entity entity);
    
    ItemStack getItem(final World world, final int x, final int y, final int z, final BlockState state);
    
    void getSubBlocks(final CreativeTab tab, final List<ItemStack> stacks);
    
    CreativeTab getCreativeTab();
    
    void onBlockHarvested(final World world, final BlockPos pos, final BlockState state, final EntityPlayer player);
    
    boolean hasComparatorInputOverride(final BlockState state);
    
    int getComparatorInputOverride(final BlockState state, final World world, final int x, final int y, final int z);
    
    BlockStateContainer createBlockState();
    
    BlockStateContainer getBlockState();
    
    OffsetType getOffsetType();
    
    Vec3d getOffset(final BlockState state, final BlockAccess blockAccess, final int x, final int y, final int z);
    
    void addInformation(final ItemStack stack, final World world, final List<String> info, final TooltipFlag tooltipFlag);
    
    Material getMaterial();
    
    float getBaseHardness();
    
    float getSlipperiness();
    
    float getParticleGravity();
    
    void onPlayerDestroy(final World world, final BlockPos pos, final BlockState state);
    
    SoundType getSoundType();
    
    @SidedApi(Side.SERVER)
    public interface Builder
    {
        default Builder builder() {
            throw CompileStub.create();
        }
        
        Builder hasTileEntity(final boolean hasTileEntity);
        
        Builder translationKey(final String translationKey);
        
        Builder offsetType(final OffsetType offsetType);
        
        Builder material(final Material material);
        
        Builder tickRandomly(final boolean tickRandomly);
        
        Builder blockRenderLayer(final BlockRenderLayer blockRenderLayer);
        
        Builder creativeTab(final CreativeTab creativeTab);
        
        Builder blockColor(final BlockColor blockColor);
        
        Builder blockColorMultiplier(final BlockColor blockColor);
        
        Builder soundType(final SoundType soundType);
        
        Builder baseHardness(final float baseHardness);
        
        Builder slipperiness(final float slipperiness);
        
        Builder particleGravity(final float particleGravity);
        
        Builder metaHandler(final MetaHandler metaHandler);
        
        Builder solidTopHandler(final SolidTopHandler solidTopHandler);
        
        Builder fullBlockHandler(final FullBlockHandler fullBlockHandler);
        
        Builder lightOpacityHandler(final LightOpacityHandler lightOpacityHandler);
        
        Builder translucentHandler(final TranslucentHandler translucentHandler);
        
        Builder lightValueHandler(final LightValueHandler lightValueHandler);
        
        Builder neighborBrightnessHandler(final NeighborBrightnessHandler neighborBrightnessHandler);
        
        Builder materialHandler(final MaterialHandler materialHandler);
        
        Builder mapColorHandler(final MapColorHandler mapColorHandler);
        
        Builder actualStateHandler(final ActualStateHandler actualStateHandler);
        
        Builder rotationHandler(final RotationHandler rotationHandler);
        
        Builder mirrorHandler(final MirrorHandler mirrorHandler);
        
        Builder suffocationHandler(final SuffocationHandler suffocationHandler);
        
        Builder fullCubeHandler(final FullCubeHandler fullCubeHandler);
        
        Builder customBreakingProgressHandler(final CustomBreakingProgressHandler customBreakingProgressHandler);
        
        Builder passHandler(final PassHandler passHandler);
        
        Builder renderTypeHandler(final RenderTypeHandler renderTypeHandler);
        
        Builder replaceHandler(final ReplaceHandler replaceHandler);
        
        Builder blockHardnessHandler(final BlockHardnessHandler blockHardnessHandler);
        
        Builder boundingBoxHandler(final BoundingBoxHandler boundingBoxHandler);
        
        Builder lightmapCoordsHandler(final LightmapCoordsHandler lightmapCoordsHandler);
        
        Builder sideRenderHandler(final SideRenderHandler sideRenderHandler);
        
        Builder faceShapeHandler(final FaceShapeHandler faceShapeHandler);
        
        Builder selectedBoundingBoxHandler(final SelectedBoundingBoxHandler selectedBoundingBoxHandler);
        
        Builder collisionBoxListHandler(final CollisionBoxListHandler collisionBoxListHandler);
        
        Builder collisionBoundingBoxHandler(final CollisionBoundingBoxHandler collisionBoundingBoxHandler);
        
        Builder opaqueCubeHandler(final OpaqueCubeHandler opaqueCubeHandler);
        
        Builder collideCheckHandler(final CollideCheckHandler collideCheckHandler);
        
        Builder collidableHandler(final CollidableHandler collidableHandler);
        
        Builder displayTickHandler(final DisplayTickHandler displayTickHandler);
        
        Builder tickRateHandler(final TickRateHandler tickRateHandler);
        
        Builder playerRelativeHardnessHandler(final PlayerRelativeHardnessHandler playerRelativeHardnessHandler);
        
        Builder droppedDamageHandler(final DroppedDamageHandler droppedDamageHandler);
        
        Builder collisionRayTraceHandler(final CollisionRayTraceHandler collisionRayTraceHandler);
        
        Builder sidePlacementHandler(final SidePlacementHandler sidePlacementHandler);
        
        Builder blockPlacementCheckHandler(final BlockPlacementCheckHandler blockPlacementCheckHandler);
        
        Builder blockActivationHandler(final BlockActivationHandler blockActivationHandler);
        
        Builder entityWalkHandler(final EntityWalkHandler entityWalkHandler);
        
        Builder statePlacementHandler(final StatePlacementHandler statePlacementHandler);
        
        Builder blockClickHandler(final BlockClickHandler blockClickHandler);
        
        Builder accelerationModificationHandler(final AccelerationModificationHandler accelerationModificationHandler);
        
        Builder weakPowerHandler(final WeakPowerHandler weakPowerHandler);
        
        Builder powerProvideCheckHandler(final PowerProvideCheckHandler powerProvideCheckHandler);
        
        Builder entityCollisionHandler(final EntityCollisionHandler entityCollisionHandler);
        
        Builder strongPowerHandler(final StrongPowerHandler strongPowerHandler);
        
        Builder blockPlacedHandler(final BlockPlacedHandler blockPlacedHandler);
        
        Builder eventReceiveHandler(final EventReceiveHandler eventReceiveHandler);
        
        Builder pushReactionHandler(final PushReactionHandler pushReactionHandler);
        
        Builder ambientOcclusionLightValueHandler(final AmbientOcclusionLightValueHandler ambientOcclusionLightValueHandler);
        
        Builder entityFallenHandler(final EntityFallenHandler entityFallenHandler);
        
        Builder entityLandHandler(final EntityLandHandler entityLandHandler);
        
        Builder itemHandler(final ItemHandler itemHandler);
        
        Builder subBlocksHandler(final SubBlocksHandler subBlocksHandler);
        
        Builder blockHarvestHandler(final BlockHarvestHandler blockHarvestHandler);
        
        Builder comparatorInputOverrideCheckHandler(final ComparatorInputOverrideCheckHandler comparatorInputOverrideCheckHandler);
        
        Builder comparatorInputOverrideHandler(final ComparatorInputOverrideHandler comparatorInputOverrideHandler);
        
        Builder blockStateCreator(final BlockStateCreator blockStateCreator);
        
        Builder informationHandler(final InformationHandler informationHandler);
        
        Builder playerDestroyHandler(final PlayerDestroyHandler playerDestroyHandler);
        
        Block build();
    }
}
