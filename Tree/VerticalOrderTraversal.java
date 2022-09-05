import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

class VerticalPair {
    BinaryTree<Integer> node = null;
    int h1 = 0;
    VerticalPair(BinaryTree<Integer> node, int h1) {
        this.node = node;
        this.h1 = h1;
    }
}

public class VerticalOrderTraversal {

    void verticalOrderIterative(BinaryTree<Integer> root) {
        // queue will store object of Vertical Pair class
        LinkedList<VerticalPair> queue = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int minH = 0, maxH = 0;
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(new VerticalPair(root, 0));
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                VerticalPair pair = queue.removeFirst();
                maxH = Math.max(maxH, pair.h1);
                minH = Math.min(minH, pair.h1);

                map.putIfAbsent(pair.h1, new ArrayList<>());
                map.get(pair.h1).add(pair.node.data);

                if(pair.node.leftChild != null) {
                    queue.addLast(new VerticalPair(pair.node.leftChild, pair.h1-1));
                }
                if(pair.node.rightChild != null) {
                    queue.addLast(new VerticalPair(pair.node.rightChild, pair.h1+1));
                }

            }
        }

        for(int i = minH; i <= maxH; i++) {
            ans.add(map.get(i));
        }

        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }

    void getVerticalOrder(BinaryTree<Integer> root, int distance, TreeMap<Integer, ArrayList<Integer>> map) {
        if(root == null) {
            return;
        }

        if(map.get(distance) == null) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance, list);
        }
        else {
            ArrayList<Integer> list = map.get(distance);
            list.add(root.data);
            map.put(distance, list);
        }

        getVerticalOrder(root.leftChild, distance-1, map);
        getVerticalOrder(root.rightChild, distance+1, map);
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
        
        VerticalOrderTraversal obj = new VerticalOrderTraversal();
        obj.verticalOrderIterative(root);
    }
}
