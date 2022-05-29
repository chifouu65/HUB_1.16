package fr.chifouu.hub.listener;

import fr.chifouu.hub.Hub;
import fr.chifouu.hub.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import static org.bukkit.Material.COOKIE;
import static org.bukkit.entity.EntityType.PLAYER;

public class ModeSelector implements Listener {
    @EventHandler
    public void onInteractOakPC(PlayerInteractEvent event) {
        if(event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }

        Player player = event.getPlayer();
            Block block = event.getClickedBlock();
            if(block.getType() == Material.OAK_SIGN || block.getType() == Material.OAK_WALL_SIGN){

                Sign sign = (Sign) block.getState();
                player.sendMessage("Essaye de connexion . . .");
                    try {
                        ByteArrayOutputStream b = new ByteArrayOutputStream();
                        DataOutputStream out = new DataOutputStream(b);
                        try {
                            out.writeUTF("Connect");
                            out.writeUTF("server1");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        player.sendPluginMessage(Hub.getInstance(), "BungeeCord", b.toByteArray());
                    } catch (org.bukkit.plugin.messaging.ChannelNotRegisteredException e) {
                        Bukkit.getLogger().warning("Watting please . . .");
                    }
                }
                try {
                }
                catch (Exception e) {
                    player.sendMessage(ChatColor.RED + "Error when trying to connect to server..");
                }
            }
        }
