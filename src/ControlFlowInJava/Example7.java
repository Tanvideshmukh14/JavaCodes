package ControlFlowInJava;

public class Example7 {
    public static void main(String []args){
        //Unary operator

        //unary +(op)
        int x;

        x = 10;

        x = + x;
        System.out.println("x = + x : " + x);

        x = ++x;
        System.out.println("x = ++x : " + x);

        x = --x;
        System.out.println("x  = --x : " + x);

        x = x++;
        System.out.println("x = x++ : " + x);

        x = x++;
        System.out.println("x = x++ : " + x);

        x = x--;
        System.out.println("x = x-- : " + x);

    }
}
