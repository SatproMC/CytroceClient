package me.satpromc.cytroce.mods;

import net.minecraft.client.Minecraft;

public class Module {

	public static Minecraft mc = Minecraft.getMinecraft();
	private String name;
	private int key;
	private boolean toggled;
	
	private Category category;
	
	public Module(String n, int var1, Category c) {
		name = n;
		key = var1;
		category = c;
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
	
	public void onUpdate() {
		
	}

	public void onRender() {
		
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
	
	public Category getCategory() {
		return category;
	}
	
	public final boolean isCategory(Category c) {
		return category == c;
	}
	
	
	
}
