package oops.nestedClasses;
public class University {
    static class Admission {
        // The sole purpose is to not create an object & no unnecessary heap memory
        // Direct Access
        static boolean isEligible(int marks){
            return marks >= 60;
        }
    }
    public static void main(String[] args) {
        boolean result1 = University.Admission.isEligible(68);
        System.out.println(result1);
        boolean result2 = University.Admission.isEligible(35);
        System.out.println(result2);
    }
}


/*
 * ℹ Points to remember
 * ⭐ No university object is needed - No heap memory utilized
 * ⭐ Logical grouping of data - Improves the readability of the code
 * ⭐ Similar to creating utility-helper classes ️️
 */

