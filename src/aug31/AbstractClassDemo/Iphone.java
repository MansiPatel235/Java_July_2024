package aug31.AbstractClassDemo;

public class Iphone extends Mobile {
    public Iphone(int capacity, String brand, double price) {
        super(capacity, brand, price);
    }

    @Override
    public void call() {
        System.out.println("Calling using Hey Siri in iphone... ");
    }

    @Override
    public void wireless() {
        System.out.println("Make calls wirlesslessy ");
    }

    @Override
    public void messages() {
        System.out.println("You can send me i message...");
    }


    public void makeVideoCalls(){
        System.out.println();
    }
}
