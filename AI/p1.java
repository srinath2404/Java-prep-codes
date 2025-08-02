package AI;
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int mid = (l+h)/2;
            if(arr[mid] > arr[mid+1]){
                System.out.println(arr[mid]);
                return;
            }
            if(arr[mid] < arr[mid-1]){
                System.out.println(arr[mid-1]);
                return;
            }
            if(arr[l] < arr[mid]){
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }   
    }
}
