package fr.chifouu.hub.manager.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class scoreboardHub implements Listener {
    Player player ;

    @EventHandler
    public void onJoinScorb(PlayerJoinEvent event){
        createBoard(event.getPlayer());
    }

    public void createBoard(Player player) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective obj = board.registerNewObjective("HubScoreboard-1",
                "dummy", ChatColor.translateAlternateColorCodes
                        ('&', "&f§l&nOrus"));
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score score = obj.getScore("");
        score.setScore(4);
        Score score2 = obj.getScore(ChatColor.GREEN + "§lConnected : " +
                ChatColor.WHITE + "§l" + (Bukkit.getOnlinePlayers().size()) +
                "/" + Bukkit.getMaxPlayers());
        score2.setScore(3);
        Score score3 = obj.getScore(ChatColor.YELLOW + "§lYou is : " +
                ChatColor.WHITE + "§l" + player.getName());
        score3.setScore(2);
        Score score4 = obj.getScore(ChatColor.GOLD + "§lDollars : " +
                ChatColor.WHITE + "§l" + player.getTotalExperience());
        score4.setScore(1);
        player.setScoreboard(board);



    }

}



