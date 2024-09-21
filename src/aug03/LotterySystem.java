package aug03;


import java.util.Scanner;
public class LotterySystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your lucky number : ");
        int luckyNumber=scanner.nextInt();
        int jackpotNumber=8;

        for (int i=0;i<=luckyNumber;i++)
        {
            if(jackpotNumber==luckyNumber)
            {
                System.out.println("You are winner");
                break;
            }
            else {

                System.out.println("You are not winner");
            }
        }
    }
}
