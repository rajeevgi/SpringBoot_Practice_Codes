package ExceptionHandling;

// Custom Unchecked Exception
public class InvalidAgeException extends RuntimeException {
    
    public InvalidAgeException(String message){
        super(message);
    }
}
