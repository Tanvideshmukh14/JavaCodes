package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>(10);
        HashSet<Integer> hashSet2 = new HashSet<>(100,0.5f);
        HashSet<Integer> hashSet3 = new HashSet<>(List.of(12,13,14,156));

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
