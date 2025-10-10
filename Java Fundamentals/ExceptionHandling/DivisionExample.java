package ExceptionHandling;

public class DivisionExample {

    public static int divide(int a, int b) throws DivisionByZeroException{
        if(b == 0){
            throw new DivisionByZeroException("Cannot divide by zero");
        }

        return a/b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide(10, 2));
            System.out.println("Result: " + divide(10, 0));
        } catch (DivisionByZeroException e) {
            System.out.println("Exception : " + e.getMessage());
        }   
    }    
}
