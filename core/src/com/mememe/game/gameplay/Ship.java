package com.mememe.game.gameplay;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;


/**
 * Created by Westh on 17.01.2017.
 */
public class Ship extends Actor{
    private Texture currentDirection;
    private final Texture forward = new Texture("ShipMove.png");
    private final Texture left= new Texture("ShipTurnLeft.png");
    private final Texture right = new Texture("ShipTurnRight.png");
    private float originX;
    private final float originY;
    private final int sizeX, sizeY;
    public Ship(){
        sizeX = forward.getWidth()/4;
        sizeY = forward.getHeight()/4;
        originY = Gdx.graphics.getHeight()/10;
        originX = Gdx.graphics.getWidth()/2;
        currentDirection = forward;
        setPosition();
        currentDirection.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
    }


    public void setPosition() {
        super.setPosition(originX, originY);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(currentDirection,originX,originY,sizeX,sizeY);

    }



    @Override
    public void act(float delta) {
        super.act(delta);
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            currentDirection = left;
            originX -=5;
        }else
            if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            currentDirection = right;
            originX+=5;
        }else{
            currentDirection = forward;
            currentDirection.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        }
    }


}
