package net.prismaxtic.thebackrooms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.prismaxtic.thebackrooms.TheBackrooms;
import net.prismaxtic.thebackrooms.block.ModBlocks;

public class ModItemGroups {
    //The creative item tab group
    public static final ItemGroup BACKROOMS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TheBackrooms.MOD_ID, "backrooms"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.backrooms"))
                    .icon(() -> new ItemStack(ModBlocks.BACKROOMS_LEVEL_0_WALL)).entries((displayContext, entries) -> {
                        //Add the mod items here (make it in order of what you want the menu order to be in)

                        entries.add(ModBlocks.BACKROOMS_LEVEL_0_WALL);

                        entries.add(ModBlocks.BACKROOMS_LEVEL_0_WALL_BOTTOM);

                        entries.add(ModBlocks.BACKROOMS_LEVEL_0_CEILING);

                        entries.add(ModBlocks.BACKROOMS_LEVEL_0_LIGHT);

                        entries.add(ModBlocks.BACKROOMS_LEVEL_0_CARPET);

                        entries.add(ModBlocks.BACKROOMS_VOID);

                        entries.add(ModItems.ALMONDWATER);

                        entries.add(ModBlocks.BACKROOMS_ALMONDWATER_BLOCK);

                        entries.add(ModItems.ALMOND);

                        entries.add(ModItems.UNDERTALES);

                        entries.add(ModItems.BURNINGMEMORY);



                    }).build());

    public static void registerItemGroups() {
        TheBackrooms.LOGGER.info("Registering Item Groups For " + TheBackrooms.MOD_ID);
    }
}
