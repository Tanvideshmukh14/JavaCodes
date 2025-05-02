package functionsInJava;

import java.util.Arrays;

public class Example4 {

    static void printName(String...names){
        System.out.println(Arrays.toString(names));
    }
    static int add(int...x){

        int sum = 0;
        for(int target : x)
        {
            sum = sum + target;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] A = {12,13,14,15};
        int targetSum = add(12,13,14,15);
        System.out.println(targetSum);
        targetSum = add(A);
        System.out.println(targetSum);

        printName("tanvi","Aparna","Soni");


    }
}
