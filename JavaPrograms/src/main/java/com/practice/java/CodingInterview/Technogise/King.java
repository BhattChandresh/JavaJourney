package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    int x;
    int y;

    King(String position) {
        x = getX(position);
        y = getY(position);
    }

    @Override
    void getPossibleMoves() {
        int newX;
        int newY;
        List<String> list = new ArrayList<>();

        int[] allMoves = {x, y - 1, x, y + 1, x - 1, y, x + 1, y, x - 1, y - 1, x + 1, y + 1, x - 1, y + 1, x + 1, y - 1};
        for (int index = 0; index < allMoves.length; index = index + 2) {
            newX = allMoves[index];
            newY = allMoves[index + 1];
            if (!((newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND))) {
                list.add(Integer.toString(newX) + newY);
            }
        }
        displayPossiblePositions(list);
    }
}



