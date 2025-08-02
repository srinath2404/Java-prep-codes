import java.util.*;
public class fandl{
    public static void main(String[] args) {
        String s="qwdffeqgeg";
      HashMap<Character,int[]> m=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(!m.containsKey(c)){
          m.put(c,new int[]{i,i});
        }
        m.get(c)[1]=i;
      }
      
      List<Integer> l=new ArrayList<>();
      for(int[] k:m.values()){
        int st=k[0];
        int en=k[1];
        if(st!=en){
            int sum=0;
          for(int i=st;i<=en;i++){
            sum+=s.charAt(i)-'a'+1;
          }
          l.add(sum);
        }
      }
      System.out.println(l.stream().mapToInt(Integer::intValue).sum());
      System.out.println(l);
    }
}