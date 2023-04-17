package queues;

public class Queue<T> {
    private static final int SPECIAL_EMPTY_VALUE = -1;
    private final int MAX_SIZE;
    private Object[] elements;
    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.elements = new Object[MAX_SIZE];
    }

    public Queue() {
        this(100);
    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    public boolean isFull() {
        return headIndex == nextTailIndex();
    }

    private int nextTailIndex() {
        return nextIndex(tailIndex);
    }

    private int nextIndex(int index) {
        return (index + 1) % MAX_SIZE;
    }

    private int nextHeadIndex() {
        return nextIndex(headIndex);
    }

    public int getSize() {
        return Math.abs(tailIndex - headIndex) + 1;
    }

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) throw new QueueOverflowException("Queue is full! Cannot insert " + data);
        tailIndex = nextTailIndex();
        elements[tailIndex] = data;

        if (headIndex == SPECIAL_EMPTY_VALUE) headIndex = tailIndex;
    }

    public T dequeue() throws QueueUnderflowException {
//        if (isEmpty()) throw new QueueUnderflowException("Queue is empty!");
//        T data = (T) elements[headIndex];
        T data = peek();
        if (headIndex == tailIndex) headIndex = SPECIAL_EMPTY_VALUE;
        else headIndex = nextHeadIndex();
        return data;
    }


    public T peek() throws QueueUnderflowException {
        if (isEmpty()) throw new QueueUnderflowException("Queue is empty!");
        return (T) elements[headIndex];
    }

    public boolean offer(T data) {
        try {
            enqueue(data);
            return true;
        } catch (QueueOverflowException e) {
            return false;
        }
    }

}












