public class Q23_Pattern {
   
        public static void main(String[] args) {
            int num = 1; // Initial number to start with
            
            // Outer loop for rows
            for (int i = 1; i <= 3; i++) {
                // Inner loop for numbers in each row
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println(); // Move to next line after each row
            }
        }
    }
    

