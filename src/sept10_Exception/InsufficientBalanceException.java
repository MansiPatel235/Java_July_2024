package sept10_Exception;

public class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String message){
        super(message);
    }
}
