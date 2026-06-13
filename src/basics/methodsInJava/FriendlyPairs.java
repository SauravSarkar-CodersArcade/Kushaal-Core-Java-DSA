package basics.methodsInJava;
public class FriendlyPairs {
    public static void main(String[] args) {
        int n1 = 16, n2 = 28; // [Not FP] int n1 = 16, n2 = 28; // [These are FP]
        int s1 = getDivisorSum(n1);
        int s2 = getDivisorSum(n2);
        if(s1 / n1 == s2 / n2){
            System.out.println(n1 + " & " + n2 + " are Friendly Pairs.");
        }else {
            System.out.println(n1 + " & " + n2 + " are not Friendly Pairs.");
        }
    }
    static int getDivisorSum(int n){
        int sum = 0;
        for (int i = 1; i <= n;  i++){
            if( n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
