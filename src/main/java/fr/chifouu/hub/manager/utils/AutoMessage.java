package fr.chifouu.hub.manager.utils;

import fr.chifouu.hub.Hub;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AutoMessage {
    private List<String> messages = new ArrayList<>();

    private int secondes;

    public void addMessage(String text) {
        this.messages.add(text);
    }

    public void removeMessage(String text) {
        this.messages.remove(text);
    }

    public void setSeconds(int delay) {
        this.secondes = delay;
    }

    public String getRandomMessage() {
        Random ran = new Random();
        int number = ran.nextInt(this.messages.size());
        return this.messages.get(number);
    }

    public void startAutoMessage() {
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) Hub.getInstance(), new Runnable() {
            public void run() {
                if (AutoMessage.this.messages.size() != 0)
                    AutoMessage.this.launchAutoMessage();

            }
        },  (20 * this.secondes));
    }

    public void launchAutoMessage() {
        String message = getRandomMessage();
        for (Player p : Bukkit.getOnlinePlayers())
            p.sendMessage("MEssage auto test");
        startAutoMessage();
    }
}