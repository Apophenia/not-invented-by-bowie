package com.lyndseyjane.fourinarow;
import java.util.Scanner;

public class HumanPlayer implements Player {
	
	String playerName;
	Color playerColor;
	Scanner sc = new Scanner(System.in);

	//constructors
	HumanPlayer() {
		playerName = "Player 1";
		playerColor = Color.EMPTY;
	}
	
	HumanPlayer(Color inputColor) {
		playerName = "Player 1";
		playerColor = inputColor;
	}
	

	@Override
	public void move(GameBoard currentBoard) {
		System.out.print(playerName + ", it's your turn. ");
		int playerColumnInput = 0;
		if (playerColor == Color.BLUE) {
			System.out.println("You are player O (blue).");
		}
		else {
			System.out.println("You are player X (red).");
		}
		currentBoard.draw();
		System.out.println("Enter the number of the column where you would like to place a piece (1-7).");
	    playerColumnInput = sc.nextInt();
	    if ((playerColumnInput > -1) && (playerColumnInput < 8)) {
	    	for (int i = 5; i >= 0; --i) {
	    		if ((currentBoard.getColor(i,playerColumnInput-1))==Color.EMPTY) {
	    			currentBoard.setColor(i,(playerColumnInput-1),playerColor);
	    			System.out.println(playerName + " placed a piece in " + (i + 1) + ", " + playerColumnInput + ".");
	    			return;
			}
	    	}
	    }
		
		// if column is full
		System.out.println("You can't place a piece in that column..");
		move(currentBoard);
	}

}
