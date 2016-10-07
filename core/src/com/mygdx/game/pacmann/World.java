package com.mygdx.game.pacmann;

public class World {
	private Pacman pacman;
    private Pacmannnnnn pacmanGame;
    private Maze maze;
    World(Pacmannnnnn pacmanGame) {
        this.pacmanGame = pacmanGame;
        maze = new Maze();
        pacman = new Pacman(100,100);
    }
 
    Pacman getPacman() {
        return pacman;
    }
    Maze getMaze() {
        return maze;
    }
}
