package com.lyndseyjane.fourinarow;
import java.util.Scanner;

public class Game {
	
	static Scanner userInput = new Scanner(System.in);
	static Player redPlayer; // new HumanPlayer(Color.RED);
	static Player bluePlayer; // new HumanPlayer(Color.BLUE);
	static String tempName = new String();
	static GameBoard mainGame = new GameBoard();
	static Boolean isRedTurn = true;
	
	// main game automation
	public static void gameLoop() {
		while ((mainGame.hasWon()==Color.EMPTY) && !mainGame.isFull()) {
			if (isRedTurn) {
				redPlayer.move(mainGame);
				isRedTurn = false;
			}
			else {bluePlayer.move(mainGame);
				isRedTurn = true;
			}
		}
	}
	
	// main game dialogue and calls
	public static void main(String[] args) {		
		mainGame.clear();
		System.out.println("Welcome to Four-in-a-Row.");
		System.out.println("Enter a name for red player (x):");
		tempName = userInput.next();
		redPlayer = new HumanPlayer(Color.RED, tempName);
		System.out.println("Enter a name for blue player (o):");
		tempName = userInput.next();
		bluePlayer = new HumanPlayer(Color.BLUE, tempName);
	//	bluePlayer.setName(tempName);
		System.out.println("Great.");
		System.out.println("Here is the board.");
		gameLoop();
	}
	

}
