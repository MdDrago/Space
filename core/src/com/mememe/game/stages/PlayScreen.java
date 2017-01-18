package com.mememe.game.stages;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.mememe.game.Game;
import com.mememe.game.gameplay.Ship;

/**
 * Created by Westh on 15.01.2017.
 */

public class PlayScreen extends DefaultScreen{
    private Image bg;
    private Stage stage;

    public PlayScreen(Game game) {
        super(game);
        stage = new Stage();
        bg = new Image(new Texture("backGround.jpg"));
        Gdx.input.setInputProcessor(stage);

        stage.addActor(bg);
        stage.addActor(new Ship());
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

       /* game.batch.begin();
        game.batch.draw(bg,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.batch.end();*/

        stage.act(delta);
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }


}
