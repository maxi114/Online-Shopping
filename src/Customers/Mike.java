package Customers;

import Products.Bicycle;
import models.Customer;

public class Mike extends Customer {
    public Mike(){
        super("Mike", 20, 1234, "124 park drive nashville NC");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + super.getName() + '\'' +
                ", Id=" + super.getId() +
                ", Age=" + super.getAge() +
                ", Address=" + super.getAddress() +
                '}';
    }

    public static void main(String[] args) {
        Mike mike = new Mike();
        System.out.println(mike      );
    }
}
