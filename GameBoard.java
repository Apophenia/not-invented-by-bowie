package com.lyndseyjane.fourinarow;

public class GameBoard {
	
	Color[][] board = new Color[6][7]; 
	
	// clears board
	public void clear() {
		for (int r = 0; r<6; ++r) {
			for (int c = 0; c<7; ++c) {
				board[r][c] = Color.EMPTY;
			}
		}
	}
	
	// checks vertical win cases for a given color
	public boolean hasVerticalWin(Color checkColor) {
		for (int c = 0; c < 7; ++c) {
			for (int r = 0; r < 3; ++r) {
				if ((board[r][c] == checkColor) &&
					(board[r][c] == board[r+1][c]) &&
				    (board[r][c] == board[r+2][c]) &&
				    (board[r][c] == board[r+3][c])) {
				    System.out.println(checkColor + " player wins!");
				    draw();
				    return true;
				}
			}
		}
		return false;
	}
	
	// checks horizontal win cases for a given color
	public boolean hasHorizontalWin(Color checkColor) {
		for (int r = 0; r < 6; ++r) {
			for (int c = 0; c < 4; ++c) {
				if ((board[r][c] == checkColor) &&
					(board[r][c] == board[r][c+1]) &&
				    (board[r][c] == board[r][c+2]) &&
				    (board[r][c] == board[r][c+3])) {
				    System.out.println(checkColor + " player wins!");
				    draw();
				    return true;
				}
			}
		}
		return false;
	}
	
	// checks diagonal win cases for a given color
	public boolean hasDiagonalWin(Color checkColor) {
		for (int r = 0; r < 3; ++r) {
			for (int c = 0; c < 5; ++c) {
				if ((board[r][c] == checkColor) &&
					(board[r][c] == board[r+1][c+1]) &&
				    (board[r][c] == board[r+2][c+2]) &&
				    (board[r][c] == board[r+3][c+3])) {
				    System.out.println(checkColor + " player wins!");
				    draw();
				    return true;
				}
			}
		}
		for (int r = 5; r > 2; --r) {
			for (int c = 0; c < 4; ++c) {
				if ((board[r][c] == checkColor) &&
					(board[r][c] == board[r-1][c+1]) &&
				    (board[r][c] == board[r-2][c+2]) &&
				    (board[r][c] == board[r-3][c+3])) {
				    System.out.println(checkColor + " player wins!");
				    draw();
				    return true;
				}
			}
			
		}
		return false;
	}
	
	// checks whether a given color has four tokens in a row, winning the game
	public Color hasWon() {
		// TODO: Checking only wins that could have occurred from placement of last token might be more efficient.
		if (hasVerticalWin(Color.BLUE)) return Color.BLUE;
		if (hasVerticalWin(Color.RED)) return Color.RED;
		if (hasHorizontalWin(Color.BLUE)) return Color.BLUE;
		if (hasHorizontalWin(Color.RED)) return Color.RED;
		if (hasDiagonalWin(Color.RED)) return Color.RED;
		if (hasDiagonalWin(Color.RED)) return Color.RED;
		
		return Color.EMPTY;
	}
	
	// returns true if the board is full of non-empty spaces
	public boolean isFull() {
		for (int c = 0; c < 7; ++c) {
			if (board[0][c] == Color.EMPTY) {
			    return false;
			}
		}
		// This would print "it's a draw" even if a player wins by placing the last token (is this possible?)
		System.out.println("It's a draw.");
		return true;	
	}
	
	// draws the board using printed lines
	public void draw() {
		// TODO: Make scalable for future versions with larger board?
		System.out.println(" _ _ _ _ _ _ _");
		for (int row = 0; row<6; row++) {
			for (int column = 0; column<7; column++) {
				System.out.print("|");
			//	System.out.print(board[0][0]);
				switch(board[row][column]) {
					case RED: System.out.print("x");
						break;
					case BLUE: System.out.print("o");
						break;
					case EMPTY: System.out.print(" ");
				}
			}
		System.out.print("| \r");
		}
		// TODO: If making scalable, this would need to stretch as well.
		System.out.println(" — — — — — — —");
		System.out.println(" 1 2 3 4 5 6 7");
	}
	
	
	// sets a space on the board (integer, integer) to the given color
	public void setColor(int r, int c, Color playerColor) {
		board[r][c] = playerColor;
	}
	
	// returns the color of a space (integer, integer) on the board
	public Color getColor(int r, int c) {
		return board[r][c];
	}
}
