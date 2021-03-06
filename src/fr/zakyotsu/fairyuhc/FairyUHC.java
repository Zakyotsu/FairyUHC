package fr.zakyotsu.fairyuhc;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.plugin.java.JavaPlugin;
import fr.zakyotsu.fairyuhc.world.*;
import org.bukkit.scoreboard.Scoreboard;

import java.util.ServiceConfigurationError;

public class FairyUHC extends JavaPlugin {

    private WorldborderManager wb;
    private SpawnBuild spawn;
    private Scoreboard sc;
    public static FairyUHC plugin;

    @Override
    public void onEnable() {
        //Variables initialization
        wb = new WorldborderManager();
        plugin = this;
        spawn = new SpawnBuild();
        sc = Bukkit.getScoreboardManager().getMainScoreboard();

        initializeWorld();
    }

    @Override
    public void onDisable() {

    }

    private void initializeWorld() {
        //Setup worldborder
        wb.setup();

        //Start spawn build
        spawn.generateSpawn();

        Variables.WORLD.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        Variables.WORLD.setGameRule(GameRule.NATURAL_REGENERATION, false);
        Variables.WORLD.setGameRule(GameRule.SHOW_DEATH_MESSAGES, false);

    }

    public static FairyUHC getInstance() {
        return plugin;
    }

    public Scoreboard getScoreboard() {
        return sc;
    }

}
