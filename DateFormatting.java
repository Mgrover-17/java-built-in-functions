import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define different format patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format and display the date
        System.out.println("Date in dd/MM/yyyy format: " + currentDate.format(format1));
        System.out.println("Date in yyyy-MM-dd format: " + currentDate.format(format2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + currentDate.format(format3));
    }
}

/*
Example Output:
Date in dd/MM/yyyy format: 07/03/2025
Date in yyyy-MM-dd format: 2025-03-07
Date in EEE, MMM dd, yyyy format: Fri, Mar 07, 2025
*/
