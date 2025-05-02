package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args)
    {
        int side1;
        int side2;
        int side3;

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the length of first side: ");
        side1 = Input.nextInt();

        System.out.println("Enter the length of second side: ");
        side2 = Input.nextInt();

        System.out.println("Enter the length of third side: ");
        side3 = Input.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("This is an equilateral triangle ");

        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("This is an isosceles triangle ");

        }else
        {
            System.out.println("This is a Scalene triangle");
        }
    }
}
