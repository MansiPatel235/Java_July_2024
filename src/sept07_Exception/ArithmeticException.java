package sept07_Exception;

public class ArithmeticException extends Throwable {
    public static int division(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) throws ArithmeticException {
        division(4,2);
        System.out.println("Calculation not done");

    }
}
