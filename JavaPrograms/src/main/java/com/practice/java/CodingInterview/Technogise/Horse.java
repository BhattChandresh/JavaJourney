package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Piece {
    int x;
    int y;
    List<String> list = new ArrayList<String>();
    Horse(String piece, String position) {
        super(piece,position);
        x = getX(position);
        y = getY(position);
     }

    @Override
    void getPossibleMoves() {
        int newX = 0;
        int newY = 0;
        String element = "";
        int[] allMoves = {x-2,y-1,x-2,y+1,x+2,y-1,x+2,y+1};
        for(int index=0; index < allMoves.length;index = index+2) {
            newX = allMoves[index];
            newY = allMoves[index + 1];
            if(!((newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND))) {
                element = Integer.toString(newX) + Integer.toString(newY);
                list.add(element);
            }
        }
        displayPossiblePositions(list);
    }
}



