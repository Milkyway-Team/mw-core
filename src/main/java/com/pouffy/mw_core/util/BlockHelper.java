package com.pouffy.mw_core.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.world.level.block.state.properties.Property;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.function.ToIntFunction;

public class BlockHelper {
    //Code borrowed from CoFH Core to avoid having multiple dependencies
    public static final Direction[] DIR_VALUES = Direction.values();
    public static final byte[] SIDE_LEFT = new byte[]{4, 5, 5, 4, 2, 3};
    public static final byte[] SIDE_RIGHT = new byte[]{5, 4, 4, 5, 3, 2};
    public static final byte[] SIDE_OPPOSITE = new byte[]{1, 0, 3, 2, 5, 4};
    public static final byte[] SIDE_ABOVE = new byte[]{3, 2, 1, 1, 1, 1};
    public static final byte[] SIDE_BELOW = new byte[]{2, 3, 0, 0, 0, 0};
    private static final EnumMap<Direction, Direction> SIDE_LEFT_LOOKUP;
    private static final EnumMap<Direction, Direction> SIDE_RIGHT_LOOKUP;
    private static final EnumMap<Direction, Direction> SIDE_OPPOSITE_LOOKUP;
    private static final EnumMap<Direction, Direction> SIDE_ABOVE_LOOKUP;
    private static final EnumMap<Direction, Direction> SIDE_BELOW_LOOKUP;
    public static final byte[] ROTATE_CLOCK_Y;
    public static final byte[] ROTATE_CLOCK_Z;
    public static final byte[] ROTATE_CLOCK_X;
    public static final byte[] ROTATE_COUNTER_Y;
    public static final byte[] ROTATE_COUNTER_Z;
    public static final byte[] ROTATE_COUNTER_X;
    public static final byte[] INVERT_AROUND_Y;
    public static final byte[] INVERT_AROUND_Z;
    public static final byte[] INVERT_AROUND_X;

    private BlockHelper() {
    }

    public static ToIntFunction<BlockState> lightValue(BooleanProperty property, int lightValue) {
        return (state) -> {
            return (Boolean)state.getValue(property) ? lightValue : 0;
        };
    }

    public static ToIntFunction<BlockState> lightValue(int lightValue) {
        return (state) -> {
            return lightValue;
        };
    }

    public static BlockEntity getAdjacentTileEntity(Level world, BlockPos pos, Direction dir) {
        pos = pos.relative(dir);
        return world != null && world.hasChunkAt(pos) ? world.getBlockEntity(pos) : null;
    }

    public static BlockEntity getAdjacentTileEntity(Level world, BlockPos pos, int side) {
        return world == null ? null : getAdjacentTileEntity(world, pos, DIR_VALUES[side]);
    }

    public static BlockEntity getAdjacentTileEntity(BlockEntity refTile, Direction dir) {
        return refTile == null ? null : getAdjacentTileEntity(refTile.getLevel(), refTile.getBlockPos(), dir);
    }

    public static boolean attemptRotateBlock(BlockState state, Level world, BlockPos pos) {
        Collection<Property<?>> properties = state.getProperties();
        if (!properties.contains(BlockStateProperties.DOOR_HINGE) && !properties.contains(BlockStateProperties.BED_PART) && !properties.contains(BlockStateProperties.EYE)) {
            if (properties.contains(BlockStateProperties.CHEST_TYPE) && state.getValue(BlockStateProperties.CHEST_TYPE) != ChestType.SINGLE) {
                return false;
            } else if (properties.contains(BlockStateProperties.EXTENDED) && (Boolean)state.getValue(BlockStateProperties.EXTENDED)) {
                return false;
            } else {
                BlockState rotState;
                int index;
                int i;
                Block block;
                if (properties.contains(BlockStateProperties.FACING)) {
                    index = ((Direction)state.getValue(BlockStateProperties.FACING)).get3DDataValue();

                    for(i = 1; i < 6; ++i) {
                        rotState = (BlockState)state.setValue(BlockStateProperties.FACING, Direction.from3DDataValue(index + i));
                        if (rotState != state && rotState.canSurvive(world, pos)) {
                            world.setBlockAndUpdate(pos, rotState);
                            if (rotState.isSignalSource()) {
                                block = rotState.getBlock();
                                world.updateNeighborsAt(pos, block);
                                if (rotState.getDirectSignal(world, pos, (Direction)rotState.getValue(BlockStateProperties.FACING)) > 0) {
                                    world.updateNeighborsAt(pos.relative(((Direction)state.getValue(BlockStateProperties.FACING)).getOpposite()), block);
                                    world.updateNeighborsAt(pos.relative(((Direction)rotState.getValue(BlockStateProperties.FACING)).getOpposite()), block);
                                }
                            }

                            return true;
                        }
                    }

                    return true;
                } else if (properties.contains(BlockStateProperties.HORIZONTAL_FACING)) {
                    index = ((Direction)state.getValue(BlockStateProperties.HORIZONTAL_FACING)).get2DDataValue();

                    for(i = 1; i < 4; ++i) {
                        rotState = (BlockState)state.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.from2DDataValue(index + i));
                        if (rotState != state && rotState.canSurvive(world, pos)) {
                            world.setBlockAndUpdate(pos, rotState);
                            if (rotState.isSignalSource()) {
                                block = rotState.getBlock();
                                world.updateNeighborsAt(pos, block);
                                if (rotState.getDirectSignal(world, pos, (Direction)rotState.getValue(BlockStateProperties.HORIZONTAL_FACING)) > 0) {
                                    world.updateNeighborsAt(pos.relative(((Direction)state.getValue(BlockStateProperties.HORIZONTAL_FACING)).getOpposite()), block);
                                    world.updateNeighborsAt(pos.relative(((Direction)rotState.getValue(BlockStateProperties.HORIZONTAL_FACING)).getOpposite()), block);
                                }
                            }

                            return true;
                        }
                    }

                    return true;
                } else if (properties.contains(BlockStateProperties.AXIS)) {
                    switch ((Direction.Axis)state.getValue(BlockStateProperties.AXIS)) {
                        case Y:
                            rotState = (BlockState)state.setValue(BlockStateProperties.AXIS, Direction.Axis.X);
                            break;
                        case X:
                            rotState = (BlockState)state.setValue(BlockStateProperties.AXIS, Direction.Axis.Z);
                            break;
                        default:
                            rotState = (BlockState)state.setValue(BlockStateProperties.AXIS, Direction.Axis.Y);
                    }

                    if (rotState != state && rotState.canSurvive(world, pos)) {
                        world.setBlockAndUpdate(pos, rotState);
                    }

                    return true;
                } else if (properties.contains(BlockStateProperties.FACING_HOPPER)) {
                    rotState = (BlockState)state.setValue(BlockStateProperties.FACING_HOPPER, Rotation.CLOCKWISE_90.rotate((Direction)state.getValue(BlockStateProperties.FACING_HOPPER)));
                    if (rotState != state && rotState.canSurvive(world, pos)) {
                        world.setBlockAndUpdate(pos, rotState);
                    }

                    return true;
                } else {
                    if (properties.contains(BlockStateProperties.ROTATION_16)) {
                        rotState = (BlockState)state.setValue(BlockStateProperties.ROTATION_16, ((Integer)state.getValue(BlockStateProperties.ROTATION_16) + 1) % 16);
                        if (rotState != state && rotState.canSurvive(world, pos)) {
                            world.setBlockAndUpdate(pos, rotState);
                            return true;
                        }
                    }

                    if (state.getBlock() instanceof BaseRailBlock) {
                        rotState = state.rotate(world, pos, Rotation.CLOCKWISE_90);
                        if (rotState != state && rotState.canSurvive(world, pos)) {
                            world.setBlockAndUpdate(pos, rotState);
                            return true;
                        }
                    }

                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public static Direction left(Direction face) {
        return (Direction)SIDE_LEFT_LOOKUP.get(face);
    }

    public static Direction right(Direction face) {
        return (Direction)SIDE_RIGHT_LOOKUP.get(face);
    }

    public static Direction opposite(Direction face) {
        return (Direction)SIDE_OPPOSITE_LOOKUP.get(face);
    }

    public static Direction above(Direction face) {
        return (Direction)SIDE_ABOVE_LOOKUP.get(face);
    }

    public static Direction below(Direction face) {
        return (Direction)SIDE_BELOW_LOOKUP.get(face);
    }

    public static boolean isAxial(BlockPos pos) {
        return pos.getX() == 0 ? pos.getY() == 0 || pos.getZ() == 0 : pos.getY() == 0 && pos.getZ() == 0;
    }

    @Nullable
    public static Direction getSide(BlockPos pos) {
        if (!isAxial(pos)) {
            return null;
        } else if (pos.getY() < 0) {
            return Direction.DOWN;
        } else if (pos.getY() > 0) {
            return Direction.UP;
        } else if (pos.getZ() < 0) {
            return Direction.NORTH;
        } else if (pos.getZ() > 0) {
            return Direction.SOUTH;
        } else if (pos.getX() < 0) {
            return Direction.WEST;
        } else {
            return pos.getX() > 0 ? Direction.EAST : null;
        }
    }

    private static EnumMap<Direction, Direction> computeMap(byte[] arr) {
        EnumMap<Direction, Direction> map = new EnumMap(Direction.class);

        for(int i = 0; i < 6; ++i) {
            map.put(DIR_VALUES[i], DIR_VALUES[arr[i]]);
        }

        return map;
    }

    static {
        SIDE_LEFT_LOOKUP = computeMap(SIDE_LEFT);
        SIDE_RIGHT_LOOKUP = computeMap(SIDE_RIGHT);
        SIDE_OPPOSITE_LOOKUP = computeMap(SIDE_OPPOSITE);
        SIDE_ABOVE_LOOKUP = computeMap(SIDE_ABOVE);
        SIDE_BELOW_LOOKUP = computeMap(SIDE_BELOW);
        ROTATE_CLOCK_Y = new byte[]{0, 1, 4, 5, 3, 2};
        ROTATE_CLOCK_Z = new byte[]{5, 4, 2, 3, 0, 1};
        ROTATE_CLOCK_X = new byte[]{2, 3, 1, 0, 4, 5};
        ROTATE_COUNTER_Y = new byte[]{0, 1, 5, 4, 2, 3};
        ROTATE_COUNTER_Z = new byte[]{4, 5, 2, 3, 1, 0};
        ROTATE_COUNTER_X = new byte[]{3, 2, 0, 1, 4, 5};
        INVERT_AROUND_Y = new byte[]{0, 1, 3, 2, 5, 4};
        INVERT_AROUND_Z = new byte[]{1, 0, 2, 3, 5, 4};
        INVERT_AROUND_X = new byte[]{1, 0, 3, 2, 4, 5};
    }
}
