package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        int x;

        Scanner Input = new Scanner(System.in);
        x = Input.nextInt();

        if (x >= 1 && x<= 100)
        {
            System.out.println("The given number falls between 1 and 100");
        }
        else {
            System.out.println("No");
        }

    }
}
