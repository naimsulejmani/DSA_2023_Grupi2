package queues;

public class QueueTest {
    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        Queue<String> ushqimet = new Queue<>(3);
        ushqimet.enqueue("PASUL");
        ushqimet.enqueue("SAMUN");
        ushqimet.enqueue("SADUSH");
        System.out.println(ushqimet.offer("ERROR"));
        System.out.println(ushqimet.dequeue());
        System.out.println(ushqimet.dequeue());
        System.out.println(ushqimet.dequeue());
        System.out.println(ushqimet.offer("ERROR"));
        System.out.println(ushqimet.peek());
        System.out.println(ushqimet.dequeue());

    }
}
