import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for choice
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        // Get temperature input
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        // Perform conversion based on choice
        if (choice == 1) {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        } else if (choice == 2) {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        sc.close();
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

/*
Example Runs:

Run 1:
Choose conversion type:
1. Fahrenheit to Celsius
2. Celsius to Fahrenheit
Enter your choice (1 or 2): 1
Enter temperature: 100
Temperature in Celsius: 37.77777777777778

Run 2:
Enter your choice (1 or 2): 2
Enter temperature: 0
Temperature in Fahrenheit: 32.0
*/
