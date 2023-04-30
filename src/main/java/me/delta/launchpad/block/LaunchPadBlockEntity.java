package me.delta.launchpad.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;

import static me.delta.launchpad.LaunchPadBlocks.LAUNCH_PAD_ENTITY;

public class LaunchPadBlockEntity extends BlockEntity {
    public static final String PITCH_KEY = "Pitch";
    public static final String YAW_KEY = "Yaw";
    public static final String POWER_KEY = "Power";
    public static final float DEFAULT_POWER = 4;
    private Optional<Float> pitch = Optional.empty();
    private Optional<Float> yaw = Optional.empty();
    private float power = DEFAULT_POWER;

    public LaunchPadBlockEntity(BlockPos pos, BlockState state)
    {
        super(LAUNCH_PAD_ENTITY, pos, state);
    }

    public Optional<Float> getPitch()
    {
        return this.pitch;
    }

    public Optional<Float> getYaw()
    {
        return this.yaw;
    }


    public float getPower() {
        return this.power;
    }

    @Override
    protected void writeNbt(NbtCompound nbt)
    {
        super.writeNbt(nbt);
        pitch.ifPresent(pitch -> nbt.putFloat(PITCH_KEY, pitch));
        yaw.ifPresent(yaw -> nbt.putFloat(YAW_KEY, yaw));
        nbt.putFloat(POWER_KEY, this.power);
    }

    @Override
    public void readNbt(NbtCompound nbt)
    {
        super.readNbt(nbt);
        if(nbt.contains(PITCH_KEY)) this.pitch = Optional.of(nbt.getFloat(PITCH_KEY));
        if (nbt.contains(YAW_KEY)) this.yaw = Optional.of(nbt.getFloat(YAW_KEY));
        this.power = nbt.getFloat(POWER_KEY);
    }
}
