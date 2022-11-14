package fr.zakyotsu.fairyuhc.command;

import fr.zakyotsu.fairyuhc.inventories.ClassInventory;
import fr.zakyotsu.fairyuhc.schedulers.CountdownScheduler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.zakyotsu.fairyuhc.utils.Lang;
import fr.zakyotsu.fairyuhc.FairyUHC;

public class CommandHandler implements CommandExecutor {

    private boolean cancelIfSenderNotAllowed(CommandSender sender) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Lang.getHeadedString(Lang.SENDER_NOT_ALLOWED));
            return true;
        }
        return false;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] arguments) {

        if (cancelIfSenderNotAllowed(sender)) {
            return true;
        }

        Player player = (Player) sender;

        if(arguments.length > 0) {

            switch(arguments[0].toLowerCase()) {
                case "start":
                    new CountdownScheduler().runTaskTimer(FairyUHC.getInstance(), 0L, 20L);
                    return true;

                case "stop":

                    break;

                case "class":
                    player.openInventory(new ClassInventory().createInventory());
                    return true;

            }


            if (FairyUHC.getInstance().isGameRunning()) {
                //            switch(args[0].toLowerCase()) {
//                case "law":
//                    Mavis.law(p);
//                    break;
//
//                case "spirit":
//                    Lucy.lucySpirit(p);
//                    break;
//
//                case "reveal":
//                    Carla.reveal(p);
//                    break;
//
//                case "lightning":
//                    Luxus.lightning(p, args);
//                    break;
//
//                case "list":
//                    Commands.listPlayers(p);
//                    break;
//
//                case "revive":
//                    Commands.revive(p);
//                    break;
//
//                default:
//                    Commands.help(p);
//                    break;
//            }
            } else {
                player.sendMessage(Lang.getHeadedString(Lang.GAME_NOT_STARTED));
                return true;
            }
          } else help(player);

        return true;
    }

    private void help(Player p) {
        p.sendMessage("");
        p.sendMessage(Lang.getHeadedString(Lang.AUTHOR));

        if (p.isOp()) {
            p.sendMessage(Lang.getString(Lang.HELP_START));
            p.sendMessage(Lang.getString(Lang.HELP_STOP));
            p.sendMessage(Lang.getString(Lang.HELP_SETCLASS));
        }

        p.sendMessage(Lang.getString(Lang.HELP_LIST));
        p.sendMessage(Lang.getString(Lang.HELP_SEE));
        p.sendMessage(Lang.getString(Lang.HELP_LAW));
        p.sendMessage(Lang.getString(Lang.HELP_THUNDER));
        p.sendMessage(Lang.getString(Lang.HELP_SPIRIT));
        p.sendMessage("");
    }
}