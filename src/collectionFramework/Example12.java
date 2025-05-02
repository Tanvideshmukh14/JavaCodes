package collectionFramework;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Example12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap =new TreeMap<>();

        treeMap.put(1,"Tanvi Deshmukh");
        treeMap.put(2,"Soni Deshmukh");
        treeMap.put(3,"Rajesh Deshmukh");
        treeMap.put(4,"Ujwala Deshmukh");
        treeMap.put(5,"Shalini Deshmukh");

        System.out.println(treeMap);

        Boolean isPresent = treeMap.containsKey(3);
        System.out.println("Key 3 is present : " + isPresent);

        String value = treeMap.get(3);
        System.out.println("Value for Key 3 : " + value);

        Entry<Integer,String> entry = treeMap.firstEntry();
        System.out.println("Record : " + entry.getKey() + "..." + entry.getValue());

        entry = treeMap.lastEntry();
        System.out.println("Last Record : " + entry.getKey() + "..." + entry.getValue());
    }
}
