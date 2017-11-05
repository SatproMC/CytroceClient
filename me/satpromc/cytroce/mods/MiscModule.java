package me.satpromc.cytroce.mods;

import net.minecraft.client.Minecraft;

public class MiscModule {

	public static Minecraft mc = Minecraft.getMinecraft();
	private String name;
	private int key;
	private boolean toggled;
	
	
	public MiscModule(String n, int var1) {
		name = n;
		key = var1;
		toggled = false;
	}
	
	public void toggle() {
		onToggle();
		toggled = !toggled;
		if (toggled) {
			onEnable();
		} else {
			onDisable();
		}
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public void onToggle() {
		
	}
	
	public Minecraft getMC() {
		return mc;
	}
	
	public void setMC(Minecraft mc) {
		this.mc = mc;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int var1) {
		this.key = var1;
	}
	
	public boolean isToggled() {
		return toggled;
	}
	
	
	
	
	
}
