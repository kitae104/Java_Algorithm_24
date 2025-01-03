package algorithm.sort;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
