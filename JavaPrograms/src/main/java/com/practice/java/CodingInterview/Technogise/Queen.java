package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Queen extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        String position = Integer.toString(row) + Integer.toString(column);
        List<String> newPositions = new ArrayList<String>();
        int x = row;
        int y = column;
        getRookPositions(x,y,newPositions,position);
        getDiagonalTopRightPositions(x,y,newPositions);
        getDiagonalBottomLeftPositions(x,y,newPositions);
        getDiagonalBottomRightPositions(x,y,newPositions);
        getDiagonalTopLeftPositions(x,y,newPositions);
        displayAllPositions(newPositions);
    }
}
