import java.util.*;
public class countFreq {
    public static void main(String[] args) {
        int n = 342435;
        // int[] freq = new int[10]; // Array to hold frequency of digits 0-9
        
        // while (n > 0) {
        //     int digit = n % 10; // Get the last digit
        //     freq[digit]++; // Increment the frequency of that digit
        //     n /= 10; // Remove the last digit
        // }
        
        // // Print the frequency of each digit
        // for (int i = 0; i < freq.length; i++) {
        //     System.out.println("Digit " + i + ": " + freq[i]);
        // }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
             // Initialize frequency map for digits 0-9
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Digit " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
