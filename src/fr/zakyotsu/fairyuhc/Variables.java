package fr.zakyotsu.fairyuhc;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class Variables {

    //The current world
    public static final World WORLD = Bukkit.getWorld("world");
    //Spawn location
    public static final Location spawnLoc = new Location(WORLD, 0, 120, 0);

    public static int currentEpisode = 0;

    public static boolean gameRunning = false;
    public static boolean isDaylight = false;



    //At which episode the border starts reducing
    public static final int BORDER_TRIGGER_EP = 3;
    //Border length in blocks (MC blocks)
    public static final double BORDER_SIZE = 2000.0D;
    //Time between reducing (seconds)
    public static final int BORDER_REDUCE_TIME = 180;
    //Number of blocks to reduce to (seconds)
    public static final int BORDER_SIZE_REDUCE = 300;
    //Minimal size of the border (blocks)
    public static final int BORDER_MINIMAL_SIZE = 200;


    //The number of time between day/night (MC ticks)
    public static final long TIME_DAY_NIGHT = 6000L;





}
