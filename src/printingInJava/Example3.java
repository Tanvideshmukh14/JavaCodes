package printingInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) throws IOException {
        {
            FileInputStream fis = new FileInputStream("D:\\JAVA\\java_s2p_codes\\src\\printingInJava\\Data\\DataMessenger");

//            System.in
            System.setIn(fis);

            
            Scanner Input = new Scanner(System.in);

//            System.out.println(Input.next());
//            System.out.println(Input.next());
//            System.out.println(Input.next());
//            System.out.println(Input.next());

            System.out.println(new String(System.in.readAllBytes()));



        }

    }

}
