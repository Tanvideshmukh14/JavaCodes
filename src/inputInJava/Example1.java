package inputInJava;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {

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
      b = Input.nextByte(); // -128 to 127
      System.out.println(b);

      // assignment for long nad short
      // assignment
      System.out.println("Enter the value of s : ");
      s = Input.nextShort();
      System.out.println(s);

      System.out.println("Enter the value of l : ");
      l = Input.nextLong();
      System.out.println(l);

      //Boolean value

      System.out.println("Enter the value of boolean :  ");
      isTrue = Input.nextBoolean();
      System.out.println(isTrue);

      String myName = "";
      System.out.println("Enter the name of the user : ");
      myName = Input.next();
      System.out.print(myName);

      String myFullName = "";
      System.out.println("Enter the full name of the user : ");
      Input.nextLine(); // flushing of new line character or new line charater flush  # actual flushing of new ine charater
      System.out.println(myFullName);




    }
}
