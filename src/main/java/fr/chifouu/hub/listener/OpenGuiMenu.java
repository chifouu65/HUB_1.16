package fr.chifouu.hub.listener;

import fr.chifouu.hub.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class OpenGuiMenu implements Listener {
//inv perso

    @EventHandler
    public void enderChest(InventoryClickEvent e) {
        Inventory inventory = e.getInventory();

    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Inventory inventory = e.getInventory();
        Player p = (Player) e.getWhoClicked();
        ItemStack current = e.getCurrentItem();

        if (current == null) return;

        if (current.getType() == Material.COOKIE || current.getType() == Material.APPLE
                || current.getType() == Material.CARROT || current.getType() == Material.BOOK || current.getType()
                == Material.ENDER_CHEST || current.getType() == Material.BARRIER)
        {
            e.setCancelled(true);
        }

        if (current.getType() == Material.ENDER_CHEST)
        {
            e.setCancelled(true);
            p.openInventory(p.getEnderChest());
        }

        if (current.getType() == Material.COOKIE) {
            Inventory invs = Bukkit.createInventory(null, 9 * 3, "§e[Info]");
            //make item with itembuilder
            invs.setItem(13, new ItemBuilder(Material.APPLE).setName(ChatColor.YELLOW + "§l Hello !").setLore(ChatColor.GREEN +
                    "This server is make for", ChatColor.GREEN + "test a 1.16 devloppement", "have fun ! ").toItemStack());

            invs.setItem(15, new ItemBuilder(Material.CARROT)
                    .setName(ChatColor.BLUE + "§Discord !").setLore("Click here for", "Join Adola Network").toItemStack());

            invs.setItem(11, new ItemBuilder(Material.BOOK).setName(ChatColor.RED + "§. . . !")
                    .setLore("See soon").toItemStack());

            p.getInventory().setChestplate(new ItemBuilder(Material.ENDER_CHEST).setName(ChatColor.RED + "§lCoffre perso !")
                    .addEnchant(Enchantment.ARROW_DAMAGE, 1).setLore("> click for open <").toItemStack());

            p.openInventory(invs);
        }
        if (current.getType() == Material.CARROT) {
            p.sendMessage(ChatColor.LIGHT_PURPLE + "§l>> ============================= <<");
            p.sendMessage(ChatColor.LIGHT_PURPLE + "§l>> https://discord.gg/aBxzVZuGa8 <<");
            p.sendMessage(ChatColor.LIGHT_PURPLE + "§l>> ============================= <<");
        }

    }
}


