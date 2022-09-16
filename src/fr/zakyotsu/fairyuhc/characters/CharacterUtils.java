package fr.zakyotsu.fairyuhc.characters;

import fr.zakyotsu.fairyuhc.FairyUHC;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;

public class CharacterUtils {

    public static DefaultCharacter getCharacterClassFromName(FairyEnum characterEnum) {
        for(DefaultCharacter character : FairyUHC.characters)
            if(character.getClass().getSimpleName().equalsIgnoreCase(characterEnum.name()))
                return character;
        return null;
    }

    public static ArrayList<Player> getPlayers(FairyEnum characterEnum) {
        DefaultCharacter character = getCharacterClassFromName(characterEnum);
        OfflinePlayer of;
        ArrayList<Player> players = new ArrayList<>();

        for(String pName : character.getTeam().getEntries()) {
            of = Bukkit.getOfflinePlayer(pName);
            if(of.isOnline()) players.add((Player) of);
        }
        return players;
    }
}

enum Role {
    FAIRYTAIL, EVIL, SOLO;
}
