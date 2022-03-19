package fr.zakyotsu.fairyuhc.world;

import fr.zakyotsu.fairyuhc.Lang;
import fr.zakyotsu.fairyuhc.Variables;
import org.bukkit.Bukkit;
import org.bukkit.WorldBorder;

import static fr.zakyotsu.fairyuhc.Lang.*;

public class WorldborderManager {

    private WorldBorder wb;

    public WorldborderManager() {
        wb = Variables.WORLD.getWorldBorder();
    }

    public void reduce() {
        //If the border is bigger than the minimal value
        if(wb.getSize() > Variables.BORDER_MINIMAL_SIZE) {
            wb.setSize(wb.getSize() - Variables.BORDER_SIZE_REDUCE, Variables.BORDER_REDUCE_TIME);
            Bukkit.broadcastMessage(Lang.getString(BORDER_REDUCE));
        }
    }

    public void setup() {
        wb.setCenter(0, 0);
        wb.setSize(Variables.BORDER_SIZE);
        wb.setDamageAmount(0.1D);
        wb.setDamageBuffer(20.0D);
    }
}
