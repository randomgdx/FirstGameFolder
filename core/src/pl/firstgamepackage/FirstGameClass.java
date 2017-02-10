package pl.firstgamepackage;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

import pl.firstgamepackage.screens.SplashScreen;

public class FirstGameClass extends Game {

	public final static String GAME_PREFS = "pl.firstgamepackage.prefs";
    public final static String GAME_SCORE = "pl.firstgamepackage.prefs.score";

	public final static String GAME_NAME = "FirstGameName";
	public final static int WIDTH = 480;
	public final static int HEIGHT = 700;

	private boolean paused;

    private Preferences prefs;

	private int points;


	
	@Override
	public void create () {
		init();
		this.setScreen(new SplashScreen(this));

	}

	private void init() {

		prefs = Gdx.app.getPreferences(GAME_PREFS);
		loadScore();
	}

	private void loadScore() {

		points = prefs.getInteger(GAME_SCORE);

	}


	public void addPoint(){

		points++;
		updateSavedScoreInPrefs();
	}

	private void updateSavedScoreInPrefs() {
		prefs.putInteger(GAME_SCORE, points);
		prefs.flush();
	}


	public void resetGameScore() {

		points = 0;
		updateSavedScoreInPrefs();

	}

	// getter and setters

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public int getPoints() {
		return points;
	}


}
