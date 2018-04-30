package com.benjisoft.Potato;
import org.bukkit.plugin.java.JavaPlugin;

public class PotatoTest extends JavaPlugin {
	// When plugin is first enabled
	@Override
	public void onEnable() {
		this.getCommand("potato").setExecutor(new CommandPotato());
	}
	// Fired when plugin is disabled
	public void onDisable() {
		
	}
}
