package model;

public class Board {
    public void displayBoardShip(char[][] board){
        for (int i=0;i<10;i++){
            System.out.print(i + " |");
            for (int j=0;j<10;j++)
                System.out.print(" " + board[i][j] + " |");
            System.out.println();
        }
    }

    public void updateBoard(Ship ship){
        
    }

}
