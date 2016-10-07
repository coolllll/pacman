package com.mygdx.game.pacmann;

public class World {
	private Pacman pacman;
    private Pacmannnnnn pacmanGame;
 
    World(Pacmannnnnn pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        pacman = new Pacman(100,100);
    }
 
    Pacman getPacman() {
        return pacman;
    }
}
