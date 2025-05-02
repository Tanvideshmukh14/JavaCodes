package HowmeworkProblems;


import java.util.Scanner;

public class Example3 {
    public static void main(String[] args)
    {
        int testCase;
        String data;
        int len;
        boolean result;

        Scanner Input =  new Scanner(System.in);
        System.out.println("Enter the testcase : ");
        testCase = Input.nextInt();

        for(int i = 0; i<testCase; i++)
        {
            System.out.println("");
            len = Input.nextInt();

            System.out.println("Enter the String : ");
            data = Input.next();

            result = (data.charAt(0) != data.charAt(data.charAt(len-1)));

            System.out.println(result? "yes" : "No");
        }
    }
}
