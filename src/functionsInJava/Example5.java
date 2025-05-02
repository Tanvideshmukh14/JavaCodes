package functionsInJava;

public class Example5 {

    static int area(int side)
    {
        System.out.println("Calculating the area of square");
        int a = side*side;
        return a;
    }

    public static void main(String...args)
    {
        System.out.println(area(12));
    }
}
