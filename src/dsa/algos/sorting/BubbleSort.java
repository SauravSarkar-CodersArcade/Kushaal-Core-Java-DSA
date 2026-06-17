package dsa.algos.sorting;
import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++){ // No of iterations 1 to n
            for (int j=0; j<n-1; j++){ // Swapping 1 to n
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,4,3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

