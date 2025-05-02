package LocalDateTime;

import java.time.LocalDateTime;

public class Example1 {
    public static void main(String[] args) {
        LocalDateTime dateTime =LocalDateTime.now();

        System.out.println(dateTime);

        int year = dateTime.getYear();
        System.out.println("Current Year : " + year);

        int month = dateTime.getMonthValue();
    }
}
