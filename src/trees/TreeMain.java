package trees;

import trees.bst.BinarySearchTree;

public class TreeMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(52);
        bst.add(10);
        bst.add(37);
        bst.add(44);
        bst.add(90);
        bst.add(60);
        bst.add(70);
        bst.add(5);
        bst.add(12);
        System.out.println("MINIMUM = " + bst.minimum());
        System.out.println("MAXIMUM = " + bst.maximum());
        //   bst.inOrderTraversal();
        //bst.preOrderTraversal();
        //bst.postOrderTraversal();
      //  bst.reverseInOrder();
        System.out.println(bst.contains(90));
        System.out.println(bst.contains(1));
    }
}
