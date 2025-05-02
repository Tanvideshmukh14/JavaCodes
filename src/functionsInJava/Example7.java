package functionsInJava;

public class Example7 {
    static int sum(int num)
    {
        if(num <= 0)
        {
            return 0;
        }
        else
        {
            return num + sum(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
