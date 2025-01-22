/**
 * A Excepton that ist returned when the Stack is empty
 * @author Mohamed Yassin
 *  @version 2025.01.22
 */
public class StackEmptyException extends Throwable {
    /**
     * The consturtir
     * @param stackIsEmptpty the Error message
     */
    public StackEmptyException(String stackIsEmptpty) {
        super(stackIsEmptpty);
    }
}
