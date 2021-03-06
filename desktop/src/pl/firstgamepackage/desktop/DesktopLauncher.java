package pl.firstgamepackage.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.firstgamepackage.FirstGameClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new FirstGameClass(), config);

		config.title = FirstGameClass.GAME_NAME;
		config.width = FirstGameClass.WIDTH;
		config.height = FirstGameClass.HEIGHT;
		config.resizable = false;

	}
}
