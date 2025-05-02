package loopsInJava;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args)
        {
            //while loop

            int x;

            Scanner Input = new Scanner(System.in);
            x = Input.nextInt();

            while(x != 0)
            {
                System.out.println(x);
                x--;
            }

        }
}
