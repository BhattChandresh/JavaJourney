package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    int x;
    int y;
    String position;

    Rook(String piece, String position) {
        super(piece, position);
        x = getX(position);
        y = getY(position);
        this.position = position;
    }

    @Override
    void getPossibleMoves() {
        List<String> list = new ArrayList<>();
        int newX;
        int newY;
        int[] allMoves = {x, 0, x, 1, x, 2, x, 3, x, 4, x, 5, x, 6, x, 7, 0, y, 1, y, 2, y, 3, y, 4, y, 5, y, 6, y, 7, y};
        for (int index = 0; index < allMoves.length; index = index + 2) {
            newX = allMoves[index];
            newY = allMoves[index + 1];
            String element = newX + Integer.toString(newY);
            if (element.equals(position))
                continue;
            list.add(element);
        }
        displayPossiblePositions(list);
    }
}




