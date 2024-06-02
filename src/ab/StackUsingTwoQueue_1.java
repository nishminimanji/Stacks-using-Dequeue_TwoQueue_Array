package ab;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue_1 {
//Implementation of Stacks Using two Queues
//Push Operation Costly
		private Queue<Integer> pushQ = new LinkedList<>();
	    private Queue<Integer> popQ = new LinkedList<>();

	    // Push operation
	    public void push(int a) {
	    	
	        // Enqueue the element to pushQ
	        pushQ.add(a);
	        
	        // Move all elements from popQ to pushQ
	        while (!popQ.isEmpty()) {
	            pushQ.add(popQ.remove());
	        }
	        
	        // Swap the names of pushQ and popQ
	        Queue<Integer> temp = pushQ;
	        pushQ = popQ;
	        popQ = temp;
	    }

	    // Pop operation
	    public int pop() {
	        if (popQ.isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return popQ.remove();
	    }
	    

	    // Peek operation
	    public int peek() {
	        if (popQ.isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return popQ.peek();
	    }

	    // Check if the stack is empty
	    public boolean isEmpty() {
	        return popQ.isEmpty();
	    }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			StackUsingTwoQueue_1  stack = new StackUsingTwoQueue_1 ();
	        stack.push(5);
	        stack.push(6);
	        stack.push(7);

	        System.out.println(stack.pop());  // 7
	        System.out.println(stack.peek()); // 6
	        System.out.println(stack.pop());  // 6
	        System.out.println(stack.isEmpty()); // false

		}

	
	

}
