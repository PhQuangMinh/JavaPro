package controller;

import java.util.Scanner;

import model.Board;

public class Ship {
    private int rowStart;
    private int columnStart;
    private int rowEnd;
    private int columnEnd;
    private int length;

    public Ship(int rowStart, int columnStart, int rowEnd, int columnEnd, int length) {
        this.rowStart = rowStart;
        this.columnStart = columnStart;
        this.rowEnd = rowEnd;
        this.columnEnd = columnEnd;
        this.length = length;
    }

    public String nameShip(int index) {
        switch (index) {
            case 1:
                return "Patrol Boat";
            case 2:
                return "Destroyer Boat";
            case 3:
                return "Submarine";
        }
        return "Battle Ship";
    }

    private boolean checkscope() {
        if (rowStart < 1 || rowEnd > 10 || columnStart < 1 || columnEnd > 10)
            return false;
        return true;
    }

    private boolean checkValid() {
        if (rowStart != rowEnd && columnStart != columnEnd)
            return false;
        return true;
    }

    private boolean checkLength() {
        if (rowEnd == rowStart && Math.abs(columnEnd - columnStart) != length
                || columnEnd == columnStart && Math.abs(rowEnd - rowStart) != length)
            return false;
        return true;
    }

    public boolean checkLocation() {
        if (!checkscope() || !checkValid() || !checkLength())
            return false;
        return true;
    }

}
