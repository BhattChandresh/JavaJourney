package com.practice.java.CodingInterview.Technogise;

import java.util.List;

public abstract   class Piece  {
    private String piece;
    private String currentPosition;
    private int row;
    private int column;

    Piece() {

    }

    Piece(String piece, String position) {
        this.piece = piece;
        this.currentPosition = position;
        row = 0;
        column = 0;
    }

    int getX(String currentPosition) {
        return (Integer.valueOf(currentPosition.substring(0,1)));
    }

    int getY(String currentPosition) {
        return (Integer.valueOf(currentPosition.substring(1)));
    }

    abstract void getPossibleMoves();

    void displayPossiblePositions(List list) {
        System.out.println("All possible positions (cell numbers) are : ");
        for (int index = 0; index < list.size(); index++) {
            System.out.print(ChessBoard.CoordinateToCellPosition.get(list.get(index)) + " ");
        }
    }
}
