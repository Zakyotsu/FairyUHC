package fr.zakyotsu.fairyuhc.events;

import fr.zakyotsu.fairyuhc.utils.Constants;
import fr.zakyotsu.fairyuhc.FairyUHC;
import fr.zakyotsu.fairyuhc.utils.Lang;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class GameEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        //Teleport player to spawn coordinates
        p.teleport(FairyUHC.getInstance().getTeleportHandler().getSpawn());

        //Set scoreboard
        p.setScoreboard(FairyUHC.getInstance().getScoreboard());

        //Put to GameMode 2 if non-op
        if(!p.isOp())
            p.setGameMode(GameMode.ADVENTURE);

        //Custom join message
        e.setJoinMessage(
                Lang.getHeadedString(Lang.PLAYER_JOIN)
                        .replaceAll("%p", p.getName())
                        .replaceAll("%s", String.valueOf(Bukkit.getOnlinePlayers().size())));
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();

        //Custom quit message
        e.setQuitMessage(
                Lang.getHeadedString(Lang.PLAYER_LEAVE)
                        .replaceAll("%p", p.getName())
                        .replaceAll("%s", String.valueOf(Bukkit.getOnlinePlayers().size() - 1)));
    }

}
