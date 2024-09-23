import java.util.Scanner;

public class Q19_Palindrome { 
    
     public static void main(String[] args) {
        int number=0;
        
        Scanner scanner = new Scanner(System.in);
        int original = number, reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        scanner.close();
    }
}