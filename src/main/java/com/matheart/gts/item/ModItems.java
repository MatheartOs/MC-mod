package com.matheart.gts.item;

import com.matheart.gts.GTS;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CAICAIBEI = registerItems("ccb",new Item(new FabricItemSettings()));
    public static final Item JIUCAIHEZI = registerItems("jiucaihezi",new Item(new FabricItemSettings()));
    public static final Item MS_100 = registerItems("ms_100",new Item(new FabricItemSettings()));
    public static final Item MB_100 = registerItems("mb_100",new Item(new FabricItemSettings()));
    public static final Item AC_CORE = registerItems("ac_core",new Item(new FabricItemSettings()));

    /*public static void addItemsToItemGroup_0(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ITEM_1);
    }
    public static void addItemsToItemGroup_1(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ITEM_2);
    } */



    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(GTS.MOD_ID,name),item);
    }
    public static void registerModItems(){
        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup_0);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToItemGroup_1);*/
    }
}
