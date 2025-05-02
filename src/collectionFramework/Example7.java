package collectionFramework;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Example7 {
    public static void main(String[] args){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(3);

        System.out.println("Queue : " + minHeap);

        int removed = minHeap.remove();
        System.out.println("Removed Element : " + removed);

        int getRoot = minHeap.peek();
        System.out.println("Top Element : " + getRoot);

        Integer nums[] = new Integer[minHeap.size()];
        int index = 0;
        while (!minHeap.isEmpty())
        {
            nums[index++] = minHeap.remove();
        }

        System.out.println("Sorted array : ");
        Arrays.deepToString(nums);

    }
}
