package dsa.algos.sorting;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6};
        int[] merged = mergeTwoSortedArrays(a1, a2);
        System.out.println("Merged Array: " +
                Arrays.toString(merged));
    }
    public static int[] mergeTwoSortedArrays(int[] a1, int[] a2){
        int n1 = a1.length;
        int n2 = a2.length;
        int[] merged = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2){
            if(a1[i] < a2[j]){
                merged[k++] = a1[i++];
            }else {
                merged[k++] = a2[j++];
            }
        }
        // If there are any extra elements left in any of the arrays
        // We need to copy-paste into the resultant array
        // Copy remaining elements if any in first array to result
        while (i < n1){
            merged[k++] = a1[i++];
        }
        // Copy remaining elements if any in first array to result
        while (j < n2){
            merged[k++] = a2[j++];
        }
        return merged;
    }
}
