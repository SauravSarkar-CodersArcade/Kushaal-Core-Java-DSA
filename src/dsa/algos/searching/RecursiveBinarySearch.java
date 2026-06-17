package dsa.algos.searching;
public class RecursiveBinarySearch {
    static int recursive_binary(int[] arr, int key, int s, int e){
        // Base case
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return mid;
        } else if (arr[mid] < key) {
            return recursive_binary(arr, key, mid+1, e);
        }else {
            return recursive_binary(arr, key, s, mid -1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,8,10,13,25,67};
        System.out.println(recursive_binary(arr,10,0,arr.length-1));
        System.out.println(recursive_binary(arr,100,0,arr.length-1));
    }
}
