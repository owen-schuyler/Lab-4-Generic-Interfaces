import java.util.ArrayList;

/**
 * A generic stack class, which implements the IStack interface.
 *
 * @param <T> the type of elements in the stack
 *
 * @invariant capacity > 0 AND 0 <= |elements| <= capacity
 *
 * @corresponds size = capacity
 *
 */
public class GenericStack<T> implements IStack<T>{
    private ArrayList<T> elements;
    private final int capacity;
    public static final int DEFAULT_CAPACITY = 10;

    /**
     * Construct a stack with the default capacity 10.
     *
     * @pre none
     *
     * @post elements = new ArrayList<>(DEFAULT_CAPACITY) AND capacity = DEFAULT_CAPACITY
     */
    public GenericStack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct a stack with the specified capacity.
     *
     * @param capacity the specified capacity of the stack
     *
     * @pre capacity > 0
     *
     * @post elements = new ArrayList<>(capacity) AND this.capacity = capacity
     */
    public GenericStack(int capacity) {
        elements = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    @Override
    public ArrayList<T> getElements() {
        return elements;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    /**
     * Return the string representation of the stack.
     *
     * @return the string representation of the stack
     *
     * @pre none
     *
     * @post toString = [The string representation of the stack which uses ArrayList.toString() to print the contents
     * of the stack. The returned string begins with the String "stack: "] AND elements = #elements
     *
     * @see ArrayList#toString()
     */
    public String toString() {
        return "stack: " + elements.toString();
    }


}