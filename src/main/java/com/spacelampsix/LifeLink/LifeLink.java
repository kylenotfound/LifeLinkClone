package com.spacelampsix.LifeLink;

import org.bukkit.plugin.java.JavaPlugin;

public final class LifeLink extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DeathListeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
