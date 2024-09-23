import java.util.Scanner;

public class Q1_TemperatureConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for conversion choice
        System.out.println("Choose conversion: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        double temperature, converted;

        switch (choice) {
            case 1:
                // Celsius to Fahrenheit conversion
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                converted = (temperature * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + converted);
                break;
            case 2:
                // Fahrenheit to Celsius conversion
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                converted = (temperature - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + converted);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
