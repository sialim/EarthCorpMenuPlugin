package me.sialim.earthcorpmenuplugin;

import me.sialim.earthcorpmenuplugin.commands.MenuCommand;
import me.sialim.earthcorpmenuplugin.listeners.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EarthCorpMenuPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[EarthCorpMenuPlugin] Booted successfully.");

        getCommand("corporations").setExecutor(new MenuCommand(this));
        getServer().getPluginManager().registerEvents(new MenuListener(this), this);
    }
}
