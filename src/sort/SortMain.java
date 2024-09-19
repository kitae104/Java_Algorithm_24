package sort;

import utils.print.MyPrint;

public class SortMain {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = bubbleSort.bubbleSort(arr);
        System.out.println("Bubble Sort : ");
        MyPrint.printArray(sorted);

        int[] arr2 = {64, 11, 25, 12, 22, 90, 34};
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Quick Sort : ");
        MyPrint.printArray(arr2);
    }
}
