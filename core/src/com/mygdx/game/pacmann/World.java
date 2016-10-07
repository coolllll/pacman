package com.mygdx.game.pacmann;

public class World {
	private Pacman pacman;
    private Pacmannnnnn pacmanGame;
    private Maze maze;
    World(Pacmannnnnn pacmanGame) {
        this.pacmanGame = pacmanGame;
        maze = new Maze();
        pacman = new Pacman(60,60);
    }
 
    Pacman getPacman() {
        return pacman;
    }
    Maze getMaze() {
        return maze;
    }
    public void update(float delta) {
        pacman.update();
    }
}
