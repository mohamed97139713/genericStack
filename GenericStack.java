import java.util.EmptyStackException;
import java.util.Stack;
/**
 * Stack class implementing a generic stack with array storage.
 * Provides methods for pushing, popping, peeking, and listing elements.
 * @author Mohamed Yassin
 * @version 2025.01.22
 */
public class GenericStack<T> {
    private T[] elements;
    private int top;
    private int capacity;
    /**
     * Default constructor initializing the stack with a capacity of 10.
     */
    public GenericStack() {
        this(10);
    }
    /**
     * Constructor initializing the stack with the specified capacity.
     * @param capacity The maximum capacity of the stack.
     */
    public GenericStack(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Object[capacity];
        this.top = -1;
    }
    /**
     * Pushes an element onto the stack.
     * @param element The element to push onto the stack.
     * @throws StackFullException If the stack is full.
     */
    public void push(T element) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full.");
        }
        elements[++top] = element;
    }
    /**
     * Pops an element from the stack.
     * @return The element popped from the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is emptpty");
        }
        return elements[top--];
    }
    /**
     * Peeks at the top element of the stack without removing it.
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty.");
        }
        return elements[top];
    }
    /**
     * Lists all elements in the stack as a semicolon-separated string.
     * @return A string representation of the stack.
     */
    public String list(){
        String result = "";
        for (int i = 0; i <= top; i++) {
            result += elements[i] + ";" ;

        }
        return result;
    }
}
