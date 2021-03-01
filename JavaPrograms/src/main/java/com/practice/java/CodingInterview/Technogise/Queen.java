package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    int x;
    int y;
    List<String> list = new ArrayList<String>();
    Rook rook = null;
    Bishop bishop = null;

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


//public class Queen extends PiecePositions {
//    public void getAllPossibleCellNumbers(int row, int column) {
////        String position = Integer.toString(row) + Integer.toString(column);
////        List<String> newPositions = new ArrayList<String>();
////        int x = row;
////        int y = column;
////        getRookPositions(x,y,newPositions,position);
////        getDiagonalTopRightPositions(x,y,newPositions);
////        getDiagonalBottomLeftPositions(x,y,newPositions);
////        getDiagonalBottomRightPositions(x,y,newPositions);
////        getDiagonalTopLeftPositions(x,y,newPositions);
////        displayAllPositions(newPositions);
//    }
//}
