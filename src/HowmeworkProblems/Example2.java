package HowmeworkProblems;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
    // sum of 2 digit number

        int firstDigit;
        int secondDigit;
        int n;
        int sum = 0;
        int length;

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the length of sequence");
        length = Input.nextInt();

        System.out.println("Enter the 2 digit numbers: ");
        for (int i = 0; i<=length; i++) {
            n = Input.nextInt();

            if (n >= 10 && n <= 99) {
                firstDigit = n / 10;  //first number
                secondDigit = n % 10; //second number
                sum = firstDigit + secondDigit;
            }
            System.out.println(sum);
        }










    }
}
