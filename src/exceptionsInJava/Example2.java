package exceptionsInJava;

public class Example2 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};

        try {
            System.out.println(nums[2]/nums[0]);
            System.out.println(nums[10]);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
