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
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mememe.game.Game;

import org.omg.CORBA.PRIVATE_MEMBER;


/**
 * Created by Westh on 15.01.2017.
 */

public class MainMenu extends DefaultScreen{
    private Image bg;
    private ImageButton play;
    private ImageButton setings;

    public MainMenu(final Game game, Viewport viewport) {
        super(game, viewport);
        setings = new ImageButton(new Image(new Texture("setings.png")).getDrawable());
        bg = new Image(new Texture("menubg.jpg"));
        play = new ImageButton(new Image(new Texture("play.png")).getDrawable());
        Gdx.input.setInputProcessor(this);
        setActors();
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void dispose() {

    }



    private void setActors(){
        bg.setPosition(0,0);
        bg.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        play.setPosition(Gdx.graphics.getWidth()/2 - play.getWidth()/2,
                Gdx.graphics.getHeight()/2 - play.getHeight()/2);
        setings.setPosition(Gdx.graphics.getWidth()-setings.getWidth(), 0);
        play.addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                game.setStage(new PlayScreen(game, getViewport()));
            }
        });
        this.addActor(bg);
        this.addActor(play);
        this.addActor(setings);


    }


}
