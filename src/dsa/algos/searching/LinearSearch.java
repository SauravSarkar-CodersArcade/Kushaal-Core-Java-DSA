package dsa.algos.searching;
public class LinearSearch {
    static int linearSearch(int[] arr, int key){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == key) return i; // Key Found => Return Index [i]
        }
        return -1; // Key Not Found => Return Invalid Index [-1]
    }
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{2,4,1,9,0,6}, 0));
        System.out.println(linearSearch(new int[]{2,4,1,9,0,6}, 10));
    }
}
