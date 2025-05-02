package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        num1 = Input.nextInt();

        num2 = Input.nextInt();

        System.out.println("Enter + or - ");
        operation = Input.next();

        if (operation.equals("+")) {
            System.out.println("Answer : " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("Answer : " + (num1 - num2));
        } else {
            System.out.println("Invalid Input");
        }

    }
}
