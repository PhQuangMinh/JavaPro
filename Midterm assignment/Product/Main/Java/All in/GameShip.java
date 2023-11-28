package model;

import java.util.Scanner;

import controller.Choice;
import controller.Player;
import controller.Ship;

public class GameShip {
    public void menuShip(Scanner scanner, Player player) {
        int count[] = { 0, 2, 1, 1, 1 };
        do {
            System.out.println("Enter the location of the ship for player " + player.getIndex());
            System.out.println("1. Enter location Patrol Boat");
            System.out.println("2. Enter location Destroyer Boat");
            System.out.println("3. Enter location Submarine");
            System.out.println("4. Enter location Battle Ship");
            System.out.println("5. Exit");
            int choice = Choice.enterChoice(4, scanner);
            switch (choice) {
                case 1:
                    System.out.println("1. Enter location Patrol Boat");

                    break;

                default:
                    break;
            }

        } while (true);
    }

    private int lengthShip(int index) {
        switch (index) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 3;
        }
        return 5;
    }

    public void enterLocationShip(Scanner scanner, int index) {
        System.out.println("Enter starting location:");
        System.out.print("Enter row: ");
        int rowStart = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter column: ");
        int columnStart = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ending location:");
        System.out.print("Enter row: ");
        int rowEnd = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter column: ");
        int columnEnd = Integer.parseInt(scanner.nextLine());
        int length = lengthShip(index);
        Ship ship = new Ship(rowStart, columnStart, rowEnd, columnEnd, length);
        if (!ship.checkLocation()) {
            System.out.println("Enter inval location Ship");
            return;
        }
        System.out.println("Successfully added ship");
        Board board = new Board();
        board.updateBoard(ship);
    }
}
