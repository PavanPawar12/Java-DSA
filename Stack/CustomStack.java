
public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;  // pointer to top element

    // Default constructor
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    // Constructor with custom size
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // Push operation
    public boolean push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is full, cannot push!");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    // Pop operation
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    // Peek operation
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }

        return data[ptr];
    }

    // Check if stack is full
    private boolean isFull() {
        return ptr == data.length - 1;
    }

    // Check if stack is empty
    private boolean isEmpty() {
        return ptr == -1;
    }
}