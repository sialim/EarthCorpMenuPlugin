package me.sialim.earthcorpmenuplugin.listeners;

import me.sialim.earthcorpmenuplugin.EarthCorpMenuPlugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    private EarthCorpMenuPlugin plugin;

    public MenuListener(EarthCorpMenuPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        String corp1 = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("main-menu-title"));

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("main-menu-title")))){
            switch (e.getCurrentItem().getItemMeta().getDisplayName()){
                case corp1:


            }
        }
    }
}
