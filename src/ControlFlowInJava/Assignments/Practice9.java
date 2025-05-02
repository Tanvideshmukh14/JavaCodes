package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args)
    {
        int leNumber1;
        int leNumber2;

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your first number : ");
        leNumber1 = Input.nextInt();

        System.out.println("Enter your second number : ");
        leNumber2 = Input.nextInt();

        if((leNumber1 ^ leNumber2) == 0)
        {
            System.out.println("Both the numbers are equal");

        }else
        {
            System.out.println("Both the numbers are different");

        }
    }

}
