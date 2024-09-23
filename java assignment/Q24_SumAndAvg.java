import java.util.Scanner;

public class Q24_SumAndAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
       double average=sum/n;
       System.out.println("Sum: " + sum);
       System.out.println("Average: " + average);
       scanner.close();
    }

    
}
