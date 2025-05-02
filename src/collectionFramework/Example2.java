package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>(List.of(1,2,3,4,5));

        System.out.println(linkedList1);
        System.out.println(linkedList);

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);

        System.out.println(linkedList);

        Integer headData = linkedList.getFirst();
        System.out.println("Head data : " + headData);

        Integer tailData = linkedList.getLast();
        System.out.println("Tail data : " + tailData);

        linkedList.addFirst(0);
        System.out.println("Add first : " + linkedList);

        linkedList.addLast(25);
        System.out.println("Add last : " + linkedList);

        linkedList1.addAll(linkedList);
        System.out.println("Add all : " + linkedList1);

        linkedList1.retainAll(linkedList);
        System.out.println("Retain all" + linkedList1);




    }
}
