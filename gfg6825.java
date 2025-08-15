import java.util.*;
public class gfg6825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int r=0;
        int n= s.length();
        for (int i = 0; i < s.length(); i++) {
            int c=m.get(s.charAt(i));
            if(i+1<n){
                int ne = m.get(s.charAt(i + 1));
                if(c<ne){
                    r-=c;
                }else{
                    r+=c;
                }
            }else{
                r+=c;
            }
        }
        System.out.println(r);
    }
}