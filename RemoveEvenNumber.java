package dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNumber {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (!(a[i] % 2 == 0)) {
                b++;
            }
        }

        int[] c = new int[b];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (!(a[i] % 2 == 0)) {
                c[j++] = a[i];
            }
        }
        System.out.println(Arrays.toString(c));

        ArrayList<Integer> oddNum=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                oddNum.add(a[i]);
            }
        }
        System.out.println(oddNum);

    }
}
