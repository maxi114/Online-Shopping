package Products;

import models.Product;

public class Desk extends Product {

    public Desk(){
        super("Desk", 102, 40,0);
    }

    @Override
    public String toString() {
        return "Desk{" +
                "Name='" + super.getName() + '\'' +
                ", Id=" + super.getId() +
                ", Inventory=" + super.getInventory() +
                ", Sold=" + super.getSold() +
                ", ProductsLeft=" + super.getProductsLeft() +
                '}';
    }

    public static void main(String[] args) {
        Desk desk = new Desk();
        System.out.println(desk);
    }
}
