package ExceptionHandling;

// Custom Exception    
// 1.Extends -> Exception(Checked Exception) 2. Extends -> RuntimeException (Unchecked)
class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String message){
         super(message); 
    }
}
