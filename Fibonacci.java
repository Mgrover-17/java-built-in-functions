import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number, till fibonacci series: ");
        int num = sc.nextInt();

        printFibonacciSeries(num);
    }

    // Function to print the Fibonacci series
    public static void printFibonacciSeries(int num) {
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + num + ":");

        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");

            // Calculate the next number in the sequence
            int next = first + second;
            first = second;
            second = next;
        }
    }
}


// Sample Case
// Enter the number, till fibonacci series: 10
// Fibonacci series up to 10:
// 0 1 1 2 3 5 8 13 21 34