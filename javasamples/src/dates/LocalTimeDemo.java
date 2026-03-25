package dates;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime curTime = LocalTime.now();
        System.out.println(curTime);

        // time fields
        System.out.println(curTime.getHour());
        System.out.println(curTime.getMinute());
        System.out.println(curTime.getSecond());
        System.out.println(curTime.getNano());

        // format time object
    
        System.out.println(curTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        // showing time in different zone
        LocalTime sgt = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println("Time in Singapore is "+ sgt);
        LocalTime ist = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Time in India is "+ ist);


    }
}
