package arraysInJava;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {

        int[] nums = new int[]{10, 20, -10, -20, 30};
        int[] nums_copy = new int[nums.length];

        System.out.println("Arrays : " + Arrays.toString(nums));

        //coping Elements
        for (int i = 0; i < nums.length; i++) {
            nums_copy[i] = nums[i];
        }
        System.out.println("Copied Array : " + Arrays.toString(nums_copy));
    }
}
