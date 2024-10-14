package algorithm.tree.binarytree.array;

import lombok.Data;

@Data
public class BinaryTreeArray {
    private String[] arr; // 배열
    int lastUsedIndex;  // 마지막으로 사용된 인덱스

    public BinaryTreeArray(int size) {
        arr = new String[size + 1]; // 0번 인덱스는 사용하지 않기 위해 size + 1
        this.lastUsedIndex = 0;
        System.out.printf("크기가 %d 인 Binary tree 를 생성했습니다.\n", size);
    }

    /**
     * 가득 찼는지 확인<br />
     * 배열의 길이에서 1을 뺀 값과 마지막으로 사용된 인덱스 값이 같으면 가득 찬 것으로 판단
     */
    public boolean isFull() {
        return lastUsedIndex == arr.length - 1;
    }

    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println(value + " 를 성공적으로 삽입했습니다.");
        } else {
            System.out.println("Binary tree 가 가득 찼습니다.");
        }
    }
}
