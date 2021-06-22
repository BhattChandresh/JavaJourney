package com.practice.java.CodingInterview.Technogise;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    int x;
    int y;
    List<String> list = new ArrayList<>();

    Bishop(String piece, String position) {
        super(piece, position);
        x = getX(position);
        y = getY(position);
    }

    @Override
    void getPossibleMoves() {
        getDiagonalTopRightPositions(x, y);
        getDiagonalBottomLeftPositions(x, y);
        getDiagonalBottomRightPositions(x, y);
        getDiagonalTopLeftPositions(x, y);
        displayPossiblePositions(list);
    }

    public void getDiagonalTopRightPositions(int x, int y) {
        int newX, newY;
        newX = x;
        newY = y;
        while (true) {
            if (!((newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND))) {
                newX -= 1;
                newY += 1;
                if ((newX < ChessBoardSimulation.MIN_BOUND) || (newY > ChessBoardSimulation.MAX_BOUND))
                    break;
                list.add(Integer.toString(newX) + newY);
            }
        }
    }

    public void getDiagonalBottomLeftPositions(int x, int y) {
        int newX, newY;
        newX = x;
        newY = y;
        while (true) {
            if (!((newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND))) {
                newX += 1;
                newY -= 1;
                if ((newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND))
                    break;
                list.add(Integer.toString(newX) + newY);
            }
        }
    }

    public void getDiagonalBottomRightPositions(int x, int y) {
        int newX, newY;
        newX = x;
        newY = y;
        while (true) {
            if (!((newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND))) {
                newX += 1;
                newY += 1;
                if ((newX > ChessBoardSimulation.MAX_BOUND) || (newY > ChessBoardSimulation.MAX_BOUND))
                    break;
                list.add(Integer.toString(newX) + newY);
            }
        }
    }

    public void getDiagonalTopLeftPositions(int x, int y) {
        int newX, newY;
        newX = x;
        newY = y;
        while (true) {
            if (!((newX < ChessBoardSimulation.MIN_BOUND || newX > ChessBoardSimulation.MAX_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND || newY > ChessBoardSimulation.MAX_BOUND))) {
                newX -= 1;
                newY -= 1;
                if ((newX < ChessBoardSimulation.MIN_BOUND) || (newY < ChessBoardSimulation.MIN_BOUND))
                    break;
                list.add(Integer.toString(newX) + newY);
            }
        }
    }
}
