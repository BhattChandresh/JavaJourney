package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        List<String> newPositions = new ArrayList<String>();
        int x = row;
        int y = column;
        getDiagonalTopRightPositions(x,y,newPositions);
        getDiagonalBottomLeftPositions(x,y,newPositions);
        getDiagonalBottomRightPositions(x,y,newPositions);
        getDiagonalTopLeftPositions(x,y,newPositions);
        displayAllPositions(newPositions);
    }
}
