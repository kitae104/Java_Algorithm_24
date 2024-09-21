package sort;

import utils.print.MyPrint;

public class SortMain {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 7, 2, 8, 6, 9, 1};
        BucketSort bs = new BucketSort(arr);
        MyPrint.printArray(arr);
        bs.bucketSort();
        System.out.println("\nBucket Sort : ");
        MyPrint.printArray(arr);
    }
}
