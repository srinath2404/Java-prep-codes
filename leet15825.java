import java.util.*;
class leet15825 {
    public static void main(String[] args) {
        long  n = 1162261466; // Example input
        if(n==1){
            System.out.println(true);
        }
        double p=1;
        Set<Integer> set=new HashSet<>();
        while(p*4<=n){
            p*=4;
            set.add((int)p);
        }
        System.err.println(set);
        if(set.contains(n)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}