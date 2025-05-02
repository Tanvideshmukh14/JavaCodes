package collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.function.Function;



public class HashTable {
    public static void main(String[] args) {
       Hashtable<Integer,String> hTable = new Hashtable<>();

        hTable.put(17,"Tanvi");
        hTable.put(17,"Tanvi-D");
        hTable.put(17,"TanviDeshmukh");
        hTable.put(17,"Tanvi Deshmukh");

        String value = hTable.get(13);
        System.out.println("Value for key 13 : " + value);

        hTable.forEach((((integer, s) -> System.out.println(integer + "..." + s))));

        Enumeration<Integer> eKeys = hTable.keys();
        System.out.println("Enumeration Keys Of Htable : ");
        while (eKeys.hasMoreElements()){
            System.out.println(eKeys.nextElement());
        }

        Enumeration<String> eValues = hTable.elements();
        System.out.println("Enumeration Values Of HTable: ");
        while (eValues.hasMoreElements()){
            System.out.println(eValues.nextElement());
        }

        hTable.compute(17,(k,v) -> v+="Deshmukh");

        Function<Integer,String> mapperFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "Data-"+integer;
            }
        };
        hTable.computeIfAbsent(7,mapperFunction);
        hTable.computeIfAbsent(7,(k)->k+"data");
        System.out.println(hTable);

    }
}
