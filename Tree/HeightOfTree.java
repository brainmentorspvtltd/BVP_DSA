public class HeightOfTree {

    static int getHeight(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.leftChild);
        int rightHeight = getHeight(root.rightChild);
        return 1 + Math.max(leftHeight, rightHeight);
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
        int height = getHeight(root);
        System.out.println("Height of Tree is : " + height);
    }
}
