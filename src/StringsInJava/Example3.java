package StringsInJava;

public class Example3 {
    public static void main(String[] args) {

        String refVariable1 = new String();
        System.out.println(refVariable1);

        byte[] nums = {65,66,67,68,69,70};
        String refVariable2 = new String(nums);
        System.out.println(refVariable2);

        String refVariable = new String(nums,2,nums.length-2);
        System.out.println(refVariable);

        char[] chars = {'A','B','C','D','E','F'};
        String refVariable4 = new String(chars);
        System.out.println(refVariable4);
    }
}
