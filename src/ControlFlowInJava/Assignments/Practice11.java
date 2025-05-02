package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        int marks;

        Scanner Input = new Scanner (System.in);
        System.out.println("Enter your marks : ");
        marks = Input.nextInt();

        if (marks >= 40)
        {
            System.out.println("PASS");
        }else
        {
            System.out.println("FAIL");
        }


    }
}
