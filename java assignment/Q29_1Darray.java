
    import java.util.HashMap;

public class Q29_1Darray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 6, 6, 5};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequency:");
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > 1) {
                System.out.println(key + ": " + freqMap.get(key));
            }
        }
    }
}


