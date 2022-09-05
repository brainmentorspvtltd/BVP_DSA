import java.util.LinkedList;

public class LeftView {
    static int maxLevel = 0;
    static void leftView(BinaryTree<Integer> root, int level) {
        if(root == null) {
            return;
        }

        if(maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }

        leftView(root.leftChild, level+1);
        leftView(root.rightChild, level+1);
    }

    static void leftViewIter(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                BinaryTree<Integer> currentNode = queue.removeFirst();
                if(i == 0) {
                    System.out.println(currentNode.data);
                }
                if(currentNode.leftChild != null) {
                    queue.addLast(currentNode.leftChild);
                }
                if(currentNode.rightChild != null) {
                    queue.add(currentNode.rightChild);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree<Integer> root = new BinaryTree<>(10);
        root.leftChild = new BinaryTree<>(12);
        root.rightChild = new BinaryTree<>(20);
        root.leftChild.leftChild = new BinaryTree<>(14);
        root.leftChild.rightChild = new BinaryTree<>(30);
        root.leftChild.leftChild.leftChild = new BinaryTree<>(50);
        root.rightChild.leftChild = new BinaryTree<>(25);
        root.rightChild.rightChild = new BinaryTree<>(35);
        leftView(root, 1);
    }
}
