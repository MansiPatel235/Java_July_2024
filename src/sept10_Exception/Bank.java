package sept10_Exception;

public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    // withdraw
    public double withdraw(double withdraw){
        if(balance < withdraw) {
            // creating my own exception...
            // throw your own exception ....
            // divide by zero
            // Customized exceptoin
            throw new InsufficientBalanceException("You can not withdraw more money than you have..");
        }
        balance = balance - withdraw;

        return balance;
    }

    // deposit
    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }

    // Balance
    public double getBalance() {
        return balance;
    }
}
