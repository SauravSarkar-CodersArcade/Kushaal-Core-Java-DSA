package dsa.algos.sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void selection_sort(int[] arr){
        for (int i=0; i< arr.length-1; i++){ // 1 to n-1 // 0 to < n-1
            int minIndex = i;
            for (int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Only swap if the min index has changed from i to j
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,-1,0,2,5};
        System.out.println(Arrays.toString(arr));
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
