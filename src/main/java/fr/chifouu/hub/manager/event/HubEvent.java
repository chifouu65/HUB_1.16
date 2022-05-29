package fr.chifouu.hub.manager.event;

import fr.chifouu.hub.utils.ItemBuilder;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

import static org.bukkit.entity.EntityType.PLAYER;


public class HubEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        player.getInventory().clear();
        player.setGameMode(GameMode.ADVENTURE);
        event.setJoinMessage(ChatColor.GREEN + player.getName() + " à Rejoint la zone de jeu !");
        player.teleport(Bukkit.getWorld("world").getSpawnLocation());
        for(World world : Bukkit.getWorlds()){
            world.setTime(1);
            player.setResourcePack("");
        }
    }

        @EventHandler
        public void onInteractPlayer(PlayerInteractAtEntityEvent event) {
            if (!event.getRightClicked().getType().equals(PLAYER)) {
                return;//annuler a la victim touche
            }
            Player player = event.getPlayer();
            Player victim = (Player) event.getRightClicked();


            if (event.getRightClicked().getType().equals(PLAYER)) {//player qui interagi
                Inventory pInv = Bukkit.createInventory(null, 9 * 3, "Menu entre Joueurs");
                //make item with itembuilder
                pInv.setItem(0, new ItemBuilder(Material.APPLE).setName(ChatColor.YELLOW + "§lInvité en party !").toItemStack());
                pInv.setItem(1, new ItemBuilder(Material.APPLE).setName(ChatColor.YELLOW + "§lInvité en party !").toItemStack());

                player.openInventory(pInv);
            }
        }

    @EventHandler
    public void Damage(EntityDamageEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void Damage(EntityDamageByEntityEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void foodLevelChangeModeration(FoodLevelChangeEvent e) {
        Player p = (Player) e.getEntity();
        e.setFoodLevel(20);
        e.setCancelled(true);
    }
    @EventHandler
    public void onPlayerDrop(PlayerDropItemEvent event) {
        event.setCancelled(true);
    }

}



