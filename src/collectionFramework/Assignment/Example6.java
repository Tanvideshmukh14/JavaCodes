package collectionFramework.Assignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        LinkedList<Integer> ListA = new LinkedList<>(List.of(20,30,40,50));

        ListA.addFirst(10);
        System.out.println("Adding 10 at the beginning : " + ListA);

        ListA.addLast(60);
        System.out.println("Adding 60 at the end : " + ListA);

        ListA.add(2,25);
        System.out.println("Adding 25 at 2nd index : " + ListA);

        LinkedList<Integer> ListB = new LinkedList<>(List.of(70,80));
        System.out.println("ListB : " + ListB);

        ListA.addAll(ListB);
        System.out.println("Adding ListB at the end of ListA : " + ListA);

        LinkedList<Character> ListC = new LinkedList<>(List.of('A','B','C'));

//        ListA.addAll(3,ListC);

        System.out.println("Using for-each loop to add character linkedList to integer linked list");

        System.out.println("First reversing ListC so that all the integers are printed in their order : ");
        Collections.reverse(ListC);

        for (Character x : ListC ){
            ListA.add(3,(int) x);
        }

        System.out.println("ListA after addition of Character LinkedList from ListC at 3rd index : " + ListA);

        Boolean result = ListA.contains(65);
        System.out.println("Does ListA contains 65 : " + result);



    }
}
