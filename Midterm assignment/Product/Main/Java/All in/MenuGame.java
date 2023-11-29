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

    public void menu(Scanner scanner, Player player, Player oppositePlayer) {
        System.out.println("\tSea Battel");
        System.out.println("1. Play");
        System.out.println("2. Instruction");
        System.out.println("3. Exit");
        int choice = Choice.enterChoice(3, scanner);
        ClearScreen.clrscr();
        switch (choice) {
            case 1:
                menuInformationPlayer(scanner, player, oppositePlayer);
                break;
            case 2:
                instruction(scanner);
                break;
            case 3:

                break;
        }
    }

    public void enterInformation(Scanner scanner, int index, Player player, Player oppositePlayer) {
        String namePlayer = scanner.nextLine();
        char[][] boardTemple = new char[15][15];
        for (int i = 0; i < 11; i++)
            for (int j = 0; j < 11; j++)
                boardTemple[i][j] = ' ';
        int[] numberShip = { 0, 2, 1, 1, 1 };
        player = new Player(index, namePlayer, numberShip, boardTemple, boardTemple, false);
        GameShip gameShip = new GameShip();
        gameShip.enterTypeShip(scanner, player, oppositePlayer);
    }

    public void menuInformationPlayer(Scanner scanner, Player player, Player oppositePlayer) {
        do {
            System.out.println("\tENTER INFORMATION OF THE PLAYER");
            System.out.println("1. Player 1");
            System.out.println("2. Player 2");
            System.out.println("3. Play");
            System.out.println("4. Exit");
            int choice = Choice.enterChoice(3, scanner);
            switch (choice) {
                case 1:
                    enterInformation(scanner, 1, player, oppositePlayer);
                    break;
                case 2:
                    enterInformation(scanner, 2, oppositePlayer, player);
                    break;
                case 3:
                    if (!player.getCompleted()) {
                        System.out.println("You haven't finished entering player 1.");
                    }
                    if (!oppositePlayer.getCompleted()) {
                        System.out.println("You haven't finished entering player 2.");
                    }
                    if (player.getCompleted() && oppositePlayer.getCompleted()) {
                        
                    }
                    break;
                case 4:
                    menu(scanner, player, oppositePlayer);
                    return;
            }
        } while (true);
    }
}
