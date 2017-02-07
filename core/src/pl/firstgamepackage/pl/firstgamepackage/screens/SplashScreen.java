package pl.firstgamepackage.pl.firstgamepackage.screens;

import com.badlogic.gdx.graphics.Texture;

import pl.firstgamepackage.FirstGameClass;

/**
 * Created by NameD on 07.02.2017.
 */

public class SplashScreen extends AbstractScreen {

    private Texture splasahImg;

    public SplashScreen(FirstGameClass game) {
        super(game);
        Init();
    }

    private void Init() {
        // TODO implement better assets loading when game grows
        splasahImg = new Texture("badlogic.jpg");

    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(splasahImg, 0, 0);
        spriteBatch.end();
    }
}
