import java.util.*;
public class conj13825 {
    public static void main(String[] args) {
        int[] a={1,0,1,0,1};
//         You are given an array/list ‘ARR’ of size ‘N’. ‘ARR' is binary i.e. it contains only 0s and 1s (ARR[i] = {0, 1}). Your task is to find out the minimum number of swaps required to group all 1s together.
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println(-1);
            return;
        }
        
        int maxOnes = 0;
        int currentOnes = 0;
        
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                currentOnes++;
            }
            if (i >= count) {
                if (a[i - count] == 1) {
                    currentOnes--;
                }
            }
            maxOnes = Math.max(maxOnes, currentOnes);
        }
        
        System.out.println(count - maxOnes); // Minimum swaps required
// Note: If ‘ARR’ contains only 0’s then print -1.
    }
}
