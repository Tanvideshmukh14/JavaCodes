package collectionFramework.Assignment;

import java.util.LinkedList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        LinkedList<String> brandNames = new LinkedList<>(List.of("Nike","LV","Gucci","Channel","Mac"));

        brandNames.add(2,"Rare Beauty");
        System.out.println("Adding element at index 2 : " + brandNames);

        brandNames.addFirst("Fenty Beauty");
        System.out.println("Adding element at first place" + brandNames);

        brandNames.addLast("Mars");
        System.out.println("Adding element at last place" + brandNames);

        brandNames.remove(4);
        System.out.println("Removing element at 4th index" + brandNames);

        boolean result = brandNames.isEmpty();
        System.out.println(result);

        System.out.println("" + brandNames.size());

        result = brandNames.contains("Rare Beauty");
        System.out.println(result);
    }
}
