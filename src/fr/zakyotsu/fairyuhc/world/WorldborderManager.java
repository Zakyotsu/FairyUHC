package fr.zakyotsu.fairyuhc.world;

import fr.zakyotsu.fairyuhc.utils.Lang;
import fr.zakyotsu.fairyuhc.utils.Constants;
import org.bukkit.Bukkit;
import org.bukkit.WorldBorder;

import static fr.zakyotsu.fairyuhc.utils.Lang.*;

public class WorldborderManager {

    private WorldBorder wb;

    public WorldborderManager() {
        wb = Constants.WORLD.getWorldBorder();
    }

    public void reduce() {
        //If the border is bigger than the minimal value
        if(wb.getSize() > Constants.BORDER_MINIMAL_SIZE) {
            wb.setSize(wb.getSize() - Constants.BORDER_SIZE_REDUCE, Constants.BORDER_REDUCE_TIME);
            Bukkit.broadcastMessage(Lang.getString(BORDER_REDUCE));
        }
    }

    public void setup() {
        wb.setCenter(0, 0);
        wb.setSize(Constants.BORDER_SIZE);
        wb.setDamageAmount(0.1D);
        wb.setDamageBuffer(20.0D);
    }

    public double getSize() {
        return wb.getSize();
    }
}
