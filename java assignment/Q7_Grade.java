import java.util.Scanner;


public class Q7_Grade {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input percentage from user
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        // Determine the grade based on the percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Output the grade
        System.out.println("Grade: " + grade);

        sc.close();
    }
}


