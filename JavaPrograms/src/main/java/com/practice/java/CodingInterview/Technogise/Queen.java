package com.practice.java.CodingInterview.Technogise;

public class Queen extends Piece {
    int x;
    int y;
    Rook rook;
    Bishop bishop;

    Queen(String piece, String position) {
        super(piece, position);
        rook = new Rook(piece, position);
        bishop = new Bishop(piece, position);
        x = getX(position);
        y = getY(position);
    }

    @Override
    void getPossibleMoves() {
        rook.getPossibleMoves();
        bishop.getPossibleMoves();
    }
}