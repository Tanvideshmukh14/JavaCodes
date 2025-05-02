package typeConversionInJava;

public class Example1 {
    public static void main(String[] args) {

        // Widening Type Conversion In Java
        byte b1 = 36; //-128 to +127
        short b2 =(short)b1;
        System.out.println("Original data : " + b1);
        System.out.println("Converted data : " + b2);

        short b3 = 3500;
        int b4 = (int)b3;
        System.out.println("Original data : " + b3);
        System.out.println("Converted data : " + b4);

        int b5 = 120000; //-10^7 to +10^7
        long b6 = (long)b5; //+-10^12
        System.out.println("Original data : " + b5);
        System.out.println("Converted data : " + b6);

        float b7 = 12.121212f;
        double b8 = (double)b7;
        System.out.println("Original data : " + b7);
        System.out.println("Converted data : " + b8);

        char b9 = 'A';
        int b10 = (int)b9;
        System.out.println("Original data : " + b9);
        System.out.println("Converted data : " + (char)b10);

    }
}
