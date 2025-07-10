package dsa.sort;
import java.util.Arrays;

public class QuickSort {

    // static int[] arr = {8, 7, 6, 1, 0, 9, 2};

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {6,3,2,4,5};

        System.out.println("-************-");

        System.out.println("Original array : " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);

        System.out.println("------------");
        System.out.println("Sorted array : " + Arrays.toString(arr));
    }
}