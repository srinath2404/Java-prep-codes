
import java.util.*;
public class pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        // int n = s.length();
        s=s.toLowerCase();
        char[] c=s.toCharArray();
        String k="act";
        Arrays.sort(c);
        System.out.println(c);
        if(c.equals(k)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
