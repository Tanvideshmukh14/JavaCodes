package collectionFramework.Assignment;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Example7 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addLast(21);
        arrayDeque.addLast(22);
        arrayDeque.addLast(23);
        arrayDeque.addLast(24);
        arrayDeque.addLast(25);

        System.out.println("Adding elements using addLast method : " + arrayDeque);

        arrayDeque.removeFirst();
        arrayDeque.removeFirst();

        System.out.println("Removing elements using removeFirst method : " + arrayDeque);

        int firstElement = arrayDeque.getFirst();
        System.out.println("firstElement : " + firstElement);

        int lastElement = arrayDeque.getLast();
        System.out.println("lastElement : " + lastElement);


    }
}
