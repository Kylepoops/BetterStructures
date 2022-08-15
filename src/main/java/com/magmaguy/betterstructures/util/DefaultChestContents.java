package com.magmaguy.betterstructures.util;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class DefaultChestContents {
    public static double normalChance = 0.02;
    public static double lowChance = 0.01;
    public static double extraRare = 0.002;

    public static List<String> overworldContents() {
        List<String> list = new ArrayList<>();
        list.add(generateEntry(Material.COAL, 2, 5, normalChance));
        list.add(generateEntry(Material.BONE, 2, 5, normalChance));
        list.add(generateEntry(Material.BOOK, 1, 3, normalChance));
        list.add(generateEntry(Material.CANDLE, 1, 5, normalChance));
        list.add(generateEntry(Material.EXPERIENCE_BOTTLE, 1, 2, normalChance));
        list.add(generateEntry(Material.ENCHANTED_GOLDEN_APPLE, 1, 1, extraRare));
        //list.add(generateEntry(Material.MUSIC_DISC_5, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_11, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_13, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_BLOCKS, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_CAT, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_CHIRP, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_FAR, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_MALL, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_MELLOHI, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_OTHERSIDE, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_PIGSTEP, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_STAL, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_STRAD, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_WAIT, 1, 1, normalChance));
        list.add(generateEntry(Material.MUSIC_DISC_WARD, 1, 1, normalChance));
        list.add(generateEntry(Material.HEART_OF_THE_SEA, 1, 1, normalChance));
        list.add(generateEntry(Material.LODESTONE, 1, 1, normalChance));
        //list.add(generateEntry(Material.GOAT_HORN, 1, 1, normalChance));
        list.add(generateEntry(Material.SNOWBALL, 5, 20, normalChance));
        list.add(generateEntry(Material.PAPER, 5, 10, normalChance));
        list.add(generateEntry(Material.APPLE, 2, 5, normalChance));
        list.add(generateEntry(Material.CACTUS, 1, 3, normalChance));
        list.add(generateEntry(Material.PACKED_ICE, 1, 3, normalChance));
        list.add(generateEntry(Material.COOKED_COD, 2, 4, normalChance));
        list.add(generateEntry(Material.COOKED_BEEF, 2, 4, normalChance));
        list.add(generateEntry(Material.COOKED_CHICKEN, 2, 4, normalChance));
        list.add(generateEntry(Material.COOKED_MUTTON, 2, 4, normalChance));
        list.add(generateEntry(Material.COOKED_PORKCHOP, 2, 4, normalChance));
        list.add(generateEntry(Material.COOKED_RABBIT, 2, 4, normalChance));
        list.add(generateEntry(Material.COOKED_SALMON, 2, 4, normalChance));
        list.add(generateEntry(Material.WOODEN_AXE, 1, 1, normalChance));
        list.add(generateEntry(Material.WOODEN_PICKAXE, 1, 1, normalChance));
        list.add(generateEntry(Material.LEATHER_HELMET, 1, 1, normalChance));
        list.add(generateEntry(Material.LEATHER_CHESTPLATE, 1, 1, normalChance));
        list.add(generateEntry(Material.LEATHER_LEGGINGS, 1, 1, normalChance));
        list.add(generateEntry(Material.LEATHER_BOOTS, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_SWORD, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_AXE, 1, 1, normalChance));
        list.add(generateEntry(Material.ACACIA_SAPLING, 1, 1, normalChance));
        list.add(generateEntry(Material.BIRCH_SAPLING, 1, 1, normalChance));
        list.add(generateEntry(Material.BAMBOO_SAPLING, 1, 1, normalChance));
        list.add(generateEntry(Material.JUNGLE_SAPLING, 1, 1, normalChance));
        list.add(generateEntry(Material.DARK_OAK_SAPLING, 1, 1, normalChance));
        list.add(generateEntry(Material.OAK_SAPLING, 1, 1, normalChance));
        list.add(generateEntry(Material.ROTTEN_FLESH, 2, 6, normalChance));
        list.add(generateEntry(Material.OAK_PLANKS, 3, 10, normalChance));
        list.add(generateEntry(Material.ACACIA_PLANKS, 3, 10, normalChance));
        list.add(generateEntry(Material.BIRCH_PLANKS, 3, 10, normalChance));
        list.add(generateEntry(Material.JUNGLE_PLANKS, 3, 10, normalChance));
        list.add(generateEntry(Material.DARK_OAK_PLANKS, 3, 10, normalChance));
        //list.add(generateEntry(Material.MANGROVE_PLANKS, 3, 10, normalChance));
        list.add(generateEntry(Material.SPRUCE_PLANKS, 3, 10, normalChance));
        list.add(generateEntry(Material.STICK, 3, 15, normalChance));
        list.add(generateEntry(Material.TORCH, 2, 5, normalChance));
        list.add(generateEntry(Material.TNT, 1, 4, normalChance));
        list.add(generateEntry(Material.BREAD, 1, 6, normalChance));
        list.add(generateEntry(Material.SALMON, 2, 5, normalChance));
        list.add(generateEntry(Material.FEATHER, 2, 8, normalChance));
        list.add(generateEntry(Material.EMERALD, 1, 6, normalChance));
        list.add(generateEntry(Material.GUNPOWDER, 1, 6, normalChance));
        list.add(generateEntry(Material.SAND, 1, 10, normalChance));
        list.add(generateEntry(Material.WHEAT_SEEDS, 1, 4, normalChance));
        list.add(generateEntry(Material.CARROT, 1, 4, normalChance));
        list.add(generateEntry(Material.POTATO, 1, 4, normalChance));
        list.add(generateEntry(Material.WHITE_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.BLACK_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.BLUE_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.BROWN_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.CYAN_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.GRAY_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.GREEN_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.LIGHT_BLUE_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.LIGHT_GRAY_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.LIME_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.MAGENTA_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.ORANGE_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.PINK_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.PURPLE_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.RED_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.YELLOW_WOOL, 1, 6, normalChance));
        list.add(generateEntry(Material.BAKED_POTATO, 1, 5, normalChance));
        list.add(generateEntry(Material.GOLDEN_CARROT, 1, 3, extraRare));
        list.add(generateEntry(Material.SUSPICIOUS_STEW, 1, 3, lowChance));
        list.add(generateEntry(Material.BAMBOO, 2, 7, normalChance));
        list.add(generateEntry(Material.BEEF, 2, 5, normalChance));
        list.add(generateEntry(Material.MUTTON, 2, 5, normalChance));
        list.add(generateEntry(Material.ARROW, 1, 7, normalChance));
        list.add(generateEntry(Material.SPECTRAL_ARROW, 1, 3, normalChance));
        list.add(generateEntry(Material.IRON_NUGGET, 1, 16, normalChance));
        list.add(generateEntry(Material.GOLD_NUGGET, 1, 16, lowChance));
        list.add(generateEntry(Material.STRING, 1, 5, normalChance));
        list.add(generateEntry(Material.LEATHER, 1, 4, normalChance));
        list.add(generateEntry(Material.FLINT, 1, 4, normalChance));
        list.add(generateEntry(Material.FIRE_CHARGE, 1, 3, lowChance));
        list.add(generateEntry(Material.COD, 1, 4, normalChance));
        list.add(generateEntry(Material.POISONOUS_POTATO, 1, 3, normalChance));
        list.add(generateEntry(Material.BAKED_POTATO, 1, 5, normalChance));
        list.add(generateEntry(Material.MOSS_BLOCK, 1, 5, normalChance));
        list.add(generateEntry(Material.IRON_SHOVEL, 1, 1, normalChance));
        list.add(generateEntry(Material.SWEET_BERRIES, 1, 3, normalChance));
        list.add(generateEntry(Material.STONE, 1, 32, normalChance));
        list.add(generateEntry(Material.STONE_BRICKS, 1, 16, normalChance));
        list.add(generateEntry(Material.SNOW_BLOCK, 1, 32, normalChance));
        list.add(generateEntry(Material.WHEAT_SEEDS, 1, 16, normalChance));
        list.add(generateEntry(Material.TRIPWIRE_HOOK, 1, 3, normalChance));
        list.add(generateEntry(Material.SPIDER_EYE, 1, 5, normalChance));
        list.add(generateEntry(Material.REDSTONE, 5, 32, normalChance));
        list.add(generateEntry(Material.ACACIA_LOG, 1, 5, normalChance));
        list.add(generateEntry(Material.BIRCH_LOG, 1, 5, normalChance));
        list.add(generateEntry(Material.DARK_OAK_LOG, 1, 5, normalChance));
        list.add(generateEntry(Material.JUNGLE_LOG, 1, 5, normalChance));
        //list.add(generateEntry(Material.MANGROVE_LOG, 1, 5, normalChance));
        list.add(generateEntry(Material.OAK_LOG, 1, 5, normalChance));
        list.add(generateEntry(Material.SPRUCE_LOG, 1, 5, normalChance));
        list.add(generateEntry(Material.STONE_AXE, 1, 1, normalChance));
        list.add(generateEntry(Material.STONE_PICKAXE, 1, 1, normalChance));
        list.add(generateEntry(Material.CHAIN, 1, 8, normalChance));
        list.add(generateEntry(Material.OBSIDIAN, 1, 5, lowChance));
        list.add(generateEntry(Material.BONE_BLOCK, 1, 4, normalChance));
        list.add(generateEntry(Material.PORKCHOP, 1, 5, normalChance));
        list.add(generateEntry(Material.BARREL, 1, 5, normalChance));
        list.add(generateEntry(Material.WATER_BUCKET, 1, 1, normalChance));
        list.add(generateEntry(Material.EGG, 1, 6, normalChance));
        list.add(generateEntry(Material.ENDER_PEARL, 1, 3, lowChance));
        list.add(generateEntry(Material.DANDELION, 1, 3, normalChance));
        list.add(generateEntry(Material.DIAMOND_HOE, 1, 1, extraRare));
        list.add(generateEntry(Material.FISHING_ROD, 1, 1, normalChance));
        list.add(generateEntry(Material.FLOWER_POT, 1, 1, normalChance));
        list.add(generateEntry(Material.SMOOTH_STONE, 1, 6, normalChance));
        list.add(generateEntry(Material.GOLDEN_HOE, 1, 1, lowChance));
        list.add(generateEntry(Material.GOLDEN_PICKAXE, 1, 1, lowChance));
        list.add(generateEntry(Material.GOLDEN_SHOVEL, 1, 1, lowChance));
        list.add(generateEntry(Material.GOLDEN_SWORD, 1, 1, lowChance));
        list.add(generateEntry(Material.GOLDEN_HELMET, 1, 1, lowChance));
        list.add(generateEntry(Material.GOLDEN_CHESTPLATE, 1, 1, lowChance));
        list.add(generateEntry(Material.GOLDEN_LEGGINGS, 1, 1, lowChance));
        list.add(generateEntry(Material.GOLDEN_BOOTS, 1, 1, lowChance));
        list.add(generateEntry(Material.FLINT_AND_STEEL, 1, 1, normalChance));
        list.add(generateEntry(Material.DIAMOND_HELMET, 1, 1, extraRare));
        list.add(generateEntry(Material.DIAMOND_LEGGINGS, 1, 1, extraRare));
        list.add(generateEntry(Material.DIAMOND_BOOTS, 1, 1, extraRare));
        list.add(generateEntry(Material.DIAMOND_SWORD, 1, 1, extraRare));
        list.add(generateEntry(Material.DIAMOND_AXE, 1, 1, extraRare));
        list.add(generateEntry(Material.CHAINMAIL_HELMET, 1, 1, lowChance));
        list.add(generateEntry(Material.CHAINMAIL_CHESTPLATE, 1, 1, lowChance));
        list.add(generateEntry(Material.CHAINMAIL_LEGGINGS, 1, 1, lowChance));
        list.add(generateEntry(Material.CHAINMAIL_BOOTS, 1, 1, lowChance));
        list.add(generateEntry(Material.LAPIS_LAZULI, 1, 6, normalChance));
        list.add(generateEntry(Material.PUMPKIN, 1, 3, normalChance));
        list.add(generateEntry(Material.CLAY_BALL, 1, 16, normalChance));
        list.add(generateEntry(Material.YELLOW_DYE, 1, 3, normalChance));
        list.add(generateEntry(Material.BLACK_DYE, 1, 3, normalChance));
        list.add(generateEntry(Material.BLUE_DYE, 1, 3, normalChance));
        list.add(generateEntry(Material.BROWN_DYE, 1, 3, normalChance));
        list.add(generateEntry(Material.CYAN_DYE, 1, 3, normalChance));
        list.add(generateEntry(Material.GRAY_DYE, 1, 3, normalChance));
        list.add(generateEntry(Material.GREEN_DYE, 1, 3, normalChance));
        list.add(generateEntry(Material.LIGHT_BLUE_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.LIGHT_GRAY_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.MAGENTA_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.ORANGE_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.PINK_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.PURPLE_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.RED_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.WHITE_DYE, 1, 8, normalChance));
        list.add(generateEntry(Material.DIAMOND_HORSE_ARMOR, 1, 1, extraRare));
        list.add(generateEntry(Material.GOLDEN_HORSE_ARMOR, 1, 1, lowChance));
        list.add(generateEntry(Material.IRON_HORSE_ARMOR, 1, 1, normalChance));
        list.add(generateEntry(Material.LEATHER_HORSE_ARMOR, 1, 1, normalChance));
        list.add(generateEntry(Material.LEATHER_HORSE_ARMOR, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_HELMET, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_CHESTPLATE, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_LEGGINGS, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_BOOTS, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_INGOT, 1, 6, lowChance));
        list.add(generateEntry(Material.GOLD_INGOT, 1, 6, extraRare));
        list.add(generateEntry(Material.CRYING_OBSIDIAN, 1, 4, normalChance));
        list.add(generateEntry(Material.CROSSBOW, 1, 1, normalChance));
        list.add(generateEntry(Material.ARROW, 1, 6, normalChance));
        list.add(generateEntry(Material.BOW, 1, 1, normalChance));
        list.add(generateEntry(Material.IRON_HELMET, 1, 1, normalChance));
        list.add(generateEntry(Material.STONE_SWORD, 1, 1, normalChance));
        list.add(generateEntry(Material.GOLDEN_APPLE, 1, 4, lowChance));
        list.add(generateEntry(Material.PUMPKIN_PIE, 1, 3, normalChance));
        list.add(generateEntry(Material.MAP, 1, 3, normalChance));
        list.add(generateEntry(Material.GLISTERING_MELON_SLICE, 1, 3, extraRare));
        list.add(generateEntry(Material.CLOCK, 1, 1, lowChance));
        list.add(generateEntry(Material.LIGHT_WEIGHTED_PRESSURE_PLATE, 1, 1, lowChance));
        list.add(generateEntry(Material.IRON_PICKAXE, 1, 1, normalChance));
        list.add(generateEntry(Material.BELL, 1, 1, lowChance));
        list.add(generateEntry(Material.NAME_TAG, 1, 3, normalChance));
        return list;
    }

    public static List<String> overworldUndergroundContents() {
        List<String> list = new ArrayList<>(overworldContents());
        list.add(generateEntry(Material.RAIL, 2, 5, normalChance));
        list.add(generateEntry(Material.ACTIVATOR_RAIL, 1, 3, lowChance));
        list.add(generateEntry(Material.POWERED_RAIL, 1, 5, lowChance));
        list.add(generateEntry(Material.IRON_BLOCK, 1, 3, lowChance));
        return list;
    }

    public static List<String> netherContents() {
        List<String> list = new ArrayList<>(overworldContents());
        list.add(generateEntry(Material.GOLD_BLOCK, 1, 3, extraRare));
        list.add(generateEntry(Material.GILDED_BLACKSTONE, 1, 6, lowChance));
        list.add(generateEntry(Material.NETHERITE_SCRAP, 1, 6, lowChance));
        list.add(generateEntry(Material.ANCIENT_DEBRIS, 1, 5, lowChance));
        list.add(generateEntry(Material.MAGMA_CREAM, 1, 5, normalChance));
        return list;
    }

    public static List<String> endContents() {
        List<String> list = new ArrayList<>(overworldContents());
        return list;
    }


    public static String generateEntry(Material material, int minAmount, int maxAmount, double chance) {
        return "material=" + material.toString() + ":amount=" + minAmount + "-" + maxAmount + ":chance=" + chance;
    }
}
