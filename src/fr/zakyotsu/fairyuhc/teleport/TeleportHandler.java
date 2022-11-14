package fr.zakyotsu.fairyuhc.teleport;

import fr.zakyotsu.fairyuhc.utils.Constants;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.List;

public class TeleportHandler {

	private List<Location> loc = new ArrayList<>();
	private Location spawn = new Location(Constants.WORLD, 0.5, 120, 0.5);
	
	public void initLocations(World w) {
		loc.add(createLoc(w, -400, 120, 800));
		loc.add(createLoc(w, 0, 120, 800));
		loc.add(createLoc(w, 400, 120, 800));
		
		loc.add(createLoc(w, -800, 120, -400));
		loc.add(createLoc(w, -400, 120, 400));
		loc.add(createLoc(w, 0, 120, 400));
		loc.add(createLoc(w, 400, 120, 400));
		loc.add(createLoc(w, 800, 120, 400));
		
		loc.add(createLoc(w, -800, 120, 0));
		loc.add(createLoc(w, -400, 120, 0));
		loc.add(createLoc(w, 400, 120, 0));
		loc.add(createLoc(w, 800, 120, 0));
		
		loc.add(createLoc(w, -800, 120, -400));
		loc.add(createLoc(w, -400, 120, -400));
		loc.add(createLoc(w, 0, 120, -400));
		loc.add(createLoc(w, 400, 120, -400));
		loc.add(createLoc(w, 800, 120, -400));
		
		loc.add(createLoc(w, -400, 120, -800));
		loc.add(createLoc(w, 0, 120, -800));
		loc.add(createLoc(w, 400, 120, -800));
	}
	
	private static Location createLoc(World w, int x, int y, int z) {
		return new Location(w, x, y, z);
	}
	
	public List<Location> getTeleportLocations() {
		return loc;
	}
	
	public Location getSpawn() {
		return spawn;
	}
}