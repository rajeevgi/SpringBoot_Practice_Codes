package ExceptionHandling;

// Custom Checked Exception    
class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String message){
         super(message); 
    }
}
