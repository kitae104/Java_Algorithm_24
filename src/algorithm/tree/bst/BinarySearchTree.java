package algorithm.tree.bst;

import lombok.Data;

@Data
public class BinarySearchTree {
    private BinaryNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if(currentNode == null) {   // 새로운 노드를 만들어서 리턴
            BinaryNode newNode = new BinaryNode(value);
            System.out.println("값 : " + value + " 을 트리에 추가.");
            return newNode;
        } else if(value <= currentNode.getValue()){  // 왼쪽 서브트리로 이동
            currentNode.setLeft(insert(currentNode.getLeft(), value));
            return currentNode;
        } else {   // 오른쪽 서브트리로 이동
            currentNode.setRight(insert(currentNode.getRight(), value));
            return currentNode;
        }
    }

    public void insert(int value) {
        insert(root, value);
    }
}
