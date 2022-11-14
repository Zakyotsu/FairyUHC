package fr.zakyotsu.fairyuhc.characters;

import fr.zakyotsu.fairyuhc.FairyUHC;
import lombok.Getter;
import org.bukkit.scoreboard.Team;

import java.util.Set;

@Getter
public class DefaultCharacter {

    private Team team;
    private CharacterEnum type;

    //This should be called once, so no need for checks
    public DefaultCharacter(String characterName, CharacterEnum type) {
        team = FairyUHC.getInstance().getScoreboard().registerNewTeam(characterName);
    }

    public Set<String> getPlayers() {
        return team.getEntries();
    }

    public CharacterEnum getType() {
        return type;
    }
}
