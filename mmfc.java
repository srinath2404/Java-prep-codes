import java.util.*;
public class mmfc {
    public static void main(String[]args){
        Map<Integer,Integer> map=new HashMap<>();
        int maxf=0;
        int minf=0;
        int maxe=0;
        int mine=0;
        int[] arr={2,4,5,6,5,6};
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>maxf){
                maxf=value;
                maxe=key;
            }
            if(value<minf || minf==0){
                minf=value;
                mine=key;
            }
        }
    }
    // Count thr Maximum frequency element and Minimum frequency element with the keys of them  in an array
}
