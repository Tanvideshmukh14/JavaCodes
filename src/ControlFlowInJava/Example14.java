package ControlFlowInJava;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args)
    {
        //Calculator program using switch case

        int number1;
        int number2;
        int operator;
        int result;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        number1 = Input.nextInt();

        System.out.println("Enter your second number : ");
        number2 = Input.nextInt();

        System.out.println("Enter the number of operator : ");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for modulo");
        operator = Input.nextInt();

        switch(operator)
        {
            case 1:
                result = number1 + number2;
                System.out.println("Your answer is : " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Your answer is : " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Your answer is : " + result);
                break;
            case 4:
                result = number1 / number2;
                System.out.println("Your answer is : " + result);
                break;
            case 5:
                 result = number1 % number2;
                 System.out.println("Your answer is : " + result);
                 break;
            default:
                System.out.println("Invalid operator");
                break;
        }


    }
}
