package fr.zakyotsu.fairyuhc.schedulers;

import fr.zakyotsu.fairyuhc.FairyUHC;
import fr.zakyotsu.fairyuhc.utils.Lang;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardUpdateScheduler extends BukkitRunnable {

    private Scoreboard scoreboard = FairyUHC.getInstance().getScoreboard();
    private Objective objective = scoreboard.getObjective(DisplaySlot.SIDEBAR);
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    @Override
    public void run() {
        seconds++;

        //Reset the scoreboard entries
        scoreboard.getEntries().forEach(entry -> scoreboard.resetScores(entry));

        objective.getScore("").setScore(7);

        // Number of the episode
        objective.getScore(
                Lang.getString(Lang.SCOREBOARD_EPISODE)
                        .replaceAll("%e", String.valueOf(FairyUHC.getInstance().getEpisodeNumber()))
        ).setScore(6);

        objective.getScore(" ").setScore(5);

        // Get number of classes alive
        objective.getScore(Lang.getString(Lang.SCOREBOARD_PLAYERS_ALIVE)
                .replaceAll("%p", "" + FairyUHC.alivePlayers.size())
        ).setScore(4);

        objective.getScore("  ").setScore(3);

        // Worldborder
        objective.getScore(Lang.getString(Lang.SCOREBOARD_BORDER)
                .replaceAll("%b", String.valueOf((int) FairyUHC.getInstance().getWorldBorder().getSize()))
        ).setScore(2);

        objective.getScore("   ").setScore(1);

        //Counter
        String counter = ChatColor.translateAlternateColorCodes('&', "&c" + hours + ":" + minutes + ":" + seconds);

        if (seconds == 60) {
            seconds = 0;
            minutes += 1;
        }
        if (minutes == 60) {
            minutes = 0;
            hours += 1;
        }

        if ((seconds < 10) || (minutes < 10) || (hours < 10)) {
            String seconds1 = String.valueOf(seconds);
            String min1 = String.valueOf(minutes);
            String hours1 = String.valueOf(hours);

            if (seconds < 10) {
                seconds1 = "0" + seconds;
            }
            if (minutes < 10) {
                min1 = "0" + minutes;
            }
            if (hours < 10) {
                hours1 = "0" + hours;
            }
            counter = ChatColor.translateAlternateColorCodes('&', "&c" + hours1 + ":" + min1 + ":" + seconds1);
        }
        objective.getScore(counter).setScore(0);
    }
}