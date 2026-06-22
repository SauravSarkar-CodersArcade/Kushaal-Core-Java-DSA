package dsa.algos;
public class KadaneAlgorithm {
    public static int KadaneAlgo(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for (int i=1; i<arr.length; i++){
            cMax = Math.max(arr[i], cMax + arr[i]);
            gMax = Math.max(cMax, gMax);
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,-8,1,2,-1,4};
        System.out.println("Max Subarray Sum: " + KadaneAlgo(arr1));
        int[] arr2 = {-1,-2,-3,-4,-5,-6,0};
        System.out.println("Max Subarray Sum: " + KadaneAlgo(arr2));
    }
}
