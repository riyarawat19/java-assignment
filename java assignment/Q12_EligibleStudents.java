import java.util.Scanner;

public class Q12_EligibleStudents {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for Student " + i);
            System.out.print("Mathematics: ");
            int math = sc.nextInt();
            System.out.print("Physics: ");
            int physics = sc.nextInt();
            System.out.print("Chemistry: ");
            int chemistry = sc.nextInt();

            boolean eligible = (math >= 60 && physics >= 50 && chemistry >= 40 &&
                               (math + physics + chemistry >= 200 || math + physics >= 150));

            if (eligible) {
                System.out.println("Student " + i + " is eligible.");
            } else {
                System.out.println("Student " + i + " is not eligible.");
            }
        }
        sc.close();
    }
}


