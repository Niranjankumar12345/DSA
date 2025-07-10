package dsa.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a={2,5,7,1,10,5,6};
        for(int j=0;j<a.length;j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int z = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = z;
                }
            }

        }
        System.out.println(Arrays.toString(a));

    }
}
