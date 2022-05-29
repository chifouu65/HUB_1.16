package fr.chifouu.hub;

import fr.chifouu.hub.manager.event.EventManager;

import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

public class Hub extends JavaPlugin {

    private EventManager eventManager;
    private static Hub instance;
    private TGame plugin;
    private static Hub main;

    public static Hub getMain() {
        return main;
    }

    public static void setMain(Hub main) {
        Hub.main = main;
    }


    @Override
    public void onEnable() {
        //Other
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        eventManager = new EventManager(this);
        this.plugin = new TGame();
        instance = this;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        NamespacedKey namespacedKey = new NamespacedKey(this, "coins");

        PersistentDataContainer data = player.getPersistentDataContainer();

        if (!data.has(namespacedKey, PersistentDataType.DOUBLE))
            data.set(namespacedKey, PersistentDataType.DOUBLE, 0.0);


        double balance = data.get(namespacedKey, PersistentDataType.DOUBLE);

        if (args.length == 0) {
            player.sendMessage("OrusCoins : " + balance);

        } else if (args.length == 2) {
            double qty = Double.parseDouble(args[1]);
            if (args[0].equalsIgnoreCase("add")) {
                balance += qty;
                data.set(namespacedKey, PersistentDataType.DOUBLE, balance);
                player.sendMessage("You have get " + balance + " OrusCoins");

            } else if (args[0].equalsIgnoreCase("remove")) {
                balance -= qty;
                data.set(namespacedKey, PersistentDataType.DOUBLE, balance);
                player.sendMessage("You a removed " + balance + "OrusCoins");
            }
        }
        return true;
    }

    public static Hub getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        getServer().getMessenger().unregisterOutgoingPluginChannel(this);
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void update() {
    }

    public TGame getGame() {
        return plugin;
    }

    public void setGame(TGame game) {
        this.plugin = game;
    }


}