package codingtest.randomnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomUniqueNumbers {

    public static int[] generate(int begin, int last, int size) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = begin; i <= last; i++) {
            numbers.add(i);
        }

        // 숫자 섞기
        Collections.shuffle(numbers);

        // 필요한 만큼 추출
        List<Integer> result = numbers.subList(0, size);

        // 결과 출력 (배열로 변환하여 출력하는 예시)
        int[] randomNumbers = result.stream().mapToInt(Integer::intValue).toArray();
        return randomNumbers;
    }
}
