package com.benjisoft.Potato;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandPotato implements CommandExecutor {
	//Called when someone uses the command
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			// Give items to player
			ItemStack bakedpotato = new ItemStack(Material.POTATO_ITEM, 64);
			player.getInventory().addItem(bakedpotato);
			player.sendMessage("Have ye Potatos!");
		}
		
		// Return true if command used correctly
		return true;
	}
}
