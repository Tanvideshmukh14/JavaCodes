package ControlFlowInJava.Assignments;

import java.util.Scanner;


public class Practice6 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operator;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your two numbers : ");
        num1 = Input.nextInt();

        num2 =  Input.nextInt();

        System.out.println("Enter (+) , (-) , (*) , (/)");
        operator = Input.next();

        if ( operator.equals("+")) {
            System.out.println("Answer : " + (num1 + num2));
        }
        else if ( operator.equals("-"))
        {
            System.out.println("Answer : " + (num1 - num2));
        }
        else if ( operator.equals("*"))
        {
            System.out.println("Answer : " + (num1 * num2));
        }
        else if ( operator.equals("/"))
        {
            System.out.println("Answer : " + (num1 / num2));
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
