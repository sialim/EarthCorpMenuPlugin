package me.sialim.earthcorpmenuplugin.commands;

import me.sialim.earthcorpmenuplugin.EarthCorpMenuPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuCommand implements CommandExecutor {
    private EarthCorpMenuPlugin plugin;
    public MenuCommand(EarthCorpMenuPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player p){
            Inventory menu1 = Bukkit.createInventory(p, 54, ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("main-menu-title")));

            ItemStack corp1Button = new ItemStack((Material.matchMaterial(plugin.getConfig().getString("corp1-button-material"))), 1);
            ItemMeta corp1Meta = corp1Button.getItemMeta();
            corp1Meta.setDisplayName(plugin.getConfig().getString("corp1-button-name"));
            corp1Button.setItemMeta(corp1Meta);

            ItemStack corp2Button = new ItemStack((Material.matchMaterial(plugin.getConfig().getString("corp2-button-material"))), 1);
            ItemMeta corp2Meta = corp2Button.getItemMeta();
            corp2Meta.setDisplayName(plugin.getConfig().getString("corp2-button-name"));
            corp2Button.setItemMeta(corp2Meta);

            ItemStack corp3Button = new ItemStack((Material.matchMaterial(plugin.getConfig().getString("corp3-button-material"))), 1);
            ItemMeta corp3Meta = corp3Button.getItemMeta();
            corp3Meta.setDisplayName(plugin.getConfig().getString("corp3-button-name"));
            corp3Button.setItemMeta(corp3Meta);

            ItemStack corp4Button = new ItemStack((Material.matchMaterial(plugin.getConfig().getString("corp4-button-material"))), 1);
            ItemMeta corp4Meta = corp4Button.getItemMeta();
            corp4Meta.setDisplayName(plugin.getConfig().getString("corp4-button-name"));
            corp4Button.setItemMeta(corp4Meta);

            ItemStack corp5Button = new ItemStack((Material.matchMaterial(plugin.getConfig().getString("corp5-button-material"))), 1);
            ItemMeta corp5Meta = corp5Button.getItemMeta();
            corp5Meta.setDisplayName(plugin.getConfig().getString("corp5-button-name"));
            corp5Button.setItemMeta(corp5Meta);

            ItemStack corp6Button = new ItemStack((Material.matchMaterial(plugin.getConfig().getString("corp6-button-material"))), 1);
            ItemMeta corp6Meta = corp6Button.getItemMeta();
            corp6Meta.setDisplayName(plugin.getConfig().getString("corp6-button-name"));
            corp6Button.setItemMeta(corp6Meta);

        }
        return true;
    }
}
