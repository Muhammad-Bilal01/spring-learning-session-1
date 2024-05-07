package com.springlearning.sessionone;

import com.springlearning.sessionone.game.GameRunner;
import com.springlearning.sessionone.game.MarioGame;
import com.springlearning.sessionone.game.PacmanGame;
import com.springlearning.sessionone.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		Tight Couple
//		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();
//		var gameRunner = new GameRunner(superContraGame);
//		gameRunner.run();
		
//		Loose Couple with interface
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); // 1: Object Created
		var gameRunner = new GameRunner(game); // 2: Object created + Wiring of Dependency
		// Game is the Dependency to run GameRunner			
		gameRunner.run();
		
		
	}

}
