package floatClass;

public class Example1 {
    public static void main(String[]args){
        /* Enquiry Methods :
        * These functions returns boolean values
        * is()
        * has()
        * contains()
        */
        System.out.println(Float.isFinite(0f/12f));
        System.out.println(Float.isInfinite(12f/0f));
        Float x1 = (float)(12.1212f/1212.12);
        System.out.println(Float.isNaN(x1));
        System.out.println(Float.toHexString(12.12f));
        System.out.println(Float.MAX_EXPONENT);

    }
}
