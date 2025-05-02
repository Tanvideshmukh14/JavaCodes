package collectionFramework.Assignment;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(Arrays.asList(30,31,32));

        arrayDeque.addFirst(33);
        arrayDeque.addFirst(34);

        System.out.println("adding 33,34 using addFirst method : " + arrayDeque);

        arrayDeque.removeFirst();
        arrayDeque.removeFirst();

        System.out.println("Removing first 2 elements using removeFirst : " + arrayDeque);

        int firstElement = arrayDeque.getFirst();
        System.out.println("First element from arrayDeque : " + firstElement);

        arrayDeque.add(12);
        arrayDeque.add(13);

        System.out.println("Arraydeque after adding new elements :  " + arrayDeque);

        arrayDeque.removeFirst();
        arrayDeque.removeFirst();

        System.out.println("After removing first 2 elements : " + arrayDeque);

        int topElement = arrayDeque.peek();
        System.out.println("Top element : " + topElement);
    }
}
