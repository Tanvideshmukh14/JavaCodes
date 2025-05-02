package HowmeworkProblems;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //Sum of alternating numbers
        int x ;
        int sum = 1;
        int n ;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter length : ");
        x = Input.nextInt();

        for (int i = 1; i<=x ;i++)
        {
            System.out.println("Enter number : ");
            n = Input.nextInt();

          if(i == 1)
          {
              sum = n;
          } else if (i%2 == 0)
          {
              sum = sum - n;
          }
          else
          {
              sum = sum + n;
          }
        }
        System.out.println(sum);

    }
}
