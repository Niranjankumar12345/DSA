package dsa.sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {12, 4, 54, 23, 11, 99, 49, 2, 1, 9};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    int b = a[j];

                    a[j] = a[i];

                    a[i] = b;
                }
            }
        }
        for (int c : a) {
            System.out.println(c);
        }
    }
}
