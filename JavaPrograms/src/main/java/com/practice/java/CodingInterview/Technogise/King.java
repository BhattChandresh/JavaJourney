package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
     int x;
     int y;
     List<String> list = new ArrayList<String>();
    King(String piece, String position) {
        super(piece,position);
        x = getX(position);
        y = getY(position);
    }

    @Override
    void getPossibleMoves() {
        int newX = 0;
        int newY = 0;
        int[] allMoves = {x-1,y-1,x-1,y,x-1,y+1,x,y-1,x+1,y+1,x+1,y-1,x+1,y,x+1,y+1};
        for(int index=0; index < allMoves.length;index = index + 2) {
            newX = allMoves[index];
            newY = allMoves[index + 1];
            if(!(newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND || newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND)) {
                list.add(Integer.toString(newX) + Integer.toString(newY));
            }
        }
       displayPossiblePositions(list);
    }
}


//public class King extends PiecePositions {
//    public void getAllPossibleCellNumbers(int row, int column) {
//        int x = row;
//        int y = column;
//        List<String> newPositions = new ArrayList<String>();
//        getKingPositions(x,y,newPositions);
//        displayAllPositions(newPositions);
//    }
//}
