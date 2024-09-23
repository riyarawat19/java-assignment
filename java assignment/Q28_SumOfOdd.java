public class Q28_SumOfOdd {
    public static int sumOfOddNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers(arr));
    }
}
