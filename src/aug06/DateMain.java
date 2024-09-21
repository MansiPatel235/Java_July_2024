package aug06;

public class DateMain {
    public static void main(String[] args) {

        DateDemo demo = new DateDemo();
        demo.displayDate();

        DateDemo demo2 = new DateDemo(12, 12, 2024);
        demo2.displayDate();
    }
}
