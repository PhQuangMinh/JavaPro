import java.util.Scanner;

public class GameShip {

    public void enterTypeShip(Scanner scanner, Player player, Player oppositePlayer) {
        int count[] = { 0, 2, 1, 1, 1 };
        int quantity = 0;
        do {
            System.out.println("Enter the location of the ship for player " + player.getIndex());
            System.out.println("1. Enter location Patrol Boat");
            System.out.println("2. Enter location Destroyer Boat");
            System.out.println("3. Enter location Submarine");
            System.out.println("4. Enter location Battle Ship");
            System.out.println("5. Exit");
            int choice = Choice.enterChoice(5, scanner);
            if (choice == 5){
                if (quantity<5){
                    System.out.println("You have not entered a sufficient quantity of ship.");
                    continue;
                }
                System.out.println("You have entered a sufficient quantity of ship.");
                MenuGame menuGame = new MenuGame();
                menuGame.menuInformationPlayer(scanner, player, oppositePlayer);
            }
            if (count[choice] == 0) {
                System.out.println("You have entered a sufficient quantity of this type of ship.");
                continue;
            }
            Board board = new Board();
            board.displayBoardShip(player.getBoard());
            Ship ship = new Ship();
            String nameShip = ship.nameShip(choice);
            System.out.println(choice + ". Enter location " + nameShip);
            count[choice]--;
            if (enterLocationShip(scanner, choice, player)){
                quantity++;
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

    public boolean enterLocationShip(Scanner scanner, int index, Player player) {
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
            System.out.println("Enter invalid location Ship");
            return false;
        }
        System.out.println("Successfully added ship");
        Board board = new Board();
        board.updateBoard(ship, player);
        return true;
    }
}
