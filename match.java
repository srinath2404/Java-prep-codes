public class match {
    public static void main(String[] args) {
        // This file is used to match the structure of c2c2.java and bal.java
        // It currently does not contain any logic or functionality.
        // int[] n = {1, 2, 3, 4, 5};
        // int sum = 0;
        // for (int i = 0; i < n.length; i++) {
        //     sum += n[i];
        // }
        // int c=0;
        // for (int i = 0; i < n.length; i++) {
        //     int x= n[i]-sum;
        //     if(x==n[i]) {
        //         c++;
        //     }
        // }
        // System.out.println("Count: " + c);/cc
        int[] n = {1,1,1};
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }

        int c = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == sum - n[i]) {
                c++;
            }
        }

        System.out.println("Count: " + c);
    }
}
