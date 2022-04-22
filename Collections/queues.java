import java.util.*;
public class queues {
    public static void main(String[]args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("England");
        queue.add("Brazil");
        queue.add("Germany");
        //Priority Queue sorts the elements and sets up the queue
        System.out.println("Original Queue: "+queue);

        queue.remove();
        System.out.println("After removing element from queue: "+queue);

        String head = queue.peek();
        System.out.println("Head of the queue: "+head);

        head = queue.poll();
        System.out.println("Removed head of the queue: "+head);

        System.out.println("Queue now looks like this: "+queue);
    }
}
