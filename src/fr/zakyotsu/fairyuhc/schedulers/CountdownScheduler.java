package fr.zakyotsu.fairyuhc.schedulers;

import fr.zakyotsu.fairyuhc.FairyUHC;
import fr.zakyotsu.fairyuhc.utils.Lang;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.scheduler.BukkitRunnable;

public class CountdownScheduler extends BukkitRunnable {

    private int counter = 5;
    private String s = " seconds";

    @Override
    public void run() {

            if (counter == 1)
                s = " second";

            if (counter <= 5) {

                Bukkit.getOnlinePlayers().forEach(p -> {
                    p.sendTitle(
                            Lang.getString(Lang.START_TITLE_TITLE),
                            Lang.getString(Lang.START_TITLE_SUBTITLE)
                                    .replaceAll("%counter", String.valueOf(counter))
                                    .replaceAll("%s", s),
                            20, 60, 20);
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 1.0F, 1.0F);
                });

                counter--;
            }

            // Launch game
            if (counter < 0) {
                FairyUHC.getInstance().getGameManager().startGame();
                cancel();
            }
        }
    }