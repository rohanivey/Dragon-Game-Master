package com.rohan.dragonGame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rohan.dragonGame.DragonGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Dragons!?";
		config.width = 1024;
		config.height = 768;
		config.fullscreen = false;
		new LwjglApplication(new DragonGame(), config);
	}
}
