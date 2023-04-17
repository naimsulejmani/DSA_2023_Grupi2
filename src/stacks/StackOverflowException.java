package stacks;

public class StackOverflowException extends Exception {
    public StackOverflowException() {
    }

    public StackOverflowException(String message) {
        super(message);
    }
}
