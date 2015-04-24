package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, permission = "phantom.user.colours")
public class Command_colours extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(messages.pname + "Minecraft colours:");
        sender.sendMessage(messages.pname + ChatColor.BLACK + "&1" + ChatColor.GRAY + ", " + ChatColor.BLUE + "&1" + ChatColor.GRAY + ", " + ChatColor.GREEN + "&2" + ChatColor.GRAY + ", " + ChatColor.DARK_AQUA + "&3");
        sender.sendMessage(messages.pname + ChatColor.DARK_RED + "&4" + ChatColor.GRAY + ", " + ChatColor.DARK_PURPLE + "&5" + ChatColor.GRAY + ", " + ChatColor.GOLD + "&6" + ChatColor.GRAY + ", " + ChatColor.GRAY + "&7");
        sender.sendMessage(messages.pname + ChatColor.DARK_GRAY + "&8" + ChatColor.GRAY + ", " + ChatColor.DARK_AQUA + "&9" + ChatColor.GRAY + ", " + ChatColor.LIGHT_PURPLE + "&a" + ChatColor.GRAY + ", " + ChatColor.AQUA + "&b");
        sender.sendMessage(messages.pname + ChatColor.RED + "&c" + ChatColor.GRAY + ", " + ChatColor.LIGHT_PURPLE + "&d" + ChatColor.GRAY + ", " + ChatColor.YELLOW + "&e");
        sender.sendMessage(messages.pname + "&r - Reset" + ChatColor.GRAY + ", " + ChatColor.STRIKETHROUGH + "&m" + ChatColor.GRAY + " (m), " + ChatColor.UNDERLINE + "&n" + ChatColor.GRAY + " (n)");
        return true;
    }
}
