package com.practice.java.CodingInterview.Technogise;

public class Queen extends Piece {
    int x;
    int y;
    Rook rook;
    Bishop bishop;

    Queen(String position) {
        rook = new Rook(position);
        bishop = new Bishop(position);
        x = getX(position);
        y = getY(position);
    }

    @Override
    void getPossibleMoves() {
        rook.getPossibleMoves();
        bishop.getPossibleMoves();
    }
}