import java.util.Scanner;
import java.lang.Math;

public class MaxOfThreeNumbers {

    public static int maximumOfThree(int num1, int num2, int num3){
        return Math.max(num1,Math.max(num2,num3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();


        int maxNumber = maximumOfThree(num1,num2,num3);

        System.out.println("Maximum of three numbers are: "+ maxNumber);
    }
}

/*
Enter the first number: 2
Enter the second number: 3
Enter the third number: 4
Maximum of three numbers are: 4
*/