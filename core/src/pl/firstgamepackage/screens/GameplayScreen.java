package pl.firstgamepackage.screens;

import pl.firstgamepackage.FirstGameClass;
import pl.firstgamepackage.entities.Player;

/**
 * Created by NameD on 08.02.2017.
 */

public class GameplayScreen extends AbstractScreen {

    private Player player;

    public GameplayScreen(FirstGameClass game) {

        super(game);
        Init();
    }

    private void Init() {

        initPlayer();

    }

    private void initPlayer() {

        player = new Player();
        stage.addActor(player);

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update();

        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();

    }

    private void update() {
        stage.act();
    }
}
