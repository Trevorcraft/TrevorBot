package net.trevorcraft.trevorbot.command.base.autocompleters;

import org.bukkit.entity.Player;

import java.util.List;

public abstract class ArgumentAutocompleter {
  public abstract List<String> getCompletions(Player player, String arg);
}
