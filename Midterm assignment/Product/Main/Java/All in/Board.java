public class Board {
    public void displayBoardShip(char[][] board){
        for (int i=0;i<10;i++){
            System.out.print(i + " |");
            for (int j=0;j<10;j++)
                System.out.print(" " + board[i][j] + " |");
            System.out.println();
        }
    }

    public void updateBoard(Ship ship, Player player){
        char[][] board = player.getBoard();
        if (ship.getColumnStart()==ship.getColumnEnd()){
            int begin = Math.min(ship.getRowEnd(), ship.getRowStart());
            int end = Math.max(ship.getRowEnd(), ship.getRowStart());
            for (int i=begin;i<=end;i++)
                board[i][ship.getColumnStart()] = '*';
        }
        else{
            int begin = Math.min(ship.getColumnEnd(), ship.getColumnStart());
            int end = Math.max(ship.getColumnEnd(), ship.getColumnStart());
            for (int i=begin;i<=end;i++)
                board[ship.getRowStart()][i] = '*';
        }
        player.setBoard(board);
    }
}
