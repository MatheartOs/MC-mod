package com.matheart.gts.block;

import com.matheart.gts.GTS;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLOCK_1 = registerBlocks("block_1",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ACCEPT = registerBlocks("ac",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TLE = registerBlocks("tle",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block MLE = registerBlocks("mle",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    // this is history 1
    // this is history 2
    // this is history 3

    private static Block registerBlocks(String name, Block block) {
        registerBlcokItems(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(GTS.MOD_ID,name),block);

    };
    private static Item registerBlcokItems(String name, Block block) {
        return Registry.register(Registries.ITEM,new Identifier(GTS.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){

    }
}
