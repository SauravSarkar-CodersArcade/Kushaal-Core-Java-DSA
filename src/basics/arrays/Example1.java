package basics.arrays;
public class Example1 {
    public static void main(String[] args) {
        // Declaring arrays
        // Type 1
        int[] arr1; // Declaration
        arr1 = new int[5]; // Memory Allocation [20 bytes allocated]
        // If we don;t declare any values, the JVM uses
        // "Fallback Mechanism"
        // It uses the default values of the data type
        System.out.println(arr1[1]);
        // Type 2
        int[] arr2 = new int[5]; // Declaration + Allocation
        // Type 3
        int[] arr3 = {10,-1,0,3,6}; // Predefined by user
        // Type 4
        int[] arr4 = new int[]{10,20,30,40,50};

    }

}
