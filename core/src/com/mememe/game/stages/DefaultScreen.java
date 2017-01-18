package com.mememe.game.stages;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mememe.game.Game;

/**
 * Created by Westh on 15.01.2017.
 */

public abstract class DefaultScreen extends Stage {
    Game game;

    public DefaultScreen(Game game, Viewport viewport) {
        super(viewport);
        this.game = game;
    }


}