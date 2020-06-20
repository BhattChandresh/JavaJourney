package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    int x;
    int y;
    List<String> list = new ArrayList<String>();
    Bishop(String piece, String position) {
        super(piece,position);
        x = getX(position);
        y = getY(position);
    }

    @Override
    void getPossibleMoves() {
        int newX = 0;
        int newY = 0;
        int index = 0;

        while(index < 4) {
            if(!(newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND || newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND)) {
                if(index == 0) {
                    newX -= 1;
                    newY += 1;
                    if((newX < ChessBoardSimulation.MIN_BOUND) || (newY > ChessBoardSimulation.MAX_BOUND))
                        index = index + 1;
                    list.add(Integer.toString(newX) + Integer.toString(newY));
                }
                if(index == 1) {
                    newX += 1;
                    newY -=1;
                    if((newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND))
                        index = index + 1;
                    list.add(Integer.toString(newX) + Integer.toString(newY));
                }
                if(index == 2) {
                    newX += 1;
                    newY +=1;
                    if((newX > ChessBoardSimulation.MAX_BOUND) || (newY > ChessBoardSimulation.MAX_BOUND))
                        index = index + 1;
                    list.add(Integer.toString(newX) + Integer.toString(newY));
                }
                if(index == 3){
                    newX -= 1;
                    newY -=1;
                    if((newX < ChessBoardSimulation.MIN_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND))
                        break;
                    list.add(Integer.toString(newX) + Integer.toString(newY));
                }
            }
        }
    }
}

//public class Bishop extends PiecePositions {
//    public void getAllPossibleCellNumbers(int row, int column) {
//        List<String> newPositions = new ArrayList<String>();
//        int x = row;
//        int y = column;
//        getDiagonalTopRightPositions(x,y,newPositions);
//        getDiagonalBottomLeftPositions(x,y,newPositions);
//        getDiagonalBottomRightPositions(x,y,newPositions);
//        getDiagonalTopLeftPositions(x,y,newPositions);
//        displayAllPositions(newPositions);
//    }
//}
