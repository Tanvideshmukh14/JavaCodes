package ControlFlowInJava;

import org.w3c.dom.ls.LSOutput;

class A{
    A(){
        System.out.println("Constructor A called");
    }
    public void sayHello()
    {
        System.out.println("Hello there");
    }

    public static void greet(){
        System.out.println("hello");
    }
}
class B{
    B(){
       System.out.println("Constructor B called....");
   }
    public void sayHello()
    {
        System.out.println("Hello there2");
    }

    public static void greet(){
        System.out.println("hello");
    }
   }
 public class Example10 {
     public static void main(String[] args) {

//         A.greet();
         A myObject = new A();
         myObject.sayHello();

         boolean result = myObject instanceof A;
         System.out.println(result);

         result = myObject instanceof Object;
         System.out.println(result);

//         A Object_1 = new A();
//         B Object_2 = new B();
     }
}
