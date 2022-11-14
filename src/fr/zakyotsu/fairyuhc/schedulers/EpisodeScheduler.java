package fr.zakyotsu.fairyuhc.schedulers;

import org.bukkit.scheduler.BukkitRunnable;

public class EpisodeScheduler extends BukkitRunnable {

    @Override
    public void run() {
        //                    // NEW EPISODE
//                    if (ep_sec == ep_duration) {
//                        ep_sec = 0;
//                        FairyUHC.episode++;
//                        Carla.canSee = true;
//                        Lucy.canPickSpirit = true;
//                        Lucy.spirit = "";
//                        Luxus.canThunder = true;
//
//                        // Reset Lucy's spirit effect
//                        CharacterUtil.getInstance(Lucy.class).resetEffects();
//
//                        for (Player p : Bukkit.getOnlinePlayers()) {
//                            ZakAPI.sendTitle(p,
//                                    FUHCLang.EPISODE_TITLE_TITLE.getStringWithoutHeader().replaceAll("%ep",
//                                            String.valueOf(FairyUHC.episode)),
//                                    FUHCLang.EPISODE_TITLE_SUBTITLE.getStringWithoutHeader(), false);
//
//                            p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1.0F, 1.0F);
//                        }
//
//                        //Has been picked already?
//                        if (!FairyUHC.hasBeenPicked) {
//                            CharacterUtils.randomPick();
//                            timerDayOrNight();
//                            FairyUHC.hasBeenPicked = true;
//                        }
//
//                        if (FairyUHC.episode >= Constantes.BORDER_TRIGGER_EP) {
//                            WorldBorder wb = FairyUHC.getWorldBorder();
//                            if (wb.getSize() <= Constantes.BORDER_MINIMAL_SIZE) {
//                                return;
//                            }
//                            wb.setSize(wb.getSize() - Constantes.BORDER_SIZE_REDUCE, Constantes.BORDER_REDUCE_TIME);
//                            Bukkit.broadcastMessage(FUHCLang.BORDER_REDUCE.getString());
//                        }
//
//                        CharacterUtils.showEvil();
//                    }
    }
}
