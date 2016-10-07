package com.mygdx.game.pacmann.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.pacmann.Pacmannnnnn;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Pacmannnnnn.WIDTH;
        config.height = Pacmannnnnn.HEIGHT;
		new LwjglApplication(new Pacmannnnnn(), config);
	}
}
