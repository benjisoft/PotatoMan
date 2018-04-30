package com.benjisoft.Potato;
import org.bukkit.plugin.java.JavaPlugin;

public class PotatoTest extends JavaPlugin {
	// When plugin is first enabled
	@Override
	public void onEnable() {
		this.getCommand("potato").setExecutor(new CommandPotato());
		this.getCommand("carrot").setExecutor(new CommandCarrot());
	}
	// Fired when plugin is disabled
	public void onDisable() {
		
	}
}
