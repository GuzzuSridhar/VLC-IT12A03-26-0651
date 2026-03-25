package dates;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // all fields available in dat and time class are available here
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getHour());
    }
}
