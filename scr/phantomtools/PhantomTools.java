package me.zd12.phantomtools;

import me.zd12.phantomtools.commands.phantomtoolsplus;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class PhantomTools extends BukkitPlugin { 
    public PhantomTools plugin;
    public YamlConfig config;
    public BukkitCommandHandler handler;

    @Override
    public void onLoad() {
        this.plugin = this;
        this.handler = new BukkitCommandHandler(plugin);
        config = new YamlConfig(plugin, "config.yml", false);
    }
    
    @Override
    public void onEnable() {
        BukkitLib.init(plugin);
        config = new YamlConfig(plugin, "config.yml");
        config.load();
        
        handler.setCommandLocation(phantomtoolsplus.class.getPackage());
        
        LoggerUtils.info(plugin, messages.pname + " v" + plugin.getVersion() + " has been enabled.");
    }
    @Override
    public void onDisable() {
        LoggerUtils.info(plugin, messages.pname + " has been disabled.");
        LoggerUtils.info(plugin, "INFO: The PhantomToolsPlus plugin has been disabled, you may enable by restarting or reloading.");
    
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        return handler.handleCommand(sender, cmd, commandLabel, args);
    }
}

