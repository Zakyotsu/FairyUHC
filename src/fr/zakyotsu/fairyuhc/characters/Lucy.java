package fr.zakyotsu.fairyuhc.characters;

import fr.zakyotsu.fairyuhc.FairyUHC;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class Lucy implements DefaultCharacter {

    private Team team;
    private FairyEnum enum1;


    /**
     * @param characterName Name of the character
     */
    public Lucy(String characterName) {

    }


    @Override
    public Team getTeam() {
        return team == null ? team = FairyUHC.getInstance().getScoreboard().getTeam(FairyEnum.LUCY.name()) : team;
    }

    @Override
    public Role getRole() {
        return Role.FAIRYTAIL;
    }

    @Override
    public void checkAbility(Object... objects) {

    }

    @Override
    public void resetEffects() {

    }

    @Override
    public void setupTeam(Player p) {

    }

}
