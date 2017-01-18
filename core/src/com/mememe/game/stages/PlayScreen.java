package com.mememe.game.stages;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mememe.game.Game;
import com.mememe.game.gameplay.Ship;

/**
 * Created by Westh on 15.01.2017.
 */

public class PlayScreen extends DefaultScreen{
    private Image bg;
    private Ship ship;

    public PlayScreen(Game game, Viewport viewport) {
        super(game, viewport);
        bg = new Image(new Texture("backGround.jpg"));
        Gdx.input.setInputProcessor(this);
        ship = new Ship();
        setActors();
    }


    private void setActors(){
        this.addActor(bg);
        this.addActor(ship);
    }

    @Override
    public void dispose() {

    }


}
