package net.prismaxtic.thebackrooms.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prismaxtic.thebackrooms.TheBackrooms;
import net.prismaxtic.thebackrooms.sound.ModSounds;

public class ModItems {
    //This is how to make a new item, dupe it to make a new one
    public static final Item ALMOND = registerItem("almond", new Item(new FabricItemSettings()));

    public static final Item ALMONDWATER = registerItem("almondwater",
            new Item(new FabricItemSettings().food(ModFoodComponents.ALMONDWATER).maxCount(1)));

    public static final Item UNDERTALES = registerItem("undertales",
            new MusicDiscItem(7, ModSounds.UNDERTALES, new FabricItemSettings().maxCount(1), 84));

    public static final Item BURNINGMEMORY = registerItem("burningmemory",
            new MusicDiscItem(7, ModSounds.BURNINGMEMORY, new FabricItemSettings().maxCount(1), 213));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheBackrooms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheBackrooms.LOGGER.info("Registering Mod Items for " + TheBackrooms.MOD_ID);

    }
}
