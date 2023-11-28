package controller;

import java.util.Arrays;
import java.util.Scanner;

public class GameController {
    public Player enterName(Scanner scanner, int index) {
        String namePlayer = scanner.nextLine();
        char[][] boardTemple = new char[15][15];
        for (int i = 0; i < 11; i++)
            for (int j = 0; j < 11; j++)
                boardTemple[i][j] = ' ';
        int[] numberShip = {0, 2, 1, 1, 1};
        Player player = new Player(index, namePlayer, numberShip, boardTemple, boardTemple);
        return player;
    }

    public void enterNamePlayer(Scanner scanner){
        System.out.println("\tENTER NAME PLAYER");
        System.out.println("Enter Name Player 1: ");
        Player player1 = enterName(scanner, 1);
        System.out.println("Enter Name Player 2: ");
        Player player2 = enterName(scanner, 2);
    }
}
