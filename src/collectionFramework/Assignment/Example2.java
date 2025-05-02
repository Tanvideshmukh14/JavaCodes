package collectionFramework.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> ListA = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> ListB = new ArrayList<>(List.of(5,6,7,8,9,10,11,12,13,14,15));

        ListB.removeAll(ListA);
        System.out.println("Removing all elements ListA from ListB : " + ListB);

        ListA.addAll(ListB);
        System.out.println("Adding all elements from ListB to ListA : " + ListA);

        boolean result = ListA.containsAll(ListB);
        System.out.println("If ListA contains all elements of ListB : " + result);

        System.out.println("Traversing through ListA");
        Iterator<Integer> iterator = ListA.iterator();
        while(iterator.hasNext()){
            int x = iterator.next();
            System.out.println(x);
        }

        System.out.println("Printing all elements of ListA using For each loop : ");
        for (Integer x : ListA){
            System.out.println(x);
        }
    }
}
