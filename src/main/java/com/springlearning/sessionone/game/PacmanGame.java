package com.springlearning.sessionone.game;

public class PacmanGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Move Up");
		
	}

	@Override
	public void down() {

		System.out.println("Down");
	}

	@Override
	public void left() {

		System.out.println("Move Left");
	}

	@Override
	public void right() {

		System.out.println("Move right");
	}

}
