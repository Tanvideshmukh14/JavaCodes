package functionsInJava;

import java.util.Arrays;

public class Example8 {
    public void printArray(int[] a){

        for (int x : a)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {

        int[] A = {1,2,3,4};
        Example8 ref = new Example8();
        ref.printArray(A);

    }
}
