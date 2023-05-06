public class Snack {
    private String name;
    private int price;
    private int quantity;

    public Snack(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean dispense() {
        if (quantity > 0) {
            quantity--;
            return true;
        }
        return false;
    }
}
