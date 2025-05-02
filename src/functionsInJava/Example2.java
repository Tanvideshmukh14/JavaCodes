package functionsInJava;

public class Example2 {

    float areaOfRightAngledTriangle(float base, float height)
    {
        float area = 0.5f * base * height;
        return area;
    }

    static float AreaOfRT(float base, float height)
    {
        float area = 0.5f * base * height;
        return area;
    }

    public static void main(String[] args) {

        // Create Object Then Call The Method Via Object
        Example2 obj = new Example2();
        float data =  obj.areaOfRightAngledTriangle(12f,10f);

        System.out.println("Area Of RT : " + data);

        // Static
        data = Example2.AreaOfRT(12f,10f);
        System.out.println("Area Of RT : "+ data);
    }
}