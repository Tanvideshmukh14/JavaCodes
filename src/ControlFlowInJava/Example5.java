package ControlFlowInJava;

public class Example5 {
    public static void main(String[] args) {
        // relational operator and logical operator
        int a;
        int b;
        boolean result1;
        boolean result2;

        a = 10;
        b = 5;

        result1 =  a > b && a == b;
        result2 = a == b || a != b;

        System.out.println(result1 && result2);

    }
}
