package basics.arrays;
import java.util.Arrays;
// Var-args => Variable Arguments ... {It internally uses an array}
public class Example6 {
    static void display(int... arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,100,99};
        display(arr);
    }
}
