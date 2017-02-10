package pl.firstgamepackage.screens;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import pl.firstgamepackage.FirstGameClass;
import pl.firstgamepackage.entities.Player;

/**
 * Created by NameD on 08.02.2017.
 */

public class GameplayScreen extends AbstractScreen {

    private Player player;
    private Button playerButton, resetScoreButton;
    private Label scoreLabel;


    public GameplayScreen(FirstGameClass game) {

        super(game);

    }

    @Override
    protected void init() {

        initPlayer();
        initPlayerButton();
        initScoreLabel();
        initResetScoreButton();
    }

    private void initResetScoreButton() {

        resetScoreButton = new Button(new Button.ButtonStyle());
        resetScoreButton.setWidth(100);
        resetScoreButton.setHeight(100);
        resetScoreButton.setX(330);
        resetScoreButton.setY(560);
        resetScoreButton.setDebug(true);

        stage.addActor(resetScoreButton);
        resetScoreButton.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                game.resetGameScore();

                return super.touchDown(event, x, y, pointer, button);
            }
        });


    }

    private void initScoreLabel() {

        LabelStyle labelStyle = new LabelStyle();
        labelStyle.font = new BitmapFont();
        scoreLabel = new Label("Test 123", labelStyle );
        scoreLabel.setX(20);
        scoreLabel.setY(650);
        stage.addActor(scoreLabel);

    }

    private void initPlayerButton() {

        playerButton = new Button(new Button.ButtonStyle());
        playerButton.setWidth(460);
        playerButton.setHeight(360);
        playerButton.setX(10);
        playerButton.setY(170);
        playerButton.setDebug(true);

        stage.addActor(playerButton);

        playerButton.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

              player.reactOnClick();
                game.addPoint();

                return super.touchDown(event, x, y, pointer, button);
            }
        });

    }


    private void initPlayer() {

        player = new Player();
        stage.addActor(player);

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update();

        //System.out.println("Points: " + game.getPoints());
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();

    }

    private void update() {
        scoreLabel.setText("Score: " + game.getPoints());
        stage.act();
    }
}
