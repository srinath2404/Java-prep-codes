public class intpali {
    public static void main(String[] args) {
        int n=342435;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(n==rev){
            System.out.println(0);
        }else{
            System.out.println(1+" "+rev);
        }
        
    }
}
