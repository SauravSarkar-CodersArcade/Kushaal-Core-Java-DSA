package exceptions;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x);
        String s = "Saurav"; // 0->S 1->a ......  5->v
        System.out.println(s.charAt(0));
        char c = scanner.next().charAt(8);
        System.out.println(c);
        // char c1 = scanner.nextLine().charAt(8);
        // System.out.println(c1);
    }
}
