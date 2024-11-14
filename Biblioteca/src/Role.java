public class Role extends BoardGame{

    public Role(String id, String name, String difficulty, double price, int quantity) {
        super(id, name, difficulty, price, quantity);
    }

    @Override
    public String getCategory() {
        return "Role";
    }
}
