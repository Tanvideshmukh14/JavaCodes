package functionsInJava;

class MyClass{
    static void sayHello()
    {
        System.out.println("Say hello form MyClass");
    }
}
public class Example6 {

    static void sayHello(){
        System.out.println("Say hello from Example6");
    }

    public static void main(String[] args) {
        sayHello();
        MyClass.sayHello();
    }
}
