package ControlFlowInJava.Assignments;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        //vowel or consonant
        String  alphabet;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a character : ");
        alphabet = Input.next();

      switch(alphabet)
      {
          case "a":
          case "e":
          case "i":
          case "o":
          case "u":
              System.out.println("Vowel");
              break;
          default:
              System.out.println("Consonant");


      }


    }
}
