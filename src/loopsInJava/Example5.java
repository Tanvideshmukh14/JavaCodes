package loopsInJava;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int x;
        int counter;

        Scanner Input = new Scanner (System.in);
        System.out.println("Enter the value of x : ");
        x = Input.nextInt();

        counter = 0;

        while(counter <= x)
        {
            System.out.println(counter);
            counter++;
        }


    }
}
