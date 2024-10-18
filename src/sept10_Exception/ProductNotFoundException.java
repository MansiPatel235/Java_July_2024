package sept10_Exception;

public class ProductNotFoundException extends RuntimeException{
    ProductNotFoundException(String message){
        super(message);
    }
}
