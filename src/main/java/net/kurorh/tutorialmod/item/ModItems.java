package net.kurorh.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kurorh.tutorialmod.TutorialMod;
import net.kurorh.tutorialmod.item.custom.ChiselItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Registering the Pink Garnet
    public static final Item PINK_GARNET = registerItem( "pink_garnet", new Item(new Item.Settings()));
    // Registering the Raw Pink Garnet
    public static final Item RAW_PINK_GARNET = registerItem( "raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    // Helper method to register an item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    // Method to register all mod items and add them to the INGREDIENTS item group
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering mod items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
        });
    }
}