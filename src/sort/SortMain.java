package sort;

import utils.print.MyPrint;

public class SortMain {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = bubbleSort.bubbleSort(arr);
        MyPrint.printArray(sorted);
    }
}
