public class excle {
    public static void main(String[] args) {
        String str = "HZwefe";
        int res=0;
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            int v= c - 'A' + 1;
            res= res * 26 + v;
        }
        System.out.println(res);
    }
}
