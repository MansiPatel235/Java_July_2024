package aug12;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        //Initialize array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int elements = input.nextInt();

        int [] array = new int[elements];
        for(int i = 0; i<elements; i++){

            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
        }
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
