package ControlFlowInJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args){
        //Ternary Operator
        Scanner Input = new Scanner(System.in);
        int x;
        int a;
        x = 12;

        System.out.println("[+]Enter the value of a : ");
        a = Input.nextInt();

        String data = (a==15)?"FirstValue":"SecondValue";
        System.out.println(data);

    }


}
