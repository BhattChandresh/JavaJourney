package com.practice.java.CodingInterview.Technogise;

import java.util.List;

public abstract class Piece {

    int getX(String currentPosition) {
        return (Integer.parseInt(currentPosition.substring(0, 1)));
    }

    int getY(String currentPosition) {
        return (Integer.parseInt(currentPosition.substring(1)));
    }

    abstract void getPossibleMoves();

    void displayPossiblePositions(List<String> list) {
        System.out.println("All possible positions (cell numbers) are : ");
        for (String position : list) {
            System.out.print(ChessBoard.CoordinateToCellPosition.get(position) + " ");
        }
    }
}
