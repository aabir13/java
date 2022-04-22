import java.util.*;
public class stacks {
    public static void main(String[]args) {
        Stack<String> stack = new Stack<>();
        stack.push("Brazil");
        stack.push("England");
        stack.push("India");
        System.out.println("Stack: "+stack);

        String poppedElement = stack.pop();
        System.out.println("Popped Element: "+poppedElement);

        System.out.println("Now the stack looks like: "+stack);

        String peekedElement = stack.peek();
        System.out.println("Peeked Element: "+peekedElement);

        System.out.println("Now the stack stays like: "+stack);
    }
}
