package stacks;

public class StackTest {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        StackArray<Integer> stack = new StackArray<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        var data = stack.pop();
        stack.push(data);
        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
    }
}
