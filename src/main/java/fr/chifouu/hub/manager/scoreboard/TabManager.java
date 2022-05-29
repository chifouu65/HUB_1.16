package fr.chifouu.hub.manager.scoreboard;

import fr.chifouu.hub.Hub;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class TabManager {
    private static BukkitTask updateTask = null;

    public static void setupTab() {
        sendAll();
        updateTab();
    }

    public static void updateTab() {
        if (updateTask != null)
            updateTask.cancel();
        updateTask = (new BukkitRunnable() {
            public void run() {
                    cancel();
                    return;
                }

        }).runTaskTimer((Plugin) Hub.getInstance(), 20L, 20L);
    }

    public static void sendAll() {
        Bukkit.getOnlinePlayers().forEach(player -> send(player));
    }

    public static void send(Player player) {
            return;

    }
}