package basics.datesInJava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Unformatted Date & Time: " +
                dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("d, W MMM dd yyyy");
        /*
        E -> Day of the Week [Mon - Sun]
        MMM -> Month Name [Jan - Dec]
        dd -> Day of the month [1 - 31]
        yyyy -> Year
        MM -> Month Number [1 - 12]
        M -> Month Number without the Preceding Zero
        D -> Day of the Year [1 - 366] [Leap Year Included]
        d -> Day of the Month [1 - 31] [Preceding Zero Excluded]
        yy -> 2026, 2027 [26, 27] and so on, the last two digits of the year
        w -> Week of the year
        W -> Week of the month
         */
        String formattedDateAndTime = dateTime.format(formatter);
        System.out.println("Formatted Date & Time: " +
                formattedDateAndTime);
    }
}
