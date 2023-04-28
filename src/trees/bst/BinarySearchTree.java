package trees.bst;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public BinarySearchTree() {
    }

    public boolean isEmpty() {
        return root == null; // return size == 0;
    }

    public T minimum() {
        if (isEmpty()) return null;
        Node<T> temp = root;
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp.getKey();
    }

    public T maximum() {
        if (isEmpty()) return null;
        Node<T> temp = root;
        while (temp.getRight() != null) {
            temp = temp.getRight();
        }
        return temp.getKey();
    }


}






