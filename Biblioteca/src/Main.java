public class Main {
    public static void main(String[] args) {
        Inventory<BoardGame> inventory = new Inventory<>();

        BoardGame chess = new Strategy("1", "Chess", "Hard", 15, 15);
        BoardGame monopoly = new Chance("2", "Monopoly", "Easy", 20, 20);
        BoardGame checkers = new Strategy("3", "Checkers", "Medium", 10, 15);
        BoardGame witcher = new Strategy("4", "Witcher", "Medium", 20, 15);

        inventory.addGame(chess);
        inventory.addGame(monopoly);
        inventory.addGame(checkers);
        inventory.addGame(witcher);

        inventory.displayGames();

        try {
            inventory.updateQuantity("1", 20);
            System.out.println("Updated quantity for game " + chess.getName());
        } catch (GameNotFoundException e) {
            System.out.println("Error updating quantity: " + e.getMessage());
        }

        inventory.deleteGame("monopoly");

        inventory.displayGames();
    }
}

