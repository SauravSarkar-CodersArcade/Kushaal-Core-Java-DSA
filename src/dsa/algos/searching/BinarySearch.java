package dsa.algos.searching;
public class BinarySearch {
    static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e - s)/2;
            if (arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                s = mid + 1; // Go to the RHS
            }else {
                e = mid - 1;
            }
        }
        return -1; // If the loop doesn't find the index, return invalid index [-1]
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{2,4,5,7,8,9,11,19}, 11));
        System.out.println(binarySearch(new int[]{2,4,5,7,8,9,11,19}, 4));
        System.out.println(binarySearch(new int[]{2,4,5,7,8,9,11,19}, 41));
        System.out.println(Integer.MAX_VALUE + 1);
    }
}
