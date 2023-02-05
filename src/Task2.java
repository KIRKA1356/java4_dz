import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(22);
        queue.add(1);
        queue.add(5);
        System.out.println("QUEUE");
        System.out.println(queue);


        System.out.println("DEQUE AND FIRST");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(10);
        deque.addLast(2);
        deque.offerFirst(21);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);








    }
}
