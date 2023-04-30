package me.delta.launchpad;

import eu.pb4.polymer.core.api.item.PolymerBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import me.delta.launchpad.block.Launchpad;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
    public static final Item GOLD_LAUNCH_PAD = getItem(LaunchPadBlocks.GOLD_LAUNCH_PAD);

    public static final ItemGroup ITEM_GROUP = PolymerItemGroupUtils.builder(new Identifier(MOD_ID, MOD_ID))
            .icon(IRON_LAUNCH_PAD::getDefaultStack)
            .displayName(Text.translatable("category.launchpad.title"))
            .build();
    private static Item getItem(Launchpad pad)
    {
        return new PolymerBlockItem(pad, new Item.Settings(), pad.getVirtualBlock().asItem());
    }

    private static void registerItem(String name, Item item)
    {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    static void register()
    {
        registerItem("oak_launch_pad", OAK_LAUNCH_PAD);
        registerItem("spruce_launch_pad", SPRUCE_LAUNCH_PAD);
        registerItem("birch_launch_pad", BIRCH_LAUNCH_PAD);
        registerItem("jungle_launch_pad", JUNGLE_LAUNCH_PAD);
        registerItem("acacia_launch_pad", ACACIA_LAUNCH_PAD);
        registerItem("dark_oak_launch_pad", DARK_OAK_LAUNCH_PAD);
        registerItem("mangrove_launch_pad", MANGROVE_LAUNCH_PAD);
        registerItem("cherry_launch_pad", CHERRY_LAUNCH_PAD);
        registerItem("bamboo_launch_pad", BAMBOO_LAUNCH_PAD);
        registerItem("crimson_launch_pad", CRIMSON_LAUNCH_PAD);
        registerItem("warped_launch_pad", WARPED_LAUNCH_PAD);
        registerItem("stone_launch_pad", STONE_LAUNCH_PAD);
        registerItem("blackstone_launch_pad", BLACKSTONE_LAUNCH_PAD);
        registerItem("iron_launch_pad", IRON_LAUNCH_PAD);
        registerItem("gold_launch_pad", GOLD_LAUNCH_PAD);

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.add(OAK_LAUNCH_PAD);
            content.add(SPRUCE_LAUNCH_PAD);
            content.add(BIRCH_LAUNCH_PAD);
            content.add(JUNGLE_LAUNCH_PAD);
            content.add(ACACIA_LAUNCH_PAD);
            content.add(DARK_OAK_LAUNCH_PAD);
            content.add(MANGROVE_LAUNCH_PAD);
            content.add(CHERRY_LAUNCH_PAD);
            content.add(BAMBOO_LAUNCH_PAD);
            content.add(CRIMSON_LAUNCH_PAD);
            content.add(WARPED_LAUNCH_PAD);
            content.add(STONE_LAUNCH_PAD);
            content.add(BLACKSTONE_LAUNCH_PAD);
            content.add(GOLD_LAUNCH_PAD);
            content.add(IRON_LAUNCH_PAD);
        });
    }
}
