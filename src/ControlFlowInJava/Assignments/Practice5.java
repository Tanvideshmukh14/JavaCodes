package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args)
    {
        int marks;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your marks out of 100 : ");
        marks = Input.nextInt();

        if (marks >= 80)
        {
            System.out.println("A");
        }
        else if (marks >= 70)
        {
            System.out.println("B");

        }
        else if (marks >= 60) {
            System.out.println("C");
        }
        else
            {
                System.out.println("D");
            }


    }
}
