package inputInJava;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int sum = 0;
        int n;

        System.out.println("Enter the natural number ");
        n = Input.nextInt();

        for(int i=1; i<= n; i++)
        {
            sum = sum + i;  // you cant use un initialized variables in java

        }
        
        System.out.println("the sum of number : " + sum);

    }
}
