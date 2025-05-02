package exceptionsInJava;
class Person{
    private String name;
    Person(){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
//Exception handling in java
//Exception : Runtime errors
public class Example1 {
    public static void main(String[] args) {
        int number1 = 1212;
        int number2 = 0;

        Person person = null;


        int[] nums = {1,2,3,4,5,6};
        try{
//            System.out.println(number1/number2);
//            System.out.println(nums[6]);
            person.getName();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

    }
}
