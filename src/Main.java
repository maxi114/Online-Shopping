
import models.Customer;
import models.Product;
import orders.Order;

public class Main {
    public static void main(String[] args) {
        Product bike = new Product("Bicycle", 101, 50, 0);
        Customer john = new Customer("John", 28, 5001, "123 Elm Street");
        Order order1 = new Order(bike, john, 3);

        System.out.println(order1);
    }
}

