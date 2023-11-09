import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueLearn {
    public static void main(String[] args) {
//        Queue<Integer> pq = new PriorityQueue<>();
//
//        pq.offer(92);
//        pq.offer(24);
//        pq.offer(34);
//
//        System.out.println(pq);
//
//        pq.poll();
//        System.out.println(pq);
//
//        System.out.println(pq.peek());

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(92);
        pq.offer(24);
        pq.offer(34);
        pq.offer(2891);
        pq.offer(783);

        System.out.println(pq);




    }
}
