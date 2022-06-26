package com.magmaguy.betterstructures.config;

import com.magmaguy.betterstructures.MetadataHandler;
import com.magmaguy.betterstructures.util.ChatColorConverter;
import com.magmaguy.betterstructures.util.WarningMessage;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConfigurationEngine {
    public static File fileCreator(String path, String fileName) {
        File file = new File(MetadataHandler.PLUGIN.getDataFolder().getPath() + "/" + path + "/", fileName);
        return fileCreator(file);
    }

    public static File fileCreator(String fileName) {
        File file = new File(MetadataHandler.PLUGIN.getDataFolder().getPath(), fileName);
        return fileCreator(file);
    }

    public static File fileCreator(File file) {

        if (!file.exists())
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException ex) {
                Bukkit.getLogger().warning("[EliteMobs] Error generating the plugin file: " + file.getName());
            }

        return file;

    }

    public static FileConfiguration fileConfigurationCreator(File file) {
        return YamlConfiguration.loadConfiguration(file);
    }

    public static void fileSaverCustomValues(FileConfiguration fileConfiguration, File file) {
        fileConfiguration.options().copyDefaults(true);

        try {
            fileConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileSaverOnlyDefaults(FileConfiguration fileConfiguration, File file) {
        fileConfiguration.options().copyDefaults(true);
        UnusedNodeHandler.clearNodes(fileConfiguration);

        try {
            fileConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Boolean setBoolean(FileConfiguration fileConfiguration, String key, boolean defaultValue) {
        fileConfiguration.addDefault(key, defaultValue);
        return fileConfiguration.getBoolean(key);
    }

    public static String setString(FileConfiguration fileConfiguration, String key, String defaultValue) {
        fileConfiguration.addDefault(key, defaultValue);
        return ChatColorConverter.convert(fileConfiguration.getString(key));
    }

    public static int setInt(FileConfiguration fileConfiguration, String key, int defaultValue) {
        fileConfiguration.addDefault(key, defaultValue);
        return fileConfiguration.getInt(key);
    }

    public static double setDouble(FileConfiguration fileConfiguration, String key, double defaultValue) {
        fileConfiguration.addDefault(key, defaultValue);
        return fileConfiguration.getDouble(key);
    }

    public static List setList(FileConfiguration fileConfiguration, String key, List defaultValue) {
        fileConfiguration.addDefault(key, defaultValue);
        return fileConfiguration.getList(key);
    }

    /*
    public static ItemStack setItemStack(FileConfiguration fileConfiguration, String key, ItemStack itemStack) {
        fileConfiguration.addDefault(key + ".material", itemStack.getType().toString());
        if (itemStack.hasItemMeta() && itemStack.getItemMeta().hasDisplayName())
            fileConfiguration.addDefault(key + ".name", itemStack.getItemMeta().getDisplayName());
        if (itemStack.hasItemMeta() && itemStack.getItemMeta().hasLore())
            fileConfiguration.addDefault(key + ".lore", itemStack.getItemMeta().getLore());
        if (itemStack.getType().equals(Material.PLAYER_HEAD))
            fileConfiguration.addDefault(key + ".owner", ((SkullMeta) itemStack.getItemMeta()).getOwner());
        Material material;
        try {
            material = Material.valueOf(fileConfiguration.getString(key + ".material"));
        } catch (Exception ex) {
            new WarningMessage("Material type " + fileConfiguration.getString(key + ".material") + " is not valid! Correct it to make a valid item.");
            return null;
        }
        String name = "";
        try {
            name = fileConfiguration.getString(key + ".name");
        } catch (Exception ex) {
            new WarningMessage("Item name " + fileConfiguration.getString(key + ".name") + " is not valid! Correct it to make a valid item.");
        }
        List<String> lore = new ArrayList<>();
        try {
            lore = fileConfiguration.getStringList(key + ".lore");
        } catch (Exception ex) {
            new WarningMessage("Item lore " + fileConfiguration.getString(key + ".lore") + " is not valid! Correct it to make a valid item.");
        }
        ItemStack fileItemStack = ItemStackGenerator.generateItemStack(material, name, lore);
        if (material == Material.PLAYER_HEAD)
            ((SkullMeta) itemStack.getItemMeta()).setOwningPlayer(Bukkit.getOfflinePlayer(fileConfiguration.getString(key + ".owner")));
        return fileItemStack;
    }
     */

    public static boolean writeValue(Object value, File file, FileConfiguration fileConfiguration, String path) {
        fileConfiguration.set(path, value);
        try {
            fileSaverCustomValues(fileConfiguration, file);
        } catch (Exception exception) {
            new WarningMessage("Failed to write value for " + path + " in file " + file.getName());
            return false;
        }
        return true;
    }

    public static void removeValue(File file, FileConfiguration fileConfiguration, String path) {
        writeValue(null, file, fileConfiguration, path);
    }
}
