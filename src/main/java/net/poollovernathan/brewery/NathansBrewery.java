package net.poollovernathan.brewery;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.poollovernathan.brewery.machines.*;
import net.poollovernathan.brewery.effects.*;

public class NathansBrewery implements ModInitializer {

	public static final String MODID = "nathansbrewery";

	public static final Block STEEL_BLOCK       = new Block    (FabricBlockSettings.of(Material.METAL).hardness(10).breakByTool(FabricToolTags.PICKAXES, 2));
	public static final Item  STEEL_BLOCK_i     = new BlockItem(STEEL_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Block MIXER             = new Mixer    (FabricBlockSettings.of(Material.METAL).hardness(8));
	public static final Item  MIXER_i           = new BlockItem(MIXER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Block MIXER_FRAME       = new Block    (FabricBlockSettings.of(Material.METAL).hardness(4));
	public static final Item  MIXER_FRAME_i     = new BlockItem(MIXER_FRAME, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		Registry.register(Registry.BLOCK, new Identifier(MODID, "steel_block"),       STEEL_BLOCK);
		Registry.register(Registry.ITEM,  new Identifier(MODID, "steel_block"),       STEEL_BLOCK_i);
		Registry.register(Registry.BLOCK, new Identifier(MODID, "mixer"),             MIXER);
		Registry.register(Registry.ITEM,  new Identifier(MODID, "mixer"),             MIXER_i);
		Registry.register(Registry.BLOCK, new Identifier(MODID, "mixer_frame"),       MIXER_FRAME);
		Registry.register(Registry.ITEM,  new Identifier(MODID, "mixer_frame"),       MIXER_FRAME_i);
		registerSimpleItem("steel_ingot");
		registerSimpleItem("steel_nugget");
		registerSimpleItem("crushed_coal");
		registerSimpleItem("tiny_crushed_coal");
		registerSimpleItem("quill", ItemGroup.TOOLS);
		registerSimpleItem("diagram", ItemGroup.MATERIALS);
		registerSimpleItem("copper_wire");
		registerSimpleItem("copper_plate");
		registerSimpleItem("copper_rod");
		registerSimpleItem("crushed_iron");
		registerSimpleItem("crushed_tin");
		registerSimpleItem("depleted_redstone_battery");
		registerSimpleItem("full_redstone_battery");
		registerSimpleItem("redstone_clump");
		registerSimpleItem("tin_ingot");
		registerSimpleItem("tin_nugget");
		registerSimpleItem("tin_plate");
		registerSimpleItem("tin_rod");
		registerSimpleItem("written_paper");

		Registry.register(Registry.STATUS_EFFECT, new Identifier(MODID, "exp"), new Exp());
		System.out.println("Hello Fabric world!");
	}

	private void registerSimpleItem(String name, FabricItemSettings settings) {
		Item item = new Item(settings);
		Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
	}

	private void registerSimpleItem(String name, ItemGroup group) {
		registerSimpleItem(name, new FabricItemSettings().group(group));
	}

	private void registerSimpleItem(String name) {
		registerSimpleItem(name, ItemGroup.MISC);
	}
}
