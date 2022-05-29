package fr.chifouu.hub;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class AutoMsgTask extends BukkitRunnable {

    BukkitTask plugin;

    public AutoMsgTask(BukkitTask plugin){
        this.plugin = plugin;
    }

    @Override
    public void run() {
        System.out.println(" task on"
        );
    }
}
