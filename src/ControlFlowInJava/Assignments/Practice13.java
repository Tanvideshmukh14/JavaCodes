package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args)
    {
        int marks;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your marks out of 100 : ");
        marks = Input.nextInt();

        if (marks >= 75)
        {
            System.out.println("GOOD");
        }
        else if (marks >= 50)
        {
            System.out.println("AVERAGE");
        } else {
            {
                System.out.println("POOR");
            }

        }
    }
}
