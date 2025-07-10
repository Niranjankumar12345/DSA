package dsa;

import java.util.Arrays;

public class MoveZeroToFirstAndLast {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 0, 4, 5, 0, 6, 7, 0, 8, 9};
        zeroGoLast(a);
      //  zeroComeFront(a);
    }

    public static void zeroGoLast(int[] a) {

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index++] = a[i];
            }
        }
        while (index < a.length) {
            a[index++] = 0;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void zeroComeFront(int[] a) {

        int revInd = a.length - 1;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[revInd--] = a[i];
            }
        }
        while (revInd >= 0) {
            a[revInd--] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
