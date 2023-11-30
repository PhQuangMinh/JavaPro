package controller;

import java.util.Scanner;

public class MenuGame {

    private void instruction(Scanner scanner) {
        System.out.println("\t\tINSTRUCTION");
        System.out.println(
                "The game board is a square matrix with rows labeled by numbers and columns labeled by letters.");
        System.out.println(
                "Use the keyboard to input the location of the ship and the location where you want to shoot.");
        System.out.println("If you sink all the ships, you will achieve victory.");
        System.out.println("1. Play");
        System.out.println("2. Exit");
        int choice = Choice.enterChoice(2, scanner);
        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            default:
                break;
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tSea Battel");
        System.out.println("1. Play");
        System.out.println("2. Instruction");
        System.out.println("3. Exit");
        int choice = Choice.enterChoice(3, scanner);
        ClearScreen.clrscr();
        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}
