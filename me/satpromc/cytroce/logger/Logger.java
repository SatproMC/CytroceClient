package me.satpromc.cytroce.logger;

import me.satpromc.cytroce.Cytroce;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public class Logger {
	
	Minecraft mc = Cytroce.getMinecraft();
	
	public void sendString() {
		ScaledResolution sr = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
		this.mc.entityRenderer.setupOverlayRendering();
		
		int yCount = 2;
		int x = 0;
		mc.fontRendererObj.drawString("", x, yCount, 0xffffffff);
	}
	
	public static void log(String log, LogCategory cat) {
		
		switch (cat) {
			case CUSTOM:
				
				break;
			case MOD_ENABLE_DISABLE:
				
				break;
			case ALERT:
				
				break;
			default:
				System.out.println("Default LogCateogory given. Returned.");
				break;
		}
		
	}
	
	

}
