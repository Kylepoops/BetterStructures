package com.magmaguy.betterstructures;

import com.magmaguy.betterstructures.commands.CommandHandler;
import com.magmaguy.betterstructures.config.DefaultConfig;
import com.magmaguy.betterstructures.config.ValidWorldsConfig;
import com.magmaguy.betterstructures.config.generators.GeneratorConfig;
import com.magmaguy.betterstructures.config.schematics.SchematicConfig;
import com.magmaguy.betterstructures.config.treasures.TreasureConfig;
import com.magmaguy.betterstructures.configurationimporter.Import;
import com.magmaguy.betterstructures.listeners.NewChunkLoadEvent;
import com.magmaguy.betterstructures.schematics.SchematicContainer;
import com.magmaguy.betterstructures.thirdparty.WorldGuard;
import com.magmaguy.betterstructures.util.InfoMessage;
import com.magmaguy.betterstructures.util.VersionChecker;
import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class BetterStructures extends JavaPlugin {

    @Override
    public void onEnable() {
        MetadataHandler.PLUGIN = this;
        new InfoMessage("    ____       __  __            _____ __                  __                      ");
        new InfoMessage("   / __ )___  / /_/ /____  _____/ ___// /________  _______/ /___  __________  _____");
        new InfoMessage("  / __  / _ \\/ __/ __/ _ \\/ ___/\\__ \\/ __/ ___/ / / / ___/ __/ / / / ___/ _ \\/ ___/");
        new InfoMessage(" / /_/ /  __/ /_/ /_/  __/ /   ___/ / /_/ /  / /_/ / /__/ /_/ /_/ / /  /  __(__  ) ");
        new InfoMessage("/_____/\\___/\\__/\\__/\\___/_/   /____/\\__/_/   \\__,_/\\___/\\__/\\__,_/_/   \\___/____/");
        // Plugin startup logic
        Bukkit.getLogger().info("[BetterStructures] Initialized version " + this.getDescription().getVersion() + "!");
        Bukkit.getPluginManager().registerEvents(new NewChunkLoadEvent(), this);
        Bukkit.getPluginManager().registerEvents(new ValidWorldsConfig.ValidWorldsConfigEvents(), this);
        Bukkit.getPluginManager().registerEvents(new VersionChecker.VersionCheckerEvents(), this);
        try {
            this.getConfig().save("config.yml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DefaultConfig.initializeConfig();
        ValidWorldsConfig.initializeConfig();
        //Creates import folder if one doesn't exist, imports any content inside
        Import.initialize();

        new TreasureConfig();
        new GeneratorConfig();
        new SchematicConfig();
        new CommandHandler();
        VersionChecker.checkPluginVersion();
        if (Bukkit.getPluginManager().getPlugin("WorldGuard") != null &&
                Bukkit.getPluginManager().getPlugin("EliteMobs") != null)
            Bukkit.getPluginManager().registerEvents(new WorldGuard(), this);
        new Metrics(this, 19523);
    }

    @Override
    public void onLoad() {
        try {
            if (Bukkit.getPluginManager().getPlugin("WorldGuard") != null &&
                    Bukkit.getPluginManager().getPlugin("EliteMobs") != null)
                WorldGuard.initializeFlag();
            else
                new InfoMessage("WorldGuard is not enabled! WorldGuard is recommended when using the EliteMobs integration.");
        } catch (Exception ex) {
            new InfoMessage("WorldGuard could not be detected! Some BetterStructures features use WorldGuard, and they will not work until it is installed.");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        SchematicContainer.shutdown();
        Bukkit.getServer().getScheduler().cancelTasks(MetadataHandler.PLUGIN);
        Bukkit.getLogger().info("[BetterStructures] Shutdown!");
    }
}
