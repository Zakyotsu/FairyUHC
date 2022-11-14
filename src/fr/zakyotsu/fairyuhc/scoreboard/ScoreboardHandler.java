package fr.zakyotsu.fairyuhc.scoreboard;

import fr.zakyotsu.fairyuhc.utils.Lang;
import org.bukkit.scoreboard.*;

import fr.zakyotsu.fairyuhc.FairyUHC;

public class ScoreboardHandler {

    public void createScoreboard() {
        Scoreboard scoreboard = FairyUHC.getInstance().getScoreboard();
        if (scoreboard.getObjective("FairyUHC") == null) {
            setupObjective(scoreboard.registerNewObjective("FairyUHC", Criteria.DUMMY, "FairyUHC"));
        } else {
            scoreboard.getObjective("FairyUHC").unregister();
            createScoreboard();
        }
    }

    private void setupObjective(Objective obj) {
        obj.setDisplayName(Lang.getString(Lang.SCOREBOARD_NAME));
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.getScore("").setScore(7);

        // Number of the episode
        obj.getScore(
                Lang.getString(Lang.SCOREBOARD_EPISODE)
                        .replaceAll("%e", String.valueOf(FairyUHC.getInstance().getEpisodeNumber()))
        ).setScore(6);

        obj.getScore(" ").setScore(5);

        // Get number of classes alive
        obj.getScore(Lang.getString(Lang.SCOREBOARD_PLAYERS_ALIVE)
                .replaceAll("%p", "" + FairyUHC.alivePlayers.size())
        ).setScore(4);

        obj.getScore("  ").setScore(3);

        // Worldborder
        obj.getScore(Lang.getString(Lang.SCOREBOARD_BORDER)
                .replaceAll("%b", String.valueOf((int) FairyUHC.getInstance().getWorldBorder().getSize()))
        ).setScore(2);

        obj.getScore("   ").setScore(1);

        obj.getScore(Lang.getString(Lang.SCOREBOARD_TIMER)).setScore(0);
    }
}