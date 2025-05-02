package ControlFlowInJava;

import java.util.Scanner;

public class Example11 {
   public static void main(String[] arRAY){
        Scanner Input = new Scanner(System.in);
       System.out.println("Enter Integer data : ");
       int x = Input.nextInt();
       
       if(x%2 == 0){
           System.out.println("Even number");
       }
       System.out.println("This is a real number : " + x);
       System.out.println("The vale of x is : " + x);
   }
}
