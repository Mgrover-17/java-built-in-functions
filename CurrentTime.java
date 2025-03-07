import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class CurrentTime {
    public static void main(String[] args) {
        // Define a formatter for displaying time in a readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Get current time in different time zones
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST

        // Displaying the times in different zones
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}

/*
Example Output:
Current Time in GMT: 2025-03-07 12:00:00 GMT
Current Time in IST: 2025-03-07 17:30:00 IST
Current Time in PST: 2025-03-07 04:00:00 PST
*/
