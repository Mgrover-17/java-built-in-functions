import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Taking first date input
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String firstDateInput = sc.next();
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

        // Taking second date input
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String secondDateInput = sc.next();
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        // Comparing the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}

/*
Example Runs:

Input 1:
Enter the first date (dd-MM-yyyy): 17-03-2003
Enter the second date (dd-MM-yyyy): 06-08-2003
The first date is before the second date.

Input 2:
Enter the first date (dd-MM-yyyy): 17-03-2003
Enter the second date (dd-MM-yyyy): 01-03-2003
The first date is after the second date.

Input 3:
Enter the first date (dd-MM-yyyy): 17-03-2003
Enter the second date (dd-MM-yyyy): 17-03-2003
Both dates are the same.
*/

