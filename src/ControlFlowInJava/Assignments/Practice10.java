package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice10 {
    public static void main(String []args)
    {

        {
            int leNumber1;
            int leNumber2;

            Scanner Input = new Scanner(System.in);
            System.out.println("Enter your first number : ");
            leNumber1 = Input.nextInt();

            System.out.println("Enter your second number : ");
            leNumber2 = Input.nextInt();

            if (leNumber1 % leNumber2 == 0) {
                System.out.println(leNumber1 + " is a multiple of " + leNumber2);

            } else if (leNumber2 % leNumber1 == 0) {
                System.out.println(leNumber2 + " is a multiple of " + leNumber1);
            } else {
                System.out.println("None of the number is a multiple of the other number ");
            }

        }
    }
}
