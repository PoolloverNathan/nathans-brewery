package net.poollovernathan.brewery;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NathansBrewery implements ModInitializer {

	public static final Item STEEL_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item STEEL_NUGGET = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(10).breakByTool(FabricToolTags.PICKAXES, 2));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("nathansbrewery", "steel_ingot"), STEEL_INGOT);
		Registry.register(Registry.ITEM, new Identifier("nathansbrewery", "steel_nugget"), STEEL_NUGGET);
		Registry.register(Registry.BLOCK, new Identifier("nathansbrewery", "steel_block"), STEEL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("nathansbrewery", "steel_block"), new BlockItem(STEEL_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		System.out.println("Hello Fabric world!");
	}
}
