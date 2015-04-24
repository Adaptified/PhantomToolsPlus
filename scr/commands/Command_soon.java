package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.PLAYER, permission = "phantom.user.soon")
public class Command_soon extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(messages.pname + "What's happening soon? Well:");
        sender.sendMessage(ChatColor.GRAY + " 1) ");
        sender.sendMessage(ChatColor.GRAY + " 2) ");
        sender.sendMessage(ChatColor.GRAY + " 3) ");
        sender.sendMessage(ChatColor.GRAY + "Last modified: " + messages.lastmodified);
        return true;
    }
}
