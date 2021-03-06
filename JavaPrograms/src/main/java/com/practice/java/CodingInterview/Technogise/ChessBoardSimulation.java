/*
  Version : 1.0
  Author : Chandresh Bhatt
  Objective :
  You	are	required	to	create	a	program, which	simulates a chessboard and	the
  movements	of various types of pieces on the chessboard.
  Available Pieces :
  <1> King
  <2> Queen
  <3> Rook
  <4> Bishop
  <5> Horse
  <6> Pawn
 */
package com.practice.java.CodingInterview.Technogise;

import com.practice.java.Author;

import java.util.Arrays;

@Author()
public class ChessBoardSimulation {
    // isDebug flag is used for testing purpose, if isDebug = true all the test cases are executed else none are executed.
    static boolean isDebug = false;
    static final int MAX_BOUND = 7;
    static final int MIN_BOUND = 0;

    public static void main(String[] args) {

        System.out.println(" *** Welcome to Chess Board Simulation ***");

        ChessBoard cb = new ChessBoard();
        UserInput uinput = new UserInput();
        Piece p;

        if (isDebug)
            cb.testInitializationOfChessBoard();

        try {
            uinput.getUserInput();
        } catch (Exception e) {
            System.out.println("Program about to terminated. Possible causes are :");
            System.out.println("1. No Space between Piece and Position (Ex. HorseD5)");
            System.out.println("2. Piece may be wrong. Allowed pieces are <1> Pawn <2> Horse <3> Rook <4> Bishop <5> King <6> Queen");
            System.out.println("3. Position may be wrong. First character should be between A to H. Second character should be between 1 to 8");
            System.exit(1);
        }

        try {
            switch (uinput.getPiece()) {
                case "KING":
                    p = new King(uinput.getPosition());
                    p.getPossibleMoves();
                    break;
                case "PAWN":
                    p = new Pawn(uinput.getPosition());
                    p.getPossibleMoves();
                    break;
                case "BISHOP":
                    p = new Bishop(uinput.getPosition());
                    p.getPossibleMoves();
                    break;
                case "HORSE":
                    p = new Horse(uinput.getPosition());
                    p.getPossibleMoves();
                    break;
                case "QUEEN":
                    p = new Queen(uinput.getPosition());
                    p.getPossibleMoves();
                    break;
                case "ROOK":
                    p = new Rook(uinput.getPosition());
                    p.getPossibleMoves();
                    break;
            }
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
