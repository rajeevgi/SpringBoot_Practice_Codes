package ExceptionHandling;

public class AgeExample {
    
    public static void validateAge(int age){
        if ( age < 18){
            throw new InvalidAgeException("Age should be greater than 18.");
        }else{
            System.out.println("Welcome! age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(20);
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
