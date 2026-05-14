package basics.arrays;
import java.util.Arrays;
public class Example5 {
    static int[] createArray(){
        return new int[]{1,2,3,4,5};
    }
    public static void main(String[] args) {
        int[] ans = createArray();
        System.out.println(Arrays.toString(ans));
        int[] a = new int[ans.length]; // 5
        // Copy array from one to the other using loop
        for (int i=0; i<ans.length; i++){
            a[i] = ans[i]; // a[0] = ans[0] and so on
        }
        System.out.println(Arrays.toString(a));
        // arraycopy(src, s_pos, des, dest_pos, len)
        int[] b = new int[a.length]; // b len = 5 0 0 0 0 0
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
        int[] c = b.clone();
        System.out.println(Arrays.toString(c));
    }
}
