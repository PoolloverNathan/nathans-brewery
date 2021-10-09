package net.poollovernathan.brewery;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Helpers {
    public static String MODID;
    public static void registerSimpleItem(String name, FabricItemSettings settings) {
        Item item = new Item(settings);
        Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
    }

    public static void registerSimpleItem(String name, ItemGroup group) {
        registerSimpleItem(name, new FabricItemSettings().group(group));
    }

    public static void registerSimpleItem(String name) {
        registerSimpleItem(name, ItemGroup.MISC);
    }
}
