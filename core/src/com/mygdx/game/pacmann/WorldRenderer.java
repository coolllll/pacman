package com.mygdx.game.pacmann;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
		private Pacmannnnnn pacmanGame;
		private Texture pacmanImg;
		private MazeRenderer mazeRenderer;
		public SpriteBatch batch;
		World world;
		private Pacman pacman;
		public static final int BLOCK_SIZE = 40;
		public WorldRenderer(Pacmannnnnn pacmanGame, World world) {
	        this.pacmanGame = pacmanGame;
	        batch = pacmanGame.batch;
	        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
	        this.world = world;
	 
	        pacmanImg = new Texture("pacman.png");
	    }
		public void render() {
			mazeRenderer.render();
			SpriteBatch batch = pacmanGame.batch;
	        Vector2 pos = world.getPacman().getPosition();
	        batch.begin();
	        batch.draw(pacmanImg, pos.x - BLOCK_SIZE/2, pacmanGame.HEIGHT - pos.y - BLOCK_SIZE/2);
	        batch.end();
	    }
}
