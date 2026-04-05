import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;



public class LearnPrioritypd {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(15);
        pq.offer(13);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
