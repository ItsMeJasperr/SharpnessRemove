package com.jjwngamer.sharpnessremove;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SharpnessRemove extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new HeldItemListener(), this);
        getLogger().info("==========( SharpnessRemove )=========");
        getLogger().info("» Status: Enabled");
        getLogger().info("» Version: " + getDescription().getVersion());
        getLogger().info("» Author: " + getDescription().getAuthors());
        getLogger().info("» Support Discord: https://discord.gg/4bMneafFmJ");
        getLogger().info("==========( SharpnessRemove )=========");
    }
}
