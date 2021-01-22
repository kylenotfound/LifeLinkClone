package com.spacelampsix.LifeLink;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class LifeLink extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginDescriptionFile pluginDescriptionFile = getDescription();
        getServer().getLogger().info("Booting " + pluginDescriptionFile.getName() + "..." + "\n" +
                "All Players are now linked... Good luck.");
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
