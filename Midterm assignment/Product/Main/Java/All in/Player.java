import java.util.Scanner;

public class Player {
    private int index;
    private String name;
    private int[] numberShip;
    private char[][] board;
    private char[][] oppositeBoard;
    private boolean completed;

    Player(int index, String name, int[] numberShip, char[][] board, char[][] oppositeBoard, Boolean completed) {
        this.name = name;
        this.numberShip = numberShip;
        this.board = board;
        this.oppositeBoard = oppositeBoard;
        this.completed = completed;
    }

    Player() {
    }

    public int getIndex() {
        return this.index;
    }

    public char[][] getBoard() {
        return board;
    }

    public char[][] getOppositeBoard() {
        return oppositeBoard;
    }

    public void setBoard(char[][] Board) {
        this.board = board;
    }

    public void setOppositeBoard(char[][] oppositeBoard) {
        this.oppositeBoard = oppositeBoard;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
