/**
 * Test class for the generic Stack class.
 * @author Mohamed Yassin
 *  @version 2025.01.22
 */
public class StackTest {
    public static void main(String[] args) {
        try{
            GenericStack<Integer> intStack = new GenericStack(5);
            intStack.push(1);
            intStack.push(2);
            intStack.push(3);
            System.out.println("List: " + intStack.list());
            System.out.println("Peek: " + intStack.peek()); // Expected: 3
            System.out.println("Pop: " + intStack.pop()); // Expected: 3
            System.out.println("List after pop: " + intStack.list()); // Expected: 1;2


            GenericStack<String> stringStack= new GenericStack<>(3);
            stringStack.push("Hello");
            stringStack.push("World");
            System.out.println("List: " + stringStack.list());
            System.out.println("Peek: " + stringStack.peek()); // Expected: World
            System.out.println("Pop: " + stringStack.pop()); // Expected: World
            System.out.println("List after pop: " + stringStack.list()); // Expected: Hello


            //Fehler
            stringStack.pop();
            stringStack.pop();


        } catch (StackEmptyException | StackFullException e) {
            System.err.println(e.getMessage());
        }
    }
}
