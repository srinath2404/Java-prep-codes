import java.util.Arrays;
public class conj5825 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                a[i]=a[i+1];
            }else{
                a[i]=-1;
            }
        }
        a[a.length-1]=-1;
        System.out.println(Arrays.toString(a));
    }
}
