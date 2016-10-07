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
		public WorldRenderer(Pacmannnnnn pacmanGame, World world) {
	        this.pacmanGame = pacmanGame;
	        batch = pacmanGame.batch;
	        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
	        this.world = world;
	 
	        pacmanImg = new Texture("pacman.png");
	    }
		public void render(float delta) {
			mazeRenderer.render();
	        SpriteBatch batch = pacmanGame.batch;
	        batch.begin();
	        Vector2 pos = pacman.getPosition();
	        batch.draw(pacmanImg, pos.x, pos.y);
	        batch.end();
	    }
}
