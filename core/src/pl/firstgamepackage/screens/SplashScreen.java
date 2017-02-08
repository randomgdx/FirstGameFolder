package pl.firstgamepackage.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;

import pl.firstgamepackage.FirstGameClass;


/**
 * Created by NameD on 07.02.2017.
 */

public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(final FirstGameClass game) {
        super(game);

        Timer.schedule(new Timer.Task() {
            @Override
            public void run() {

                game.setScreen(new GameplayScreen(game));

            }
        },1);

    }

    @Override
    protected void init() {
        // TODO implement better assets loading when game grows
        splashImg = new Texture("badlogic.jpg");
    }


    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(splashImg, 0, 0);
        spriteBatch.end();
    }


}
