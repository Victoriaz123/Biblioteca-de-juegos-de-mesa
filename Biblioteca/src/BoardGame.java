public abstract class BoardGame {

    private String id;
    private String name;
    private String difficulty;
    private double price;
    private int quantity;
    private String category;

    public BoardGame(String id, String name, String difficulty, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceWithVAT() {
        return (this.price *this.quantity)* 1.10 ;
    }

    public abstract String getCategory();
}
