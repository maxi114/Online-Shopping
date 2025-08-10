package orders;

import models.Customer;
import models.Product;

public class Order {
    private Product product;
    private Customer customer;
    private int quantity;

    public Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public Customer getCustomer() { return customer; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return "orders.Order{" +
                "Customer='" + customer.getName() + '\'' +
                ", CustomerID=" + customer.getId() +
                ", Product='" + product.getName() + '\'' +
                ", ProductID=" + product.getId() +
                ", Quantity=" + quantity +
                '}';
    }
}
