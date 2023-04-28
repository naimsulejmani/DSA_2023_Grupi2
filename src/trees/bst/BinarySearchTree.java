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
        return minimum(root);
    }

    private T minimum(Node<T> temp) {
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp.getKey();
    }


    public T maximum() {
        if (isEmpty()) return null;
        return maximum(root);
    }

    private T maximum(Node<T> temp) {
        while (temp.getRight() != null) {
            temp = temp.getRight();
        }
        return temp.getKey();
    }


    public void add(T key) {
        root = add(root, key);
    }

    public Node<T> add(Node<T> currentNode, T key) {
        if (currentNode == null) {
            currentNode = new Node<>(key);
            return currentNode;
        }
        if (key.compareTo(currentNode.getKey()) < 0) {
            currentNode.setLeft(add(currentNode.getLeft(), key));
        } else {
            currentNode.setRight(add(currentNode.getRight(), key));
        }
        return currentNode;
    }


    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node<T> currentNode) {
        if (currentNode == null) return;

        inOrder(currentNode.getLeft());
        System.out.println(currentNode.getKey());
        inOrder(currentNode.getRight());
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    private void preOrder(Node<T> currentNode) {
        if (currentNode == null) return;
        System.out.println(currentNode.getKey());
        preOrder(currentNode.getLeft());
        preOrder(currentNode.getRight());
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(Node<T> currentNode) {
        if (currentNode == null) return;
        postOrder(currentNode.getLeft());
        postOrder(currentNode.getRight());
        System.out.println(currentNode.getKey());
    }

    public void reverseInOrder() {
        reverseInOrder(root);
    }

    private void reverseInOrder(Node<T> currentNode) {
        if (currentNode == null) return;
        reverseInOrder(currentNode.getRight());
        System.out.println(currentNode.getKey());
        reverseInOrder(currentNode.getLeft());
    }

    public boolean contains(T key) {
        return search(root, key) != null;
    }

    private Node<T> search(Node<T> current, T key) {
        if (current == null) return null;
        if (key.compareTo(current.getKey()) == 0) return current;

        if (key.compareTo(current.getKey()) < 0)
            return search(current.getLeft(), key);
        else
            return search(current.getRight(), key);
    }

    private T successor(Node<T> root) {
        return minimum(root.getRight());
      //  return maximum(root.getLeft());
    }

    //not finished just some logic
    public void deleteKey(T key) {
        Node<T> node = search(root, key);
        //nese kjo nyje i ka dy femij eshte dasht me gjet successur
        T successor = successor(node);
        Node<T> replaceNode = new Node<>(successor);

    }
}






