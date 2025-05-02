package wrapperClass;



public class Example1 {
    public static void main(String[]args){
        //wrapper class =classes provided for primitive data types
        //int   --> Integer
        //float  ->Float
        //double ->Double
        //short --> Short
        //long  -->Long
        //byte  -->Byte

        int x1 = 10;

        System.out.println("Integer MAX VALUE " + Integer.MAX_VALUE);
        System.out.println("Integer MIN VALUE " +Integer.MIN_VALUE);
        System.out.println("Integer BYTES "+ Integer.BYTES);
        System.out.println("Binary form of 12 "+ Integer.toBinaryString(12));
        System.out.println("Active Bites "+ Integer.bitCount(12));
        System.out.println("Octal form of 12 "+ Integer.toOctalString(12));
        System.out.println("MSB "+ Integer.highestOneBit(9));
        System.out.println("LSB "+ Integer.lowestOneBit(9));
        System.out.println("Reverse "+ Integer.reverse(12));
        System.out.println("Rotate Left 1 by 2 places "+ Integer.rotateLeft(1,2));
        System.out.println("Rotate Right 1 By 2 Places "+ Integer.rotateRight(1,2));
        System.out.println("Size In Bits "+ Integer.SIZE);
        System.out.println("Parse Int "+ Integer.parseInt("1212"));
        System.out.println("" + Integer.numberOfLeadingZeros(8));


    }
}
