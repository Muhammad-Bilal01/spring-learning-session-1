package com.springlearning.sessionone.game;

public class GameRunner {
	
//	tight couple
//	private MarioGame game; // our GameRunner class is tightly couple with MarioGame class
//	private SuperContraGame game;
	
//	loose couple
	private GameConsole game;
	
	
//	Constructor that get a Mario game
	public GameRunner(GameConsole game){ 
		this.game = game;
	}

	public void run() {
		System.out.println("Runner " + game);
			
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	
	
}
