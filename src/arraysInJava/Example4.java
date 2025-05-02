package arraysInJava;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args){
        int size;
        int[] nums;
        int sum = 0;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = Input.nextInt();

        nums = new int[size];

        for (int i = 0; i < size; i++)
        {
            System.out.printf("Enter the element at index[%d] : ",i);
           nums [i] = Input.nextInt();
        }

        for (int i = 0; i < size; i++)
        {
            sum = sum + nums[i];
        }
        System.out.println("The sum of elements of the array is : " + sum);
    }
}
