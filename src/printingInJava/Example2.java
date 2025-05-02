package printingInJava;

import java.sql.SQLOutput;

public class Example2 {
    public static void main(String[] args) {

        int x = 12;
        String name = "Tanvi";
        String controlString = "Hello my name is %s and age is %d.\n";
        System.out.printf(controlString,name,x);

        float cellDivisionStart = 30*60*60*1e-6f;
        System.out.printf("The value of %f \n",cellDivisionStart);

        int x1 = 10;
        int x2 = 20;
        int x3 = 30;

        System.out.printf("Num1: %d....num2: %d.....num3: %d \n",x1,x2,x3);
        System.out.printf("Num1: %3$d....num2: %1$d .....num3: %2$d\n",x1,x2,x3);

        String num1 = "ITEM NO";
        String num2 = "ITEMS";
        String num3 = "Remarks";

        System.out.printf("%s %s %s\n",num1,num2,num3);
        System.out.printf("%10s %10s %10s\n",num1,num2,num3);

        int number = 1;
        String topic = "CA";
        String pipe = "|";
        System.out.printf("%s %30d. %5s %30s" ,pipe,number,topic,pipe);





    }
}
