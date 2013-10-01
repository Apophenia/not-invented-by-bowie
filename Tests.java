package com.lyndseyjane.fourinarow;

public class Tests {

	private Color[] tie = new Color[] {
			Color.RED, Color.RED, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.RED,
			Color.BLUE, Color.BLUE, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.BLUE,
			Color.RED, Color.RED, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.RED,
			Color.BLUE, Color.BLUE, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.BLUE,
			Color.RED, Color.RED, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.RED,
			Color.BLUE, Color.BLUE, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.BLUE			
	};
	
	private Color[] easyBlueWin = new Color[] {
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.BLUE, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.BLUE, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.RED, Color.BLUE, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.RED, Color.BLUE, Color.RED, Color.RED, Color.EMPTY
	};
	
	private Color[] easyRedWin = new Color[] {
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.RED, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.EMPTY, Color.RED, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.BLUE, Color.RED, Color.EMPTY, Color.EMPTY, Color.EMPTY,
			Color.EMPTY, Color.EMPTY, Color.BLUE, Color.RED, Color.BLUE, Color.BLUE, Color.EMPTY
	};
	
	public void Test(GameBoard board, Color[] boardArrangement) {
		board.clear();

		board.draw();
	}
	
}
