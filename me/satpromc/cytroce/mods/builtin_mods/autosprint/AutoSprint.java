package me.satpromc.cytroce.mods.builtin_mods.autosprint;

import org.lwjgl.input.Keyboard;

import me.satpromc.cytroce.Cytroce;
import me.satpromc.cytroce.mods.Category;
import me.satpromc.cytroce.mods.Module;

public class AutoSprint extends Module {

	public AutoSprint() {
		super("AutoSprint", Keyboard.KEY_K, Category.PLAYER);
	}
		
	public void onEnable() {
		Cytroce.sendMessage("AutoSprint enabled.");
	}
	
	public void onDisable() {
		Cytroce.sendMessage("AutoSprint disabled.");
	}
	
	public void onUpdate() {
		if (this.isToggled()) {
			mc.thePlayer.setSprinting(true);
		}
	}
	
	

}
