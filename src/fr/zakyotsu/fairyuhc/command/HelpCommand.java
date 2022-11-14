package fr.zakyotsu.fairyuhc.command;

import org.bukkit.command.CommandSender;

public class HelpCommand extends CommandBase {

    @Override
    public void call(CommandArguments arguments) {
        CommandSender sender = arguments.getSender();

        sendMessage(sender, "Help command");
        sendMessage(sender, ".");
        sendMessage(sender, ".");
        sendMessage(sender, ".");
        sendMessage(sender, "End");
    }

    private void sendMessage(CommandSender sender, String message) {

    }
}
