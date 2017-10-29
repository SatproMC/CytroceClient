package me.satpromc.cytroce.ui;

import me.satpromc.cytroce.Cytroce;
import me.satpromc.cytroce.module.Module;
import me.satpromc.cytroce.utils.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;

public class GUIHook extends GuiIngame{

	public GUIHook(Minecraft mcIn) {
		super(mcIn);
	}

	public void func_175180_a(float p_175180_1_) {
		super.func_175180_a(p_175180_1_);
		ScaledResolution sr = new ScaledResolution
				(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth,
						Minecraft.getMinecraft().displayHeight);
		Wrapper.fr.drawString(Cytroce.getClientName() + " "
				+ "(release: " + Cytroce.getVersion() + ")", 1, 1, 0xf4333d);
		
		int i = 0;
		for (Module m : Cytroce.getClient().moduleManager.activeModules) {
			m.onRender();
			
			if (m.getState()) {
				int width = sr.getScaledWidth() - Wrapper.fr.getStringWidth(m.getName()) - 2;
				int height = (10 * i);
				Wrapper.fr.drawString(m.getName(), width, height, 0xf4333d);
			}
		}
	}
	
	
}
