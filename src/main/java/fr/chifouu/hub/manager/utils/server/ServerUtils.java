package fr.chifouu.hub.manager.utils.server;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import fr.chifouu.hub.Hub;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import java.util.HashMap;

public class ServerUtils implements PluginMessageListener {
    public static int online = 0;

    public static HashMap<String, String> servers = new HashMap<>();

    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if (!channel.equals("BungeeCord"))
            return;
        ByteArrayDataInput in = ByteStreams.newDataInput(message);
        String subchannel = in.readUTF();
        if (subchannel.equals("PlayerCount"))
            try {
                String server = in.readUTF();
                int playerCount = in.readInt();
                if (server.equalsIgnoreCase("ALL"))
                    online = playerCount;
                for (String ss : servers.keySet()) {
                    if (server.equalsIgnoreCase(ss))
                        servers.put(ss, String.valueOf(playerCount));
                }
            } catch (Exception e) {
                loadServers(Bukkit.getOnlinePlayers().iterator().next());
            }
        if (subchannel.equals("GetServers")) {
            String[] serverList = in.readUTF().split(", ");
            for (String ss : serverList)
                servers.put(ss, "0");
        }
    }

    public static void loadServers(Player player) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("GetServers");
        player.sendPluginMessage((Plugin) Hub.getInstance(), "BungeeCord", out.toByteArray());
    }

    public static void updateAllCount(Player player) {
        for (String ss : servers.keySet())
            updateCount(player, ss);
    }

    public static void updateCount(Player player, String server) {
        if (server == null || server.isEmpty())
            server = "ALL";
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("PlayerCount");
        out.writeUTF(server);
        player.sendPluginMessage((Plugin)Hub.getInstance(), "BungeeCord", out.toByteArray());
    }

    public static HashMap<String, String> getServers() {
        return servers;
    }

    public static String getPlayerCountFrom(String serveur) {
        System.out.print(serveur);
        return getServers().getOrDefault(serveur, "0");
    }
}