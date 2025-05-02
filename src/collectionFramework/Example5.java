package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        Collection<String> c1 = new LinkedList<>(List.of( "A" ,"B" ,"C","D"));
        Collection<String> c2 = new ArrayList<>(List.of("E","F","G","H"));

        c1.add("X");

        c1.addAll(c2);

        c1.remove("G");

        c1.addAll(c2);

//        c1.removeAll(c2);

        boolean result = c1.contains("E");
        System.out.println(result);

        result = c1.containsAll(c2);
        System.out.println(result);

        int len = c1.size();
        System.out.println(len);

        System.out.println(c1);



    }
}
