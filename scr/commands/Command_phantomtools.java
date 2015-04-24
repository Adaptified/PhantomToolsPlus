package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY, permission = "phantom.user.phantomtools")
public class Command_phantomtools extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(messages.pname + "Phantomtools+ was designed as a fun plugin, just to play around.  It's since adapted adding multiple commands and into an actually useful plugin.");
        sender.sendMessage(messages.pname + "Version: " + ChatColor.AQUA + messages.pver);
        sender.sendMessage(messages.pname + "Authors: " + ChatColor.AQUA + messages.pauthors);
        sender.sendMessage(messages.pname + "Link: " + ChatColor.AQUA + messages.plink);
        return true;
    
    }
}
