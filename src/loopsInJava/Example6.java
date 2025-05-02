package loopsInJava;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args)
    {
        int M;
        int N;

        Scanner Input = new Scanner (System.in);
        System.out.println("Enter the value of M : ");
        M = Input.nextInt();

        System.out.println("Enter the value of N : ");
        N = Input.nextInt();

        while(M != N)
        {
            if(N>M)
            {
                N=N-M;
            } else if (M>N)
            {
                M = M-N;

            }
        }
        System.out.println(M);

    }
}
