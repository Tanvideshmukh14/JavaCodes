package wrapperClass;

public class Example2 {
    public static void main(String[] args) {

        int x = 12;
        Integer x1 = 12;
        //static methods in Integer Class
        int result = Integer.max(1200,15);
        System.out.println("MAX : " + result);

        result = Integer.lowestOneBit(10);
        System.out.println("Rightmost active bit position : " + result);

        result = Integer.highestOneBit(10);
        System.out.println("Leftmost active bit position : " + result);

        result = Integer.numberOfLeadingZeros(8);
        System.out.println("Leading Zeroes : " + result);

        result = Integer.bitCount(10);
        System.out.println("Bit Count : " + result);
    }
}
