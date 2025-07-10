package dsa;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<a.length;i++){
            int z=a.length-1;

            if(i<(z-i)){
              int x=a[i];
              a[i]=a[z-i];
              a[z-i]=x;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
