package july30;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {

        char choice = 0;
        do {
            System.out.println("******************************");
            System.out.println("Welcome to My Calculator...");
            System.out.println("******************************");

            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Subtraction");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your input ");
            int userinput = scanner.nextInt();

            System.out.println("Please enter first number:");
            double num1=scanner.nextDouble();
            System.out.println("Please Enter second number:");
            double num2=scanner.nextDouble();
            switch (userinput) {
                case 1:
                    double sum=num1+num2;
                    System.out.println("Addition is :"+sum);
                    break;
                case 2:
                    double mul = num1*num2;
                    System.out.println("Multiplication is : "+mul);
                    break;
                case 3:
                    double sub=num1-num2;
                    System.out.println("Subtraction is :"+sub);
                    break;
                case 4:
                    double div=num1/num2;
                    System.out.println("Division is :"+div);
                    break;
                case 5:
                    double mod=num1%num2;
                    System.out.println("Modulas is : "+mod);
                    break;
                default:
                    System.out.println("Wrong input ");
            }

            System.out.println("Do you still want to continue ?? Y for yes , N for no");

            choice = scanner.next().charAt(0);
            System.out.println(choice);
        }while (choice != 'N' &&  choice != 'n' );
    }



}
