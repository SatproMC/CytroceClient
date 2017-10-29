package me.satpromc.cytroce;

import org.lwjgl.opengl.Display;

import me.satpromc.cytroce.module.ModuleManager;

public class Cytroce {

	public static String CLIENT_NAME = "Cytroce";
	public static double VERSION = 0.1;
	
	public static ModuleManager moduleManager;
	
	public static final Cytroce CLIENT = new Cytroce();
	
	public static void startClient() {
		moduleManager = new ModuleManager();
		Display.setTitle(CLIENT_NAME + "(release: " + VERSION + ")");
	}

	public static String getClientName() {
		return CLIENT_NAME;
	}

	public static void setClientName(String cLIENT_NAME) {
		CLIENT_NAME = cLIENT_NAME;
	}

	public static double getVersion() {
		return VERSION;
	}

	public static void setVersion(double vERSION) {
		VERSION = vERSION;
	}

	public static Cytroce getClient() {
		return CLIENT;
	}
	
	
	
	
}
