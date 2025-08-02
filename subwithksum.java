import java.util.HashMap;

public class subwithksum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int count = 0;
        map.put(0, 1); // Initialize with sum 0
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
            map.put(cs,map.getOrDefault(cs,0)+1)

        }
        System.out.println("Number of subarrays with sum " + k + ": " + count);
        System.out.println(map);
    }
}
