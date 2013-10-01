package com.lyndseyjane.fourinarow;

public class ComputerPlayer implements Player {

	@Override
	public void move(GameBoard currentBoard) {
		int columnSelection = 1;
		if ((columnSelection > -1) && (columnSelection < 8)) {
	    	for (int i = 5; i >= 0; --i) {
	    		if ((currentBoard.getColor(i,columnSelection-1))==Color.EMPTY) {
	    			currentBoard.setColor(i,(columnSelection-1),Color.BLUE);
	    			System.out.println("Computer placed a piece in " + (i + 1) + ", " + columnSelection + ".");
	    			return;
			}
	    	}
	    }

	}

}
