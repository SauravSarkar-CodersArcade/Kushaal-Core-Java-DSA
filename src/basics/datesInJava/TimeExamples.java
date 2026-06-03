package basics.datesInJava;
import java.time.LocalTime;
public class TimeExamples {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);
        System.out.println(time.minusMinutes(20));
        System.out.println(time.plusMinutes(10));
    }
}
