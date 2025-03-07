import java.util.Scanner;

class BasicCalculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		// Display menu for operations
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
		
		int choice=sc.nextInt();
		// Taking two numbers as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
		
		switch(choice){
			case 1:
			System.out.println("Result is: "+add(num1,num2));
			break;
			case 2:
			System.out.println("Result is: "+subtract(num1,num2));
			break;
			case 3:
			System.out.println("Result is: "+multiply(num1,num2));
			break;
			case 4:
			if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    System.out.println("Result: " + divide(num1, num2));
                }
			break;
			default:
			System.out.println("Invalid choice! Please enter a number between 1 and 4.");
		}
	}
		public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        return a / b;
    }
}

			
			
		