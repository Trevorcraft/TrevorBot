package net.trevorcraft.trevorbot;

import net.trevorcraft.trevorbot.command.base.trevorbot.TrevorbotCommand;
import net.trevorcraft.trevorbot.command.base.CommandBase;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
  public static JavaPlugin Plugin;
  @Override
  public void onEnable() {
    Plugin = this;
    CommandBase.setPlugin(this);
    new TrevorbotCommand();

    getLogger().info("Trevorbot started!");
  }
}
