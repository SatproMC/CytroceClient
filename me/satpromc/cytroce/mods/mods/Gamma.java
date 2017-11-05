package me.satpromc.cytroce.mods.mods;

import org.lwjgl.input.Keyboard;

import me.satpromc.cytroce.mods.Category;
import me.satpromc.cytroce.mods.Module;

public class Gamma extends Module {
	
	public Gamma() {
		
		super("FullBright", Keyboard.KEY_G, Category.RENDER);
		// TODO Auto-generated constructor stub
	}
	
	public void onUpdate() {
		if (this.isToggled()) {
			mc.gameSettings.gammaSetting = 100f;
		}
	}
	
	public void onDisable() {
		mc.gameSettings.gammaSetting = 0f;
	}

}
