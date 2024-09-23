import java.util.Scanner;

public class Q12_Sumofno {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter no.");
        int n=scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
   sum+=i;
     }
     System.out.println(n + sum);
     scanner.close();
    }

}
