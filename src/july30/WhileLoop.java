package july30;

public class WhileLoop {
    public static void main(String[] args) {
        int x=0;
        int sum=0;
        while (x<=10)
        {
            System.out.println(x);
            x++;
            sum=sum+x;
            System.out.println("when x = "+x+ "Sum = "+sum);
        }
        System.out.println("final sum = "+sum);
    }
}
