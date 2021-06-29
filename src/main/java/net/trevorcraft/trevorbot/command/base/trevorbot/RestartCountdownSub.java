package net.trevorcraft.trevorbot.command.base.trevorbot;

import net.trevorcraft.trevorbot.Plugin;
import net.trevorcraft.trevorbot.command.base.ModularCommandSub;
import net.trevorcraft.trevorbot.command.base.autocompleters.OptionListAutocompleter;
import net.trevorcraft.trevorbot.command.base.validators.IntegerValidator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

class RestartCountdownSub extends ModularCommandSub {
  public RestartCountdownSub() {
    super(new IntegerValidator("seconds"));
    addAutocompleter("seconds", new OptionListAutocompleter("5", "10", "15", "20"));
  }


  @Override
  public void execute(Player player) {
    int seconds = getArgument("seconds");
    for (int i = 1; i <= seconds; i++) {
      int finalI = i;
      Bukkit.getScheduler().scheduleSyncDelayedTask(Plugin.Plugin, () ->
              Bukkit.broadcastMessage("" + ChatColor.GREEN + ChatColor.BOLD + "Restarting server in " + finalI + " seconds"),
          (seconds - i) * 20);
    }
    Bukkit.getScheduler().scheduleSyncDelayedTask(Plugin.Plugin, () -> {
          Bukkit.broadcastMessage("" + ChatColor.GREEN + ChatColor.BOLD + "SERVER RESTARTING");
          Bukkit.spigot().restart();
        },
        seconds * 20);
  }
}
