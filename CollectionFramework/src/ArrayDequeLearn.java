import java.util.ArrayDeque;

public class ArrayDequeLearn {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();


        adq.offer(93);
        adq.offerFirst(28);
        adq.offerLast(38);
        adq.offer(19);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll(): " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst(): " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast(): " + adq);



    }
}
