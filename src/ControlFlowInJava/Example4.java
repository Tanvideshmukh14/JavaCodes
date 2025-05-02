package ControlFlowInJava;

public class Example4 {
    public static void main(String[] args) {
        int a;
        int b;
        boolean result;

        a = 10;
        b = 15;

        //Logical OR Operator :

//      result = a==b || a!=b;
//      System.out.println("If a is equal to b or a is not equal to b : "  + result );
        
        //Logical AND Operator :

        result = a<b && a!=b;
        System.out.println("If a is less than b and also not equal to b : " + result);

        //Logical NOT Operator
    }
}
