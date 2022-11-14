package fr.zakyotsu.fairyuhc;

import fr.zakyotsu.fairyuhc.characters.DefaultCharacter;
import fr.zakyotsu.fairyuhc.characters.Lucy;
import fr.zakyotsu.fairyuhc.command.CommandHandler;
import fr.zakyotsu.fairyuhc.events.GameEvents;
import fr.zakyotsu.fairyuhc.events.PreGameEvents;
import fr.zakyotsu.fairyuhc.game.GameManager;
import fr.zakyotsu.fairyuhc.scoreboard.ScoreboardHandler;
import fr.zakyotsu.fairyuhc.teleport.TeleportHandler;
import fr.zakyotsu.fairyuhc.utils.Constants;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.plugin.java.JavaPlugin;
import fr.zakyotsu.fairyuhc.world.*;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;

@Getter
@Setter
public class FairyUHC extends JavaPlugin {

    private WorldborderManager worldBorder;
    private SpawnBuild spawn;
    private Scoreboard scoreboard;
    private ScoreboardHandler scoreboardHandler;
    private TeleportHandler teleportHandler;
    private GameManager gameManager;
    private boolean isGameRunning = false;
    private int episodeNumber = 0;
    private PreGameEvents preGameEvents;
    @Getter public static FairyUHC instance;
    public static ArrayList<DefaultCharacter> characters;
    public static ArrayList<String> alivePlayers, deadPlayers;


    @Override
    public void onEnable() {
        initializeVariables();
        initializeWorld();

        //Register command
        Bukkit.getPluginCommand("fairyuhc").setExecutor(new CommandHandler());

        //Generate teleport points
        teleportHandler.initLocations(Constants.WORLD);

        //Adds the objective onto the "scoreboard" variable. If already created, it deletes and re-create.
        scoreboardHandler.createScoreboard();

        //Deletes all teams, to prevent conflits when instantiating the character classes
        scoreboard.getTeams().forEach(Team::unregister);

        characters.add(Lucy.getInstance());


        Bukkit.getPluginManager().registerEvents(preGameEvents, this);
        Bukkit.getPluginManager().registerEvents(new GameEvents(), this);
    }

    private void initializeVariables() {
        instance = this;
        worldBorder = new WorldborderManager();
        teleportHandler = new TeleportHandler();
        preGameEvents = new PreGameEvents();
        spawn = new SpawnBuild();
        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        scoreboardHandler = new ScoreboardHandler();
        gameManager = new GameManager();
        characters = new ArrayList<>();
        alivePlayers = new ArrayList<>();
        deadPlayers = new ArrayList<>();
    }

    private void initializeWorld() {
        //Setup worldborder
        worldBorder.setup();

        //Start spawn build
        spawn.generateSpawn();

        Constants.WORLD.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        Constants.WORLD.setGameRule(GameRule.NATURAL_REGENERATION, false);
        Constants.WORLD.setGameRule(GameRule.SHOW_DEATH_MESSAGES, false);

    }


}
