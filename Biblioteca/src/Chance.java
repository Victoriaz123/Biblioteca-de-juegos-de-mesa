public class Chance extends BoardGame {

    public Chance(String id, String name, String difficulty, double price, int quantity) {
        super(id, name, difficulty, price, quantity);
    }

    @Override
    public String getCategory() {
        return "Chance";
    }
}
