package collectionFramework.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>(List.of(11.1,22.2,33.3,44.4,66.6));

        arrayList.add(2,7.77);

        arrayList.remove(4);

        ArrayList<Double> arrayList2 = new ArrayList<>(List.of(99.99,88.88,77.77));

        arrayList.addAll(arrayList2);

        arrayList.set(3,55.5);

        boolean result = arrayList.contains(10.5);
        System.out.println("Does arrayList Contains 10.5 :" + result);

        int index = arrayList.indexOf(55.5);
        System.out.println("Index of 55.5 : " + index);

        System.out.println(arrayList);

        System.out.println("Printing all elements using for each loop : ");
        for (Double x : arrayList){
             System.out.println(x);
         }

        System.out.println("Using iterator to iterate over the list");

        Iterator<Double> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Double x = iterator.next();
            System.out.println(x);

        }

    }
}
