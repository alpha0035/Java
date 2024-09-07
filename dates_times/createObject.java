package dates_times;

import java.time.*;
// all datetime class have now() method which create new obj of current date or time
public class createObject {
    public static void main(String[] args) {
        LocalDateTime d= LocalDateTime.now();
        ZonedDateTime date= ZonedDateTime.now();
        System.out.println("Local Time: "+ LocalTime.now().toString());
        System.out.println("Local Date: "+ LocalDate.now().toString());
        System.out.println("Local Date Time: "+ d.toString());
        System.out.println("Offset Time: "+OffsetTime.now().toString());
        System.out.println("Offset Date Time: "+OffsetDateTime.now().toString());
        System.out.println("Zoned Date Time: "+date.toString());
        System.out.println("Month Day: "+MonthDay.now().toString());
        System.out.println("Year Month: "+YearMonth.now().toString());
        System.out.println("Instant: "+Instant.now().toString());
    }
}
