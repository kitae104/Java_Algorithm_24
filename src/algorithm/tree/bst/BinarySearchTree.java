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
        root = insert(root, value);
    }

    /**
     * 전위 순회
     * @param node
     */
    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    /**
     * 중위 순회
     * @param node
     */
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getValue() + " ");
        inOrder(node.getRight());
    }

    /**
     * 후위 순회
     * @param node
     */
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue() + " ");
    }

    /**
     * 레벨 순회
     * @param node
     */
    public void levelOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

    }
}
