import java.util.Scanner;

public class Q8_divisiblenumber {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Check divisibility
        if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is not divisible by " + divisor);
        }

        sc.close();
    }
}


