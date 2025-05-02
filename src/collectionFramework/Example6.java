package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        //Creating the array list to store Integer Numbers
        //Set the capacity of array list to 20
        ArrayList<Integer> arrayList1 = new ArrayList<>(20);

        arrayList1.add(10);

        arrayList1.add(0,5);
        arrayList1.add(0,70);;

        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(50,60,70,80,90));
        System.out.println("ArrayList 2 : " + arrayList2);

        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList3.add(100);
        arrayList3.add(200);
        arrayList3.add(300);

        arrayList1.addAll(3,arrayList3);
        System.out.println("ArrayList 3 : " + arrayList1);

        boolean result = arrayList1.contains(50);
        System.out.println("Arraylist1 contains 50 : " + result);

        System.out.println("Element Present at 5th index in ArrayList1 : "+ arrayList1.get(5));

        System.out.println("Index off 200 in ArrayList is : " + arrayList1.indexOf(200));

        System.out.println("Index of 70 in  ArrayList1 : " + arrayList1.indexOf(70));

        System.out.println("Last index of 70 in ArrayList1 : " + arrayList1.lastIndexOf(70));

        arrayList1.set(5,-99);
        System.out.println("Set -99  ata index 6 in ArrayList1 : " + arrayList1);

        result = arrayList1.containsAll(arrayList2);
        System.out.println("ArrayList1 contains alla elements of ArrayList2 : " + result);

        ArrayList<Integer> nums1 = new ArrayList<>(List.of(12,13,14,15,16));

        ArrayList<Integer> nums2 = new ArrayList<>(List.of(12,14,15));

        nums2.removeAll(nums1);
        System.out.println("Remove All : " + nums2 );

        //Iterating through arrayList
        System.out.println("Iterating all elements in array List-1 : ");

        for (int i  = 0; i<arrayList1.size(); i++){
            System.out.println(arrayList1.get(i));
        }

        System.out.println("Iterate all the elements in arrayList-2 using for each loop : " );
        for (Integer x : arrayList2){
            System.out.println(x);
        }

        //Forward iteration
        Iterator<Integer> iterator = arrayList1.iterator();
        while(iterator.hasNext()){
            Integer x = iterator.next();
            System.out.println(x);
        }




    }
}
