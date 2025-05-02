package ControlFlowInJava;

public class Example1 {
    public static void main(String[] args) {
        //arithmetic Operators
        int x = 10;

        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        int a = 10;
        int b = 15;

        int result = a+b;
        System.out.println("a + b : "  + result );

        result = a-b;
        System.out.println("a - b :" + result);

        result = a*b;
        System.out.println("a * b : " + result);

        result = b/a;
        System.out.println("b / a : " + result);

        result = a%5;
        System.out.println("a % 5 : " + result);
    }
}
