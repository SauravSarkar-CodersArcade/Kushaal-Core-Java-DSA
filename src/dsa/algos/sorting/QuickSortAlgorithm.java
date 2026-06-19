package dsa.algos.sorting;
import java.util.Arrays;
public class QuickSortAlgorithm { // n log n
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for (int i=s+1; i<=e; i++){
            if(arr[i] < pivot) count++; // Count no of elements less than pivot
        }
        // Place the pivot in its correct position
        int pivotIndex = s + count;
        swap(arr, pivotIndex, s);
        // Let's manage the left & right side of the pivot
        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr, int s, int e){
        // Base Case:
        if(s >= e) return; // Single element or we are out of bounds
        // Find the pivot for partition
        int p = partitionIndex(arr,s,e);
        // Now we use recursion to sort the left & right part of the pivot
        // Left Part
        quickSort(arr,s,p-1);
        // Right Part
        quickSort(arr,p+1,e);
    }
    public static void main(String[] args) {
        int[] arr = {9,2,1,6,8,10,4,0,-1,3,17,-5};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
