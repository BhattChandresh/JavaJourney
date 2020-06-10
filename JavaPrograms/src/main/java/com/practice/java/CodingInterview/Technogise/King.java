package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class King extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        int x = row;
        int y = column;
        List<String> newPositions = new ArrayList<String>();
        getKingPositions(x,y,newPositions);
        displayAllPositions(newPositions);
    }
}
