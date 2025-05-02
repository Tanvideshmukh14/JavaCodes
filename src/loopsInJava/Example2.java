package loopsInJava;

import java.util.Scanner;
public class Example2 {
    public static void main(String[] args)
    {
        int leNumber;

        Scanner Input =  new Scanner(System.in);

        System.out .println("Enter your number : ");
        leNumber = Input.nextInt();

        for(int i = 0; i <= leNumber; i++)
        {
            System.out.println(i);
        }

    }
}

