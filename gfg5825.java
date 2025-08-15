import java.util.*;
class gfg5825{
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
      String s="Too hot to hoot";
      s=s.toLowerCase();
      System.out.println(s);
      StringBuilder st=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isLetterOrDigit(c)){
          st.append(c);
        }
      }
      System.out.println(st);
      if(st.toString().equals(st.reverse().toString())){
        System.out.println("Yes");
        } else {  
        System.out.println("No");
        }
    }
}