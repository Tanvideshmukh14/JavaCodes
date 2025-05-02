package ControlFlowInJava;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int result;
        int operator;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        num1 = Input.nextInt();

        System.out.println("Enter your second number : ");
        num2 = Input.nextInt();

        System.out.println("Enter the operator's assigned number : ");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Modulo");

        operator = Input.nextInt();

        if(operator == 1)
        {
            result = num1 + num2;
            System.out.println("Your answer is : " + result);

        } else if (operator == 2)
        {
            result = num1 - num2;
            System.out.println("Your answer is : " + result);

        }else if (operator == 3)
        {
            result = num1 * num2;
            System.out.println("Your answer is : " + result);

        }else if (operator == 4)
        {
            result = num1 / num2;
            System.out.println("Your answer is : " + result);

        }else if (operator == 5)
        {
            result = num1 % num2;
            System.out.println("Your answer is : " + result);

        }else
        {
            System.out.println("Invalid operator");
        }
    }
}
