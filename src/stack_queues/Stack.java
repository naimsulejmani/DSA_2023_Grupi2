package stack_queues;

public class Stack<T> {
    private final int MAX_SIZE;
    private Element<T> top;
    private int size;

    public Stack(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
    }

    public Stack() {
        this(100);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }

    public void push(T data) throws StackOverflowException {
        if (isFull()) throw new StackOverflowException("Stacku eshte full! Nuk ka vende te lira");
        top = new Element<>(data, top);
        size++;
//        Element<T> newElement = new Element<>(data, top);
//        top = newElement;
//        Element<T> newElement = new Element<>(data);
//        newElement.setNext(top);
//        top = newElement;
    }

    public T pop() throws StackUnderflowException {
//        if (isEmpty()) throw new StackUnderflowException("Stack is empty! Ska elemente ne te!");
//        T data = top.getData();
        T data = peek();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) throw new StackUnderflowException("Stack is empty! Ska elemente ne te!");
        return top.getData();
    }


}
















