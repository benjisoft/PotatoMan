package com.benjisoft.Potato;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCarrot implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender2, Command cmd2, String label2, String[] args) {
		if (sender2 instanceof Player) {
			Player player = (Player) sender2;
			
			// Message Player
			player.sendMessage("Oh, piss off!");
			player.kickPlayer("Don't be thicc! Carrots are cancer!");
		}
		
		return true;
	}
}
