package collectionFramework.Assignment;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Example9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> nums = new PriorityQueue<>();

        nums.add(30);
        nums.add(10);
        nums.add(50);
        nums.add(20);
        nums.add(5);

        System.out.println(nums);

        int removedTask = nums.remove();
        System.out.println("Removing task with highest priority : " + removedTask);

        int highestPriority = nums.peek();
        System.out.println("Peeking the task with highest priority : " + highestPriority);

        Integer[] numArr = nums.toArray(new Integer[0]);
        System.out.println("Printing sorted array : " + Arrays.toString(numArr));


    }
}
