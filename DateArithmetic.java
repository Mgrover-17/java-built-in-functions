import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define a formatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        // Taking date input from the user
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.next();
        
        // Parsing the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        // Performing date arithmetic
        LocalDate modifiedDate = date.plusDays(7) // Add 7 days
                                     .plusMonths(1) // Add 1 month
                                     .plusYears(2) // Add 2 years
                                     .minusWeeks(3); // Subtract 3 weeks

        // Displaying the results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("Modified Date: " + modifiedDate.format(formatter));
    }
}

/*
Example:
Input:
Enter a date (yyyy-MM-dd): 2024-03-07

Output:
Original Date: 2024-03-07
Modified Date: 2026-04-07
*/

