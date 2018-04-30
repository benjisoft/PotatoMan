package com.benjisoft.Potato;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandInfo implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender3, Command cmd3, String label3, String[] args) {
		if(sender3 instanceof Player) {
			Player player = (Player) sender3;
			
			// Message Player
			player.sendMessage("Thanks for asking! You can access the github at: https://github.com/benjisoft/PotatoMan and my personal site at: http://benjisoft.org.uk! Thank you!");
		}
		return false;
	}
	

}
