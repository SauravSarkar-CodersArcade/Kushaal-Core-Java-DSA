package exceptions;
import java.util.Scanner;
public class ScannerProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // To consume the leftover line from nextInt()
        scanner.nextLine(); // This consumes the leftover line
        String s = scanner.nextLine();

        System.out.println(age);
        System.out.println(s);
    }
}
