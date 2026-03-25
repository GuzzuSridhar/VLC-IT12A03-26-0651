package dates;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        //  create a date object with custom date
        LocalDate thisDay = LocalDate.now();
        System.out.println(thisDay); // current date
        System.out.println(thisDay.getDayOfMonth());
        System.out.println(thisDay.getDayOfYear());
        System.out.println(thisDay.getDayOfWeek());

        System.out.println("------------------------");



        //  create a date object with custom date
        LocalDate dob = LocalDate.of(2036, 3, 23);
        // print date
        System.out.println(dob);
        // accessing date fields
        System.out.println(dob.getDayOfMonth());
        System.out.println(dob.getDayOfYear());
        System.out.println(dob.getDayOfWeek());
    }



}
