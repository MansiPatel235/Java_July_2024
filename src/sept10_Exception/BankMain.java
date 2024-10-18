package sept10_Exception;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank(1000);
        double balance = bank.getBalance();

        System.out.println("Current Balance "+ balance);

        // got pay  1500

        double balanceAfterDeposit = bank.deposit(1500);
        System.out.println("Balance  after 1500 deposit : " + balanceAfterDeposit);


        try {
            bank.withdraw(30000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        // overdraft
        System.out.println("Total balance : "+bank.getBalance());

    }
}
