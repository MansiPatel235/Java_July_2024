package aug10;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Enter the number of Students: ");
        Scanner scanner=new Scanner(System.in);
        int student= scanner.nextInt();

        int[] studentArray=new int [student];

        System.out.println("Enter Student's roll number: ");
        for (int i=0;i<student;i++)
        {
            studentArray[i]= scanner.nextInt();
        }
        System.out.println("Student's roll number are listed below:");
        for (int i=0;i<student;i++){
            System.out.println(studentArray[i]);
        }

    }
}
