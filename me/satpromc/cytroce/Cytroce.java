package me.satpromc.cytroce;

import java.util.ArrayList;

import me.satpromc.cytroce.mods.*;
import me.satpromc.cytroce.mods.builtin_mods.autosprint.AutoSprint;
import me.satpromc.cytroce.mods.mods.Gamma;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class Cytroce {

	private static ArrayList<Module> modules;
	
	public Cytroce() {
		modules = new ArrayList<>();
		
		//0
		modules.add(new Gamma());
		modules.add(new AutoSprint());
	}
	
	public static final Double VERSION = 0.1;
	public static final String NAME = "Cytroce";
	
	public static void addMod(Module m) {
		modules.add(m);
	}
	
	public static ArrayList getMods() {
		return modules;
	}
	
	public static Minecraft getMinecraft() {
		return Minecraft.getMinecraft();
	}
	
	public static void onUpdate() {
		for (Module m : modules) {
			m.onUpdate();
		}
	}
	
	public static void onRender() {
		for (Module m : modules){
			m.onRender();
		}
	}
	
	public static void onKeyPressed(int var1) {
		for (Module m : modules) {
			if (m.getKey() == var1) {
				m.toggle();
			}
		}
	}
	
	
	public static void sendMessage(String msg) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("§b§lCytroce§7: §f" + msg));
	}
	
	
	
}
