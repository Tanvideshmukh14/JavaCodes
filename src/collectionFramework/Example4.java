package collectionFramework;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example4 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is empty : " + isEmpty);

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue);

        String s = queue.poll();
        System.out.println("Removed from queue : " + s);

        s = queue.peek();
        System.out.println("Front : " + s);
    }
}
