import java.util.Scanner;

class BinaryTree<T> {
    T data;
    BinaryTree<T> leftChild;
    BinaryTree<T> rightChild;
    BinaryTree(T data) {
        this.data = data;
        this.leftChild = this.rightChild = null;
    }
}

public class BinaryTreeOperations {
    String msg = "root";
    Scanner scanner = new Scanner(System.in);
    BinaryTree<Integer> insert() {
        System.out.println("Enter the " + msg + " data or -1 to exit..." );
        int data = scanner.nextInt();
        if(data == -1) {
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<>(data);
        msg = "left";
        node.leftChild = insert();
        msg = "right";
        node.rightChild = insert();
        msg = "root";
        return node;
    }

    void preOrder(BinaryTree<Integer> root) {
        // PLR
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    void inOrder(BinaryTree<Integer> root) {
        // LPR
        if(root == null) {
            return;
        }
        inOrder(root.leftChild);
        System.out.println(root.data);
        inOrder(root.rightChild);
    }

    void postOrder(BinaryTree<Integer> root) {
        // LRP
        if(root == null) {
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.data);
    }

    void print(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        String output = "";
        System.out.println("Root : " + root.data);
        if(root.leftChild != null) {
            output += "L : " + root.leftChild.data;
        }
        if(root.rightChild != null) {
            output += "R : " + root.rightChild.data;
        }
        System.out.println(output);
        print(root.leftChild);
        print(root.rightChild);
    }

    public static void main(String[] args) {
        BinaryTreeOperations tree = new BinaryTreeOperations();
        BinaryTree<Integer> root = tree.insert();
        tree.print(root);
    }
}