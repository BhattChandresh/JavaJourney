package com.practice.java.interview.deserve;

import com.practice.java.interview.deserve.gameservice.SnakeAndLadderService;

import java.util.Scanner;

public class SnakeAndLadderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Player Name : ");
        String playerName = sc.nextLine();
        sc.close();
        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.startGame(10, playerName);
    }
}
