package ControlFlowInJava;

public class Example8 {

    public static void main(String[] args) {
        //Bitwise Operator
        int x;
        int y;
        int result;
        int data;

        x = 10;
        y = 6;

        result = x | y;
        System.out.println(result);

        result = x ^ y;
        System.out.println(result);

        result = x & y;
        System.out.println(result);

        data = 1; // 0 0 0 0 0 0 0 1
        result = data << 1; // 0 0 0 0 0 0 1 0
        System.out.println("data << 1 : " + result);

        result = data <<2; //0 0 0 0 0 1 0 0
        System.out.println("data << 2 : " + result);
     }
}
