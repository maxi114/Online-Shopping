package models;

public class Product {

    private String name;
    private int id;
    private int inventory;
    private int sold;

    // constructor (removed productsLeft)
    public Product(String name, int id, int inventory, int sold) {
        this.name = name;
        this.id = id;
        this.inventory = inventory;
        this.sold = sold;
    }

    public String getName() { return name; }

    public int getId() { return id; }

    public int getInventory() { return inventory; }

    public int getSold() { return sold; }

    public int getProductsLeft() {
        return inventory - sold;
    }
}
