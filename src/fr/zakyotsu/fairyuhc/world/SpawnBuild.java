package fr.zakyotsu.fairyuhc.world;

import java.util.ArrayList;
import java.util.Random;

import fr.zakyotsu.fairyuhc.Variables;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class SpawnBuild {

    private ArrayList<Material> terracottaColors;
    private Random r;

    public SpawnBuild() {
        terracottaColors = new ArrayList<Material>();
        r = new Random();

        initializeMaterials();
    }

    private void initializeMaterials() {
        for(Material m : Material.values())
            if(m.toString().contains("TERRACOTTA") && !m.toString().contains("GLAZED"))
                terracottaColors.add(m);
    }

    private Material getRandomColor() {
        return terracottaColors.get(r.nextInt(terracottaColors.size()));
    }

    public void generateSpawn() {
        //Floor
        for (int x = -10; x <= 10; x++) {
            for (int z = -10; z <= 10; z++) {
                new Location(Variables.WORLD, x, 119, z).getBlock().setType(getRandomColor());
            }
        }

        //Spawn location set bedrock
        new Location(Variables.WORLD, 0, 119, 0).getBlock().setType(getRandomColor());

        //Walls
        for (int i = -10; i <= 10; i++) {
            for (int y = 120; y <= 126; y++) {
                Block b1 = new Location(Variables.WORLD, 10, y, i).getBlock();
                Block b2 = new Location(Variables.WORLD, -10, y, i).getBlock();
                Block b3 = new Location(Variables.WORLD, i, y, -10).getBlock();
                Block b4 = new Location(Variables.WORLD, i, y, 10).getBlock();

                b1.setType(getRandomColor());
                b2.setType(getRandomColor());
                b3.setType(getRandomColor());
                b4.setType(getRandomColor());
            }
        }
    }
}