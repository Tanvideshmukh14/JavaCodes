package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        int number;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        number = Input.nextInt();

        if (number % 5 == 0 && number % 11 == 0)
        {
            System.out.println("Divisible by both 5 and 11 ");
        }
         else
        {
            System.out.println("Not divisible by 5 and 11 ");
        }
    }
}
