package com.mygdx.game.pacmann;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
	private Pacmannnnnn pacmanGame;
	private Texture pacmanImg;
	private Pacman pacman;
	World world;
	private WorldRenderer worldRenderer;
    public GameScreen(Pacmannnnnn pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacmanImg = new Texture("pacman.png");
        world = new World(pacmanGame);
        pacman = world.getPacman();
        worldRenderer = new WorldRenderer(pacmanGame,world);
        //pacman = new Pacman(100,100);
    }
    private void update(float delta) {
    	 updatePacmanDirection();
         world.update(delta);
    }
    private void updatePacmanDirection() {
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
   		 pacman.setNextDirection(Pacman.DIRECTION_LEFT);
        }
   	 else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
       	 pacman.setNextDirection(Pacman.DIRECTION_RIGHT);
        }
   	 else if(Gdx.input.isKeyPressed(Keys.UP)) {
       	 pacman.setNextDirection(Pacman.DIRECTION_UP);
        }
   	 else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
       	 pacman.setNextDirection(Pacman.DIRECTION_DOWN);
        }
        else
        {
       	 pacman.setNextDirection(Pacman.DIRECTION_STILL);
        }
    }
    @Override
    public void render(float delta) {
    	 update(delta);
    	 
         Gdx.gl.glClearColor(0, 0, 0, 1);
         Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
  
         worldRenderer.render();
    }
}
