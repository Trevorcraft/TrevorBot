package net.trevorcraft.trevorbot.command.base.trevorbot;

import net.trevorcraft.trevorbot.command.base.CommandBase;
import net.trevorcraft.trevorbot.command.base.SimpleCommandSub;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TrevorbotCommand extends CommandBase {
  public TrevorbotCommand() {
    super("trevorbot", new SimpleCommandSub() {
      @Override
      public void execute(Player player) {
        sendMessage(player, "Made on " + ChatColor.DARK_GREEN + "Earth " + ChatColor.GREEN + "by Humans!");
      }
    });

    addSubCommand("restart", new RestartCountdownSub());
  }
}


