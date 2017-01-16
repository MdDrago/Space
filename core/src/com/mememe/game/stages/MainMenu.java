package com.mememe.game.stages;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mememe.game.Game;


/**
 * Created by Westh on 15.01.2017.
 */

public class MainMenu extends DefaultScreen{
    private Texture bg;
    private Texture play;
    public MainMenu(Game game) {
        super(game);
        bg = new Texture("menubg.jpg");
        play = new Texture("play.png");
        play.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        bg.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
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

        game.batch.begin();
        game.batch.draw(bg,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        drawInMiddle(game.batch,play);
        game.batch.end();

        if(Gdx.input.justTouched()){
            game.setScreen(new PlayScreen(game));
        }
    }

    private void drawInMiddle(SpriteBatch batch, Texture texture){
        float x = texture.getWidth();
        float y = texture.getHeight();
        batch.draw(texture, camera.position.x - (x / 2), camera.position.y - (y / 2));
        //batch.draw(texture,x,y,originX,originY);
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
