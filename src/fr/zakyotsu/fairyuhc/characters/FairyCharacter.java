package fr.zakyotsu.fairyuhc.characters;

import fr.zakyotsu.fairyuhc.FairyUHC;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public interface FairyCharacter {
    public Team getTeam();
    public Role getRole();
    public void checkAbility(Object... objects);
    public void resetEffects();
    public void setupTeam(Player p);
    public void registerEvents();
}

enum Role {
    FAIRYTAIL, EVIL, SOLO;
}
