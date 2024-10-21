package algorithm.tree.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);

        System.out.println("\n\n전위 순회");
        bst.preOrder(bst.getRoot());

        System.out.println("\n\n중위 순회");
        bst.inOrder(bst.getRoot());

        System.out.println("\n\n후위 순회");
        bst.postOrder(bst.getRoot());
    }
}
