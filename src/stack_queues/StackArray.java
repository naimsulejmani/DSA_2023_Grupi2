package stack_queues;

public class StackArray<T> {
    private final int MAX_SIZE;
    private Object[] elements;
    private int size;

    public StackArray(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        elements = new Object[MAX_SIZE];
    }

    public StackArray() {
        this(100);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }

    public void push(T data) throws StackOverflowException {
        if (isFull()) throw new StackOverflowException("Stacku eshte full! Nuk ka vende te lira");
        elements[size++] = data;
    }

    public T pop() throws StackUnderflowException {
        T data = peek();
        elements[--size] = null;
        return data;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) throw new StackUnderflowException("Stack is empty! Ska elemente ne te!");
        T data = (T) elements[size - 1];
        return data;
    }
}
