package basics.methodsInJava;
public class Example3 {
    // How to return an array from a method
    static int[] avg_sum(int[] arr){
        int sum = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        int[] result = {0,0};
        result[0] = sum;
        result[1] = sum / arr.length;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] sum_avg = avg_sum(arr);
        System.out.println(sum_avg[0]);
        System.out.println(sum_avg[1]);
    }
}
