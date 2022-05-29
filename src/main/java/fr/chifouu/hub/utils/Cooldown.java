package fr.chifouu.hub.utils;

import fr.chifouu.hub.Hub;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public abstract class Cooldown {
    public Cooldown(int seconds) {
        Bukkit.getScheduler().runTaskLater((Plugin) Hub.getInstance(), new Runnable() {
            public void run() {
                Cooldown.this.onFinish();
            }
        },  (20 * seconds));
    }

    public abstract void onFinish();
}
