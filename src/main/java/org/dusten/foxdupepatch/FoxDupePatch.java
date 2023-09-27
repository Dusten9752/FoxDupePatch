package org.dusten.foxdupepatch;

import org.bukkit.plugin.java.JavaPlugin;

public class FoxDupePatch extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FoxPickupListener(), this);
    }
}
