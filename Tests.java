package com.lyndseyjane.fourinarow;

public class Tests {

	private static Color[] tie = new Color[] {
			Color.RED, Color.RED, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.RED,
			Color.BLUE, Color.BLUE, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.BLUE,
			Color.RED, Color.RED, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.RED,
			Color.BLUE, Color.BLUE, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.BLUE,
			Color.RED, Color.RED, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.RED,
			Color.BLUE, Color.BLUE, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.BLUE			
	};
	
	private static Color[] easyBlueWin = new Color[] {
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.BLUE, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.BLUE, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.RED, Color.BLUE, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.EMPTY
	};
	
	private static Color[] easyRedWin = new Color[] {
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.RED, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.RED, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.BLUE, Color.RED, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.EMPTY
	};
	
	public static void test(GameBoard board, Color[] boardArrangement) {
		board.clear();
		board.draw();
		for (int r = 0; r < 6; ++r) {
			for (int c = 0; c < 7; ++c) {
				board.setColor(r, c, boardArrangement[(r*7)+c]);
			}
		}
		System.out.println("The winner is "+board.hasWon());
	}
	
	public static void runAllTests(GameBoard board) {
		test(board, easyRedWin);
		test(board, easyBlueWin);
		test(board, tie);
	}
}
