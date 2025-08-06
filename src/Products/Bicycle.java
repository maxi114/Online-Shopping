package Products;

import models.Product;

public class Bicycle extends Product {
    public Bicycle() {
        super("Bicycle", 101, 50, 0);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "Name='" + super.getName() + '\'' +
                ", Id=" + super.getId() +
                ", Inventory=" + super.getInventory() +
                ", Sold=" + super.getSold() +
                ", ProductsLeft=" + super.getProductsLeft() +
                '}';
    }

    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        System.out.println(bike);
    }
}
