package algorithm.tree.binarytree;

import lombok.Data;

@Data
public class BinaryTreeLinkedList {
    private BinaryNode root;    // 루트 노드

    /**
     * 기본 생성자
     */
    public BinaryTreeLinkedList() {
        this.root = null;
    }

    /**
     * 전위 순회
     * @param node
     */
    public void preOrder(BinaryNode node) {
        if (node == null) {
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
     * @param root
     */
    public void postOrder(BinaryNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }
}
