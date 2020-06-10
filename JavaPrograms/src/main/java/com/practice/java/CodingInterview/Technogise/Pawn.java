package com.practice.java.CodingInterview.Technogise;

public class Pawn extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        int x = row;
        int y = column;
        if(x == 7){
            System.out.println("Can't place pawn from A1 to A8");
            return;
        }
        x = x-1;
        if(x < 0) {
            System.out.println("Can't move further, reach the end of board");
            return;
        }
        displayAllPositions(x,y);
    }
}
