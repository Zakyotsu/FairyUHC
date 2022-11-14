package fr.zakyotsu.fairyuhc.command;

import org.bukkit.command.CommandSender;

import java.util.List;

public class CommandArguments {

    private CommandSender sender;
    private List<String> arguments;

    public CommandSender getSender() {
        return sender;
    }

    public List<String> getArguments() {
        return arguments;
    }

}
