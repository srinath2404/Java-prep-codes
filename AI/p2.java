package AI;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 6, 7, 8, 9, 6, 10, 11, 12, 6};
        int l = 0;
        int t=6;
        int k=0;
        int[] nums = new int[arr.length];
        int h = arr.length - 1;
        while(l < h) {
            int mid = (l + h) / 2;
            if (arr[mid] == t) {
                nums[k]=mid;
                k++;
            }
            if (arr[l] <t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
