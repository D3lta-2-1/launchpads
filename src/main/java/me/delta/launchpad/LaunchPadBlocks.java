package me.delta.launchpad;

import eu.pb4.polymer.core.api.block.PolymerBlockUtils;
import me.delta.launchpad.block.LaunchPadBlockEntity;
import me.delta.launchpad.block.Launchpad;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static me.delta.launchpad.Launchpads.MOD_ID;

public class LaunchPadBlocks {
    public static final Launchpad OAK_LAUNCH_PAD = createPad(Blocks.OAK_PRESSURE_PLATE);
    public static final Launchpad SPRUCE_LAUNCH_PAD = createPad(Blocks.SPRUCE_PRESSURE_PLATE);
    public static final Launchpad BIRCH_LAUNCH_PAD = createPad(Blocks.BIRCH_PRESSURE_PLATE);
    public static final Launchpad JUNGLE_LAUNCH_PAD = createPad(Blocks.JUNGLE_PRESSURE_PLATE);
    public static final Launchpad ACACIA_LAUNCH_PAD = createPad(Blocks.ACACIA_PRESSURE_PLATE);
    public static final Launchpad DARK_OAK_LAUNCH_PAD = createPad(Blocks.DARK_OAK_PRESSURE_PLATE);
    public static final Launchpad MANGROVE_LAUNCH_PAD = createPad(Blocks.MANGROVE_PRESSURE_PLATE);
    public static final Launchpad CHERRY_LAUNCH_PAD = createPad(Blocks.CHERRY_PRESSURE_PLATE);
    public static final Launchpad BAMBOO_LAUNCH_PAD = createPad(Blocks.BAMBOO_PRESSURE_PLATE);
    public static final Launchpad CRIMSON_LAUNCH_PAD = createPad(Blocks.CRIMSON_PRESSURE_PLATE);
    public static final Launchpad WARPED_LAUNCH_PAD = createPad(Blocks.WARPED_PRESSURE_PLATE);
    public static final Launchpad STONE_LAUNCH_PAD = createPad(Blocks.STONE_PRESSURE_PLATE);
    public static final Launchpad BLACKSTONE_LAUNCH_PAD = createPad(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE);
    public static final Launchpad GOLDEN_LAUNCH_PAD = createPad(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
    public static final Launchpad IRON_LAUNCH_PAD = createPad(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);

    private static Launchpad createPad(Block baseBlock)
    {
        assert baseBlock instanceof PressurePlateBlock;
        return new Launchpad(FabricBlockSettings.copyOf(baseBlock), baseBlock);
    }
    public static final BlockEntityType<LaunchPadBlockEntity> LAUNCH_PAD_ENTITY =  FabricBlockEntityTypeBuilder.create(LaunchPadBlockEntity::new,
            OAK_LAUNCH_PAD,
            SPRUCE_LAUNCH_PAD,
            BIRCH_LAUNCH_PAD,
            JUNGLE_LAUNCH_PAD,
            ACACIA_LAUNCH_PAD,
            DARK_OAK_LAUNCH_PAD,
            MANGROVE_LAUNCH_PAD,
            CHERRY_LAUNCH_PAD,
            BAMBOO_LAUNCH_PAD,
            CRIMSON_LAUNCH_PAD,
            WARPED_LAUNCH_PAD,
            STONE_LAUNCH_PAD,
            BLACKSTONE_LAUNCH_PAD,
            GOLDEN_LAUNCH_PAD,
            IRON_LAUNCH_PAD
    ).build();

    private static void register(String string, Launchpad launchpad)
    {
        Registry.register(Registries.BLOCK ,new Identifier(MOD_ID, string), launchpad);
    }

    static void register()
    {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "launchpad"), LAUNCH_PAD_ENTITY);
        PolymerBlockUtils.registerBlockEntity(LAUNCH_PAD_ENTITY);

        register("oak_launchpad", OAK_LAUNCH_PAD);
        register("spruce_launchpad", SPRUCE_LAUNCH_PAD);
        register("birch_launchpad", BIRCH_LAUNCH_PAD);
        register("jungle_launchpad", JUNGLE_LAUNCH_PAD);
        register("acacia_launchpad", ACACIA_LAUNCH_PAD);
        register("dark_oak_launchpad", DARK_OAK_LAUNCH_PAD);
        register("mangrove_launchpad", MANGROVE_LAUNCH_PAD);
        register("cherry_launchpad", CHERRY_LAUNCH_PAD);
        register("bamboo_launchpad", BAMBOO_LAUNCH_PAD);
        register("crimson_launchpad", CRIMSON_LAUNCH_PAD);
        register("warped_launchpad", WARPED_LAUNCH_PAD);
        register("stone_launchpad", STONE_LAUNCH_PAD);
        register("blackstone_launchpad", BLACKSTONE_LAUNCH_PAD);
        register("golden_launchpad", GOLDEN_LAUNCH_PAD);
        register("iron_launchpad", IRON_LAUNCH_PAD);
    }
}
