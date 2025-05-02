package inputInJava;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);

        int x;
        byte b;
        short s;
        long l;
        boolean isTrue;

        System.out.println("Enter the value of x : ");
        x = Input.nextInt();
        System.out.println(x);

        System.out.println("Enter the value of b : ");
        b = Input.nextByte();
        System.out.println(b);

        System.out.println("Enter tha value of s : ");
        s = Input.nextShort();
        System.out.println(s);

        System.out.println("Enter the value of l : ");
        l = Input.nextLong();
        System.out.println(l);

        System.out.println("Enter a Boolean value : ");
        isTrue = Input.nextBoolean();
        System.out.println(isTrue);

        String myName = "";
        System.out.println("Enter the name of the user : ");
        myName = Input.next();
        System.out.println(myName);

        Input.nextLine();

        String myFullName = "";
        System.out.println("Enter the full name of the user : ");
        myFullName = Input.nextLine();// we can also use : an extra Input.nextLine in between the 1st and 2nd
        System.out.println(myFullName);
        // This is called the flushing of end line character

         



    }
}
