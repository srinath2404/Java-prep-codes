import java.util.Arrays;
import java.util.HashMap;
public class c2c2 {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // String g = "Welcome to the Java program!";
        // // HashMap<String, Integer> map = new HashMap<>();
        // // for(int i=0)
        // String[] words = g.split(" ");
        // for(int i=words.length-1; i>=0; i--) {
        //     System.out.print(words[i] + " ");
        // }
        // System.out.println(words);
        // String g = "Welcome to the Java program!";
        // String[] words = g.split(" ");
        
        // // Print words in reverse order
        // for (int i = words.length - 1; i >= 0; i--) {
        //     System.out.print(words[i] + " ");
        // }

        // System.out.println(); // Move to new line

        // // Print array using Arrays.toString
        // System.out.println(Arrays.toString(words));
        String g = "Welcome to the Java program!";
        String[] words = g.split(" ");
        
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        // Output as a single string
        String reversedString = reversed.toString();
        System.out.println(reversedString);
    }
}
