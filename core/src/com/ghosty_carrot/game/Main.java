package com.ghosty_carrot.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.ghosty_carrot.game.view.GameScreen;

public class Main extends Game {

	private Screen gameScreen;

	@Override
	public void create() {
    gameScreen = new GameScreen();
    setScreen(gameScreen);
	}
}
