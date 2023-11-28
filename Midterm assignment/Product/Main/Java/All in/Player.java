package controller;

import java.util.Scanner;

public class Player {
    private int index;
    private String name;
    private int[] numberShip;
    private char[][] board;
    private char[][] oppositeBoard;

    Player(int index, String name, int[] numberShip, char[][] board, char[][] oppositeBoard) {
        this.name = name;
        this.numberShip = numberShip;
        this.board = board;
        this.oppositeBoard = oppositeBoard;
    }
    
    public int getIndex(){
        return this.index;
    }
}
