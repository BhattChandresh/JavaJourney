package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    int x;
    int y;

    Pawn(String piece, String position) {
        super(piece, position);
        x = getX(position);
        y = getY(position);
    }

    @Override
    void getPossibleMoves() {
        List<String> list = new ArrayList<>();
        if (x == ChessBoardSimulation.MAX_BOUND) {
            System.out.println("Can't place pawn from A1 to A8");
            return;
        }
        x = x - 1;
        list.add(Integer.toString(x) + y);
        if (x < ChessBoardSimulation.MIN_BOUND) {
            System.out.println("Can't move further, reach the end of board");
            return;
        }
        displayPossiblePositions(list);
    }
}


