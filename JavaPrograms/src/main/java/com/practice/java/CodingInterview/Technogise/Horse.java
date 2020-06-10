package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Horse extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        List<String> newPositions = new ArrayList<String>();
        int x = row;
        int y = column;
        getHorsePositions(x,y, newPositions);
        displayAllPositions(newPositions);
    }
}
