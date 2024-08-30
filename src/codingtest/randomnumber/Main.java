package codingtest.randomnumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = RandomUniqueNumbers.generate(1, 45, 6);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 정렬 하기
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}
