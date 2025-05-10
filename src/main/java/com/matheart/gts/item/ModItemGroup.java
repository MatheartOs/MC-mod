package com.matheart.gts.item;

import com.matheart.gts.GTS;
import com.matheart.gts.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup GTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GTS.MOD_ID,"gts_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.gts_group"))
                    .icon(()->new ItemStack(ModItems.AC_CORE)).entries((displayContext, entries) -> {
                entries.add(new ItemStack(ModItems.CAICAIBEI));
                entries.add(new ItemStack(ModItems.JIUCAIHEZI));
                entries.add(ModBlocks.BLOCK_1);
                entries.add(ModBlocks.TLE);
                entries.add(ModBlocks.MLE);
                entries.add(ModBlocks.ACCEPT);
                entries.add(new ItemStack(ModItems.MB_100));
                entries.add(new ItemStack(ModItems.MS_100));
                entries.add(new ItemStack(ModItems.AC_CORE));
            }).build());
    public static void registerModItemGroup(){
    }
}
