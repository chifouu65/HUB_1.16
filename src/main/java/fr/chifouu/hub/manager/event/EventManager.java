package fr.chifouu.hub.manager.event;

import fr.chifouu.hub.Hub;
import fr.chifouu.hub.listener.ModeSelector;
import fr.chifouu.hub.listener.OpenGuiMenu;
import fr.chifouu.hub.manager.scoreboard.scoreboardHub;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

public class EventManager {

    private final Hub myPl;
    private final PluginManager pluginManager;

    public EventManager(Hub myPl) {
        this.myPl = myPl;
        this.pluginManager = Bukkit.getPluginManager();
        registerEvents();
    }

    private void registerEvents(){
        addNewEvent(new HubEvent());
        addNewEvent(new ModeSelector());
        addNewEvent(new OpenGuiMenu());
        addNewEvent(new scoreboardHub());
    }

    public void addNewEvent(Listener listener){
        pluginManager.registerEvents(listener, myPl);
    }

    public Hub getMyPl() {
        return myPl;
    }

    public PluginManager getPluginManager() {
        return pluginManager;
    }
}
