package models;

public class Customer {

    //customer information
    private String firstName;
    private int age;
    private long id;
    private String Address;
    private int orderNumber;

    //constructor
    public Customer(String firstName, int age, long id, String Address, int orderNumber){

        this.firstName = firstName;
        this.age = age;
        this.id = id;
        this.Address = Address;
        this.orderNumber = orderNumber;
    }

    //get first name
    public String getName() {return firstName;}

    //get id
    public long geItd() {return id;}

    //get age
    public int getAge() {return age;}

    //get Address
    public String getAddress() {return Address;}


}
