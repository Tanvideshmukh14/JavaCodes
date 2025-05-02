package booleanClass;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Boolean.TYPE);
        System.out.println(Boolean.getBoolean(""));

        System.setProperty("demo-1","True");
        System.setProperty("demo-2","1234");

        /* JAVA MEMORY
         *
         * "demo-1" , "True"                 >setProperty :
         * "demo-2" ,  "1234"                >This information is stored in the form of key pairs in the memory
         * "J127" ,  "wjboqiwehc"            >Method( operates on data ,cant be called by name:belongs to a class) vs function ( return or pass the data , can be directly called ,is a reusable part of program:Procedure)
         */

        //for demo1
        String systemVariable = System.getProperty("demo-1");
        System.out.println(systemVariable);

        var result = Boolean.getBoolean("demo-1");
        System.out.println("Result of demo-1 : " + result);

        //for demo-2
        String systemVariable2 = System.getProperty("demo-2");
        System.out.println(systemVariable2);

        var result2 = Boolean.getBoolean("demo-2");
        System.out.println("Result of demo-2 : " + result2);
 //     Case is ignored

    }
}