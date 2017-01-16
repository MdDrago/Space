package com.mememe.game.stages;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.mememe.game.Game;

/**
 * Created by Westh on 15.01.2017.
 */

public abstract class DefaultScreen implements Screen {
    Game game;
    OrthographicCamera camera;

    public DefaultScreen(Game game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
    }

}