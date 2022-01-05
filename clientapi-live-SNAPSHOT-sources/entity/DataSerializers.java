package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.*;
import dev.xdark.clientapi.text.*;
import dev.xdark.clientapi.item.*;
import com.google.common.base.*;
import dev.xdark.clientapi.block.state.*;
import dev.xdark.clientapi.math.*;
import java.util.*;
import dev.xdark.clientapi.nbt.*;
import dev.xdark.clientapi.util.*;

@SidedApi(Side.SERVER)
public interface DataSerializers
{
    public static final DataSerializer<Byte> BYTE = SideEffects.objectValue();
    public static final DataSerializer<Integer> VARINT = SideEffects.objectValue();
    public static final DataSerializer<Float> FLOAT = SideEffects.objectValue();
    public static final DataSerializer<String> STRING = SideEffects.objectValue();
    public static final DataSerializer<Text> TEXT = SideEffects.objectValue();
    public static final DataSerializer<ItemStack> ITEM_STACK = SideEffects.objectValue();
    public static final DataSerializer<Optional<BlockState>> OPTIONAL_BLOCK_STATE = SideEffects.objectValue();
    public static final DataSerializer<Boolean> BOOLEAN = SideEffects.objectValue();
    public static final DataSerializer<Rotations> ROTATIONS = SideEffects.objectValue();
    public static final DataSerializer<BlockPos> BLOCK_POS = SideEffects.objectValue();
    public static final DataSerializer<Optional<BlockPos>> OPTIONAL_BLOCK_POS = SideEffects.objectValue();
    public static final DataSerializer<EnumFacing> FACING = SideEffects.objectValue();
    public static final DataSerializer<Optional<UUID>> OPTIONAL_UNIQUE_ID = SideEffects.objectValue();
    public static final DataSerializer<NBTTagCompound> COMPOUND_TAG = SideEffects.objectValue();
    
    void register(final DataSerializer<?> serializer, final int id);
    
    DataSerializer<?> getSerializer(final int id);
    
    int getId(final DataSerializer<?> serializer);
}
