package fr.zakyotsu.fairyuhc.world;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import fr.zakyotsu.fairyuhc.utils.Constants;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class SpawnBuild {

    private Random r;

    public SpawnBuild() {
        r = new Random();
    }

    private List<String> getListOfTerracotta() {
        return Arrays.stream(Material.values())
                .map(Material::toString)
                .filter(name -> name.contains("TERRACOTTA") && !name.contains("GLAZED"))
                .collect(Collectors.toList());
    }

    private int getRandomNumber(int bound) {
        return r.nextInt(bound);
    }

    private Material getRandomTerracottaBlock(List<String> terracottas) {
        return Material.valueOf(terracottas.get(getRandomNumber(terracottas.size())));
    }

    public void generateSpawn() {

        List<String> terracottas = getListOfTerracotta();

        //Floor
        for (int x = -10; x <= 10; x++) {
            for (int z = -10; z <= 10; z++) {
                new Location(Constants.WORLD, x, 119, z).getBlock().setType(getRandomTerracottaBlock(terracottas));
            }
        }

        //Spawn location set bedrock
        new Location(Constants.WORLD, 0, 119, 0).getBlock().setType(Material.BEDROCK);

        //Walls
        for (int i = -10; i <= 10; i++) {
            for (int y = 120; y <= 126; y++) {
                Block b1 = new Location(Constants.WORLD, 10, y, i).getBlock();
                Block b2 = new Location(Constants.WORLD, -10, y, i).getBlock();
                Block b3 = new Location(Constants.WORLD, i, y, -10).getBlock();
                Block b4 = new Location(Constants.WORLD, i, y, 10).getBlock();

                b1.setType(getRandomTerracottaBlock(terracottas));
                b2.setType(getRandomTerracottaBlock(terracottas));
                b3.setType(getRandomTerracottaBlock(terracottas));
                b4.setType(getRandomTerracottaBlock(terracottas));
            }
        }
    }
}