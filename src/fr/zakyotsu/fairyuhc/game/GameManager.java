package fr.zakyotsu.fairyuhc.game;

import fr.zakyotsu.fairyuhc.FairyUHC;
import fr.zakyotsu.fairyuhc.schedulers.ScoreboardUpdateScheduler;
import fr.zakyotsu.fairyuhc.utils.Lang;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitTask;

public class GameManager {

    @Getter private BukkitTask scoreboardUpdater;

    public void startGame() {

        HandlerList.unregisterAll(FairyUHC.getInstance().getPreGameEvents());

        int i = 0;
        for (Player player : Bukkit.getOnlinePlayers()) {
            preparePlayer(player);
            FairyUHC.alivePlayers.add(player.getName());
            player.teleport(FairyUHC.getInstance().getTeleportHandler().getTeleportLocations().get(i++));
        }

        Bukkit.broadcastMessage(Lang.getHeadedString(Lang.MSG_START));
        Bukkit.broadcastMessage(Lang.getHeadedString(Lang.MSG_BORDER));
        Bukkit.broadcastMessage(Lang.getHeadedString(Lang.MSG_LAG_WARNING));

        scoreboardUpdater = new ScoreboardUpdateScheduler().runTaskTimer(FairyUHC.getInstance(), 0L, 20L);

        FairyUHC.getInstance().setGameRunning(true);
    }




    private void preparePlayer(Player p) {
        p.getActivePotionEffects().forEach(pe -> p.removePotionEffect(pe.getType()));
        p.setScoreboard(FairyUHC.getInstance().getScoreboard());
        p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 255, false, false));
        p.setGameMode(GameMode.SURVIVAL);
        p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20.0D);
        p.setHealth(20.0D);
        p.setFoodLevel(20);
        p.setExhaustion(5.0F);
        p.setExp(0);
        p.setLevel(0);
        p.setTotalExperience(0);
        p.getInventory().clear();
        p.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 12));
        p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0F, 1.0F);
    }
}
