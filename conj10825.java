
import java.util.*;
public class conj10825 {
    public static void main(String[] args) {
        String str="TheQuickBrownFoxJumpsOverTheLazyDog";
        str = str.toLowerCase();
        char[] c=str.toCharArray();
		Arrays.sort(c);
        System.out.println(new String(c));
        HashSet<Character> set = new HashSet<>();
        for (char ch : c) {
            set.add(ch);
        }
        if (set.size() == 26) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
