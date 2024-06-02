package ab;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> stack = new ArrayDeque<>();

        // Pushing elements onto the stack
        stack.push(5);
        stack.push(6);
        stack.push(7);

        // Popping elements from the stack
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 6
        
       

        // Peek at the top element without removing it
        System.out.println(stack.peek()); //5

	}
}


