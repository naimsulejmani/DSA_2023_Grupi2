package trees.bst;

public class Node<T extends Comparable<T>> {
    private final T key;
    private Node<T> left;
    private Node<T> right;

    public Node(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}









