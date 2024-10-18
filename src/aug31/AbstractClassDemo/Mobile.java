package aug31.AbstractClassDemo;

public abstract class Mobile {
    // you can create object of this class


    // abstract methods can not have body

    int capacity;
    String brand;
    double price;

    public Mobile(int capacity, String brand, double price) {
        this.capacity = capacity;
        this.brand = brand;
        this.price = price;
    }

    public abstract void call();
    public abstract void wireless();
    public abstract void messages();




    public void ring(){
        System.out.println("Mobile phone can ring.... ");
    }


}
