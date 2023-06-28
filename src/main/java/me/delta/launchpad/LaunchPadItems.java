package me.delta.launchpad;

import eu.pb4.polymer.core.api.item.PolymerBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import me.delta.launchpad.block.Launchpad;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import static me.delta.launchpad.Launchpads.MOD_ID;

@SuppressWarnings("unused")
public class LaunchPadItems {
    public static final Item OAK_LAUNCH_PAD = getItem(LaunchPadBlocks.OAK_LAUNCH_PAD);
    public static final Item SPRUCE_LAUNCH_PAD = getItem(LaunchPadBlocks.SPRUCE_LAUNCH_PAD);
    public static final Item BIRCH_LAUNCH_PAD = getItem(LaunchPadBlocks.BIRCH_LAUNCH_PAD);
    public static final Item JUNGLE_LAUNCH_PAD = getItem(LaunchPadBlocks.JUNGLE_LAUNCH_PAD);
    public static final Item ACACIA_LAUNCH_PAD = getItem(LaunchPadBlocks.ACACIA_LAUNCH_PAD);
    public static final Item DARK_OAK_LAUNCH_PAD = getItem(LaunchPadBlocks.DARK_OAK_LAUNCH_PAD);
    public static final Item MANGROVE_LAUNCH_PAD = getItem(LaunchPadBlocks.MANGROVE_LAUNCH_PAD);
    public static final Item CHERRY_LAUNCH_PAD = getItem(LaunchPadBlocks.CHERRY_LAUNCH_PAD);
    public static final Item BAMBOO_LAUNCH_PAD = getItem(LaunchPadBlocks.BAMBOO_LAUNCH_PAD);
    public static final Item CRIMSON_LAUNCH_PAD = getItem(LaunchPadBlocks.CRIMSON_LAUNCH_PAD);
    public static final Item WARPED_LAUNCH_PAD = getItem(LaunchPadBlocks.WARPED_LAUNCH_PAD);
    public static final Item STONE_LAUNCH_PAD = getItem(LaunchPadBlocks.STONE_LAUNCH_PAD);
    public static final Item BLACKSTONE_LAUNCH_PAD = getItem(LaunchPadBlocks.BLACKSTONE_LAUNCH_PAD);
    public static final Item IRON_LAUNCH_PAD = getItem(LaunchPadBlocks.IRON_LAUNCH_PAD);
    public static final Item GOLDEN_LAUNCH_PAD = getItem(LaunchPadBlocks.GOLDEN_LAUNCH_PAD);

    private static Item getItem(Launchpad pad)
    {
        return new PolymerBlockItem(pad, new Item.Settings(), pad.getVirtualBlock().asItem());
    }

    private static void registerItem(String name, Item item)
    {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    static void register() {
        registerItem("oak_launchpad", OAK_LAUNCH_PAD);
        registerItem("spruce_launchpad", SPRUCE_LAUNCH_PAD);
        registerItem("birch_launchpad", BIRCH_LAUNCH_PAD);
        registerItem("jungle_launchpad", JUNGLE_LAUNCH_PAD);
        registerItem("acacia_launchpad", ACACIA_LAUNCH_PAD);
        registerItem("dark_oak_launchpad", DARK_OAK_LAUNCH_PAD);
        registerItem("mangrove_launchpad", MANGROVE_LAUNCH_PAD);
        registerItem("cherry_launchpad", CHERRY_LAUNCH_PAD);
        registerItem("bamboo_launchpad", BAMBOO_LAUNCH_PAD);
        registerItem("crimson_launchpad", CRIMSON_LAUNCH_PAD);
        registerItem("warped_launchpad", WARPED_LAUNCH_PAD);
        registerItem("stone_launchpad", STONE_LAUNCH_PAD);
        registerItem("blackstone_launchpad", BLACKSTONE_LAUNCH_PAD);
        registerItem("iron_launchpad", IRON_LAUNCH_PAD);
        registerItem("gold_launchpad", GOLDEN_LAUNCH_PAD);

        PolymerItemGroupUtils.registerPolymerItemGroup(new Identifier(MOD_ID, "launchpads"), FabricItemGroup.builder()
                .icon(IRON_LAUNCH_PAD::getDefaultStack)
                .displayName(Text.translatable("category.launchpad.title"))
                .entries((ctx, entries) -> {
                    entries.add(OAK_LAUNCH_PAD);
                    entries.add(SPRUCE_LAUNCH_PAD);
                    entries.add(BIRCH_LAUNCH_PAD);
                    entries.add(JUNGLE_LAUNCH_PAD);
                    entries.add(ACACIA_LAUNCH_PAD);
                    entries.add(DARK_OAK_LAUNCH_PAD);
                    entries.add(MANGROVE_LAUNCH_PAD);
                    entries.add(CHERRY_LAUNCH_PAD);
                    entries.add(BAMBOO_LAUNCH_PAD);
                    entries.add(CRIMSON_LAUNCH_PAD);
                    entries.add(WARPED_LAUNCH_PAD);
                    entries.add(STONE_LAUNCH_PAD);
                    entries.add(BLACKSTONE_LAUNCH_PAD);
                    entries.add(IRON_LAUNCH_PAD);
                    entries.add(GOLDEN_LAUNCH_PAD);
                })
                .build());
    }
}
