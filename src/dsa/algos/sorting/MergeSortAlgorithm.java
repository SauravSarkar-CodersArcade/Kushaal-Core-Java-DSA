package dsa.algos.sorting;
import java.util.Arrays;
public class MergeSortAlgorithm {
    public static void mergeSort(int[] arr){
        if(arr.length < 2){
            return; // Stop dividing if the length is 1 [Single Elements]
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        // Recursion to do repetitive division
        mergeSort(left); // Break down the left array using recursion
        mergeSort(right); // Break down the left array using recursion
        merge(arr, left, right); // Merge the two sorted arrays into a single array
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i=0, j=0, k=0, n1 = left.length, n2 = right.length;
        while (i < n1 && j < n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        // Copy remaining elements if any in left array to result
        while (i < n1){
            arr[k++] = left[i++];
        }
        // Copy remaining elements if any in right array to result
        while (j < n2){
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,2,-1,0,4,6,1,5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
