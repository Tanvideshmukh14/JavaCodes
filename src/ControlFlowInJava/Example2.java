package ControlFlowInJava;

public class Example2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        boolean result = a > b;
        System.out.println("A > B : " + result);

        result = a < b;
        System.out.println("A < B : " + result);

        result = a == b;
        System.out.println("A = = B : " + result);

        result = a >= b;
        System.out.println("A > = B : " + result);

        result = a <= b;
        System.out.println("A < = B : " + result);

        result = a != b;
        System.out.println("A != B : " + result);
    }
}
