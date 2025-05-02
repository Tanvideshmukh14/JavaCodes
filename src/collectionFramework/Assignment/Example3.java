package collectionFramework.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> NamesOfColors = new ArrayList<>(List.of("Pink","Green","White","Black","Orange"));

        String[] colors = new String[NamesOfColors.size()];
        colors = NamesOfColors.toArray(colors);
        System.out.println(Arrays.toString(colors));

        for (int i = 0; i<NamesOfColors.size();i++){
            System.out.println(NamesOfColors.get(i));
        }

        System.out.println("Printing names using iterator");
        Iterator<String> iterator = NamesOfColors.iterator();
        while(iterator.hasNext()){
            String x = iterator.next();
            System.out.println(x);
        }
        System.out.println("Printing using for each loop : ");
        for (String x : NamesOfColors){
            System.out.println(x);
        }

        ArrayList<String> NamesOfColors2 = new ArrayList<>(List.of("Blue","Purple","White"));

        Boolean result = NamesOfColors2.containsAll(NamesOfColors2);
        System.out.println("Elements of new list exists in old list : " + result);
    }
}
