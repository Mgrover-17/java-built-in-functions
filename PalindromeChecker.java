import java.util.Scanner;  

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the string: ");
        String str = sc.next(); 

        String reversedString = isPalindrome(str); // Call function to reverse the string
        System.out.println("Reversed String: " + reversedString);

        // Compare original and reversed string to check if it is a palindrome
        if (str.equals(reversedString)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }
    }

    // Function to reverse the given string
    public static String isPalindrome(String s) {
        String rev = "";  
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i); 
        }
        return rev; 
    }
}

/*
Enter the string: madam
Reversed String: madam
The string is a Palindrome
*/
