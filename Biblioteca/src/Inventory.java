import java.util.*;
import java.util.stream.Collectors;

public class Inventory <T extends BoardGame> {

    private List<T> games = new ArrayList<>();

    public void addGame(T game) {
        games.add(game);
    }

    public void updateQuantity(String id, int quantity) throws GameNotFoundException {
        T game = games.stream()
                .filter(g -> g.getId().equals(id)).
                findFirst()
                .orElseThrow(() -> new GameNotFoundException("Game with ID " + id + " not found."));
        game.setQuantity(quantity);
    }

    public void displayGames() {
        games.forEach(game -> System.out.println(game.getName() + ": " + game.getPriceWithVAT()));
    }

    public T findGame(String name) throws GameNotFoundException {
        return games.stream()
                .filter(g -> g.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new GameNotFoundException("Game with name " + name + " not found."));
    }

    public void deleteGame(String name) {
        try {
            T game = findGame(name);
            games.remove(game);
            System.out.println("Game with name " + name + " has been deleted.");
        } catch (GameNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}