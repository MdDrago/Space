package com.mememe.game.stages;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.mememe.game.Game;

import org.omg.CORBA.PRIVATE_MEMBER;


/**
 * Created by Westh on 15.01.2017.
 */

public class MainMenu extends DefaultScreen{
    private Texture bg;
    private Texture play;
    private ImageButton pButton;
    private Stage stage;
    public MainMenu(final Game game) {
        super(game);

        bg = new Texture("menubg.jpg");
        play = new Texture("play.png");
        play.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        bg.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

        Drawable d = new Image(play).getDrawable();
        pButton = new ImageButton(d);
        pButton.setPosition(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2,64);
        pButton.setSize(play.getWidth(),play.getHeight());
        pButton.addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("finaly");
                game.setScreen(new PlayScreen(game));
            }
        });
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        stage.addActor(pButton);
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
        //pButton.draw(game.batch,2);
        game.batch.end();
        stage.act(delta);
        stage.draw();
    }


/*
    private void drawInMiddle(SpriteBatch batch, Texture texture){
        float x = texture.getWidth();
        float y = texture.getHeight();
        batch.draw(texture, camera.position.x - (x / 2), camera.position.y - (y / 2));
        //batch.draw(texture,x,y,originX,originY);
    }
*/
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

    //-===============================

}
