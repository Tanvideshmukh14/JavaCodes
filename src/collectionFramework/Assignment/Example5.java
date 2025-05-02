package collectionFramework.Assignment;

import java.util.LinkedList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        LinkedList<Integer> ListA = new LinkedList<>(List.of(1,2,3,4,5));

        LinkedList<Integer> ListB = new LinkedList<>(List.of(6,7,8,9,10));

        ListA.addAll(ListB);
        System.out.println("listA : " + ListA);

        ListA.addAll(3,ListB);
        System.out.println("Updated listA : " + ListA);

        ListA.removeFirst();
        System.out.println("Removing first element from listA : " + ListA);

        ListA.removeLast();
        System.out.println("Removing last element from listA : " + ListA);

        LinkedList<Integer> ListC = new LinkedList<>(List.of(11,22,33));

        ListA.addAll(1,ListC);
        System.out.println("Insertion of ListC at 1 index in ListA : " + ListA);
    }
}
