package exceptions;
public class TheThrowKeyword {
    static void checkAge(int age){
        if (age >= 18){
            System.out.println("Access Granted - Eligible to enter!");
        }else {
            // Custom Exceptions - User Defined Exceptions
            // System.out.println("Access Denied - Not eligible to enter!");
            throw new RuntimeException("Access Denied - Not eligible to enter!");
        }
    }
    public static void main(String[] args) {
        checkAge(4);
        
    }
}
