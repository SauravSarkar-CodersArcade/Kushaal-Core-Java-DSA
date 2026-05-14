package basics.arrays;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(arr1[4]);
        System.out.println(Arrays.toString(arr1));
        arr1[1] = 39;
        System.out.println(arr1[1]);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for (int i=0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int x : arr1){
            System.out.print(x + " ");
        }
        System.out.println();
        for (Object x : arr1){
            System.out.print(x + " ");
        }
        System.out.println();
        /*
        Note: ℹ️array.length is a property not a method/function
        But, string.length() is a method
         */
        String name = "Kushaal";
        System.out.println(name.length()); // length() is a method
    }
}
