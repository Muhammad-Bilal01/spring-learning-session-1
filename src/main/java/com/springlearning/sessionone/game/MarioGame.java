package com.springlearning.sessionone.game;

public class MarioGame implements GameConsole{

//		actions
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Move into the hole");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
	
}
