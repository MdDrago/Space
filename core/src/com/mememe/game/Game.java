package com.mememe.game;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mememe.game.stages.MainMenu;

public class Game extends com.badlogic.gdx.Game{
	public SpriteBatch batch;

	@Override
	public void create() {
	batch = new SpriteBatch();
	this.setScreen(new MainMenu(this));
    }

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
}
