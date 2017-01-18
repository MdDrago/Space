package com.mememe.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mememe.game.stages.MainMenu;

public class Game extends com.badlogic.gdx.Game{
	Stage stage;
	Viewport viewport;
	@Override
	public void create() {
		viewport  = new FitViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		stage = new MainMenu(this, viewport);
	}

	public void setStage(Stage stage){
		this.stage = stage;
	}
	@Override
	public void render() {
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	@Override
	public void dispose() {
		stage.dispose();
	}
}
