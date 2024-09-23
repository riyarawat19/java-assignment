import java.util.Scanner;

public class Q14_multipleOf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number");
        int start=scanner.nextInt();
        System.out.print("enter number");
        int end=scanner.nextInt();
        System.out.println(start+end);
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();

}
}
