package inputInJava;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Example3 {
    public static void main(String[] args) throws FileNotFoundException {
        File myData = new File("D:\\JAVA\\java_s2p_codes\\src\\data\\MyData.csv");
        Scanner Input = new Scanner(myData);
//        Input.useDelimiter(",");
        String myLine = Input.nextLine();
        System.out.println(myLine);

        myLine = Input.nextLine();
        System.out.println(myLine);

        myLine = Input.nextLine();
        System.out.println(myLine);

        myLine = Input.nextLine();
        System.out.println(myLine);

//        myLine = Input.nextLine();
//        System.out.println(myLine);

    }
}
