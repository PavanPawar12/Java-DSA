
import java.util.LinkedList;
import java.util.Queue;


public class LearnLinkesListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(15);
        queue.offer(13);
        System.out.println(queue);

        System.out.println( queue.poll());
        
        System.out.println(queue);

        System.out.println(queue.peek());

    }
}
