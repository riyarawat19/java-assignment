import java.util.Scanner;

public class Q33_InstanceVariable {
    private double sales; // Instance variable for sales

    // Constructor to initialize sales
    public Q33_InstanceVariable(double sales) {
        this.sales = sales;
    }

    // Method to calculate commission (assuming 10% commission for this example)
    public double calculateCommission() {
        return sales * 0.10;
    }
}

// Demo class to test Commission class
class Q33_InstanceVariableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read sales from user
        System.out.print("Enter the sales amount: ");
        double sales = sc.nextDouble();

        // Validate the input
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create Commission object with valid sales amount
            Q33_InstanceVariable commissionObj = new Q33_InstanceVariable(sales);

            // Call calculateCommission() method and print the result
            double result = commissionObj.calculateCommission();
            System.out.println("The commission is: " + result);
        }

        sc.close();
    }
}
