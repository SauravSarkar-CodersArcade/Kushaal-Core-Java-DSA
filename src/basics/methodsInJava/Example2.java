package basics.methodsInJava;
public class Example2 {
    // How to pass an array into a method
    static int total(int[] arr){
        int sum = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    static int avg(int[] arr){
        int sum = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(total(arr));
        System.out.println(avg(arr));
    }
}
