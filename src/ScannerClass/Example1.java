package ScannerClass;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        int leNumber ; //lcNumber
        Scanner Input = new Scanner(System.in);//new operator and then we will call constructor (scanner)

        System.out.println("Enter the number : ");
        leNumber = Input.nextInt();

        System.out.println(~leNumber);

    }

}

