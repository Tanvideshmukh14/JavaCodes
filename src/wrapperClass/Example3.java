package wrapperClass;

public class Example3 {
    public static void main(String[] args) {
        int x = 12;
        Integer x1 = 12;

        //static data members Inside The Integer
        System.out.println("Integer Takes Bytes : " + Integer.BYTES);
        System.out.println("Integer MAX VALUE  : " + Integer.MAX_VALUE);
        System.out.println("Integer MIN VALUE : " + Integer.MIN_VALUE);
        System.out.println("Integer TYPE : " + Integer.TYPE);

        //static functions inside the Integer Wrapper Class
        Integer n1 = 12;
        Integer n2 = 8;

        Integer numberOfOnes = Integer.bitCount(n1);
        System.out.println("Number of Ones in 12 : " + numberOfOnes);

        int reversed2sComplementForm = Integer.reverse(1);
        System.out.println("Reversed : " + reversed2sComplementForm);

        int result = Integer.compare(n1,n2) ;
        System.out.println("Compare Result : " + result);

        result = Integer.min(n1,n2) ;
        System.out.println("Minimum : " + result);

        result = Integer.max(n1,n2) ;
        System.out.println("Maximum : " + result);

        result = Integer.parseInt("-1212") ;
        System.out.println("Parsed Integer : " + result);

        result = Integer.rotateLeft(1,2) ;
        System.out.println("1 << 2 : " + result);

        result = Integer.rotateRight(8,3) ;
        System.out.println("8 >> 3 : " + result);

        result = Integer.sum(12,14) ;
        System.out.println("Result 12 + 14 : " + result);

        result = Integer.decode("1212") ;
        System.out.println("Decoded Data : " + result);

        String binaryString = Integer.toBinaryString(12) ;
        System.out.println(" : " + binaryString);

        String octalString = Integer.toOctalString(14);
        System.out.println("Octal From : " + octalString);

        String hexaDecimalString = Integer.toHexString(12);
        System.out.println("Hexa Decimal String : " + hexaDecimalString);

        //Static Methods in Integer Class
        result = Integer.max(1200,15) ;
        System.out.println("MAX : " + result);

        result = Integer.lowestOneBit(10) ;
        System.out.println("    Left Most active bit position : " + result);

        result = Integer.numberOfLeadingZeros(8) ;
        System.out.println("Leading Zeroes : " + result);

        result = Integer.bitCount(10) ;
        System.out.println("Bit Count : " + result);

        result = Integer.valueOf("1212") ;
        System.out.println("Formated Integer : " + result);

    }
}
