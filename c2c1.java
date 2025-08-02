import java.util.HashSet;
public class c2c1 {
    public static void main(String[] args) {
        int n=2000000;
        HashSet<Integer> set = new HashSet<>();
        for(int c=2;c*c<=n;c++){
            long pow=(long) c*c;
            while(pow<=n){
                set.add((int)pow);
                pow*=c;
            }
        }
        int count = 0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                count++;
            }
        }
        System.out.println("Count of numbers not expressible as a power of a prime: " + count);
    }
}
