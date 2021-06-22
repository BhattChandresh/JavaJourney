package com.practice.java.CodingInterview.Technogise;

import java.util.List;

public abstract class Piece {

    int getX(String currentPosition) {
        return (Integer.valueOf(currentPosition.substring(0, 1)));
    }

    int getY(String currentPosition) {
        return (Integer.valueOf(currentPosition.substring(1)));
    }

    abstract void getPossibleMoves();

    void displayPossiblePositions(List list) {
        System.out.println("All possible positions (cell numbers) are : ");
        for (Object o : list) {
            System.out.print(ChessBoard.CoordinateToCellPosition.get(o) + " ");
        }
    }
}
