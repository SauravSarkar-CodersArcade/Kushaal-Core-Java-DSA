package basics.datesInJava;
import java.time.LocalDate;
public class DateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // YYYY MM DD
        System.out.println("Today's date: " + date);
        LocalDate custom = LocalDate.of(2001, 12, 17);
        System.out.println(custom);
        LocalDate forward = LocalDate.now().plusDays(8);
        System.out.println(forward);
        LocalDate backward = LocalDate.now().minusDays(8);
        System.out.println(backward);
    }
}
