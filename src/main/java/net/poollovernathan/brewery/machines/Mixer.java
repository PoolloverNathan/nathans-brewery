package net.poollovernathan.brewery.machines;

import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.poollovernathan.brewery.SimpleDirectional;

public class Mixer extends SimpleDirectional {

    public Mixer(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockView view, BlockPos pos, ShapeContext ctx) {
        return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
    }

}