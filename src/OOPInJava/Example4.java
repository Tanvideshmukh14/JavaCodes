package OOPInJava;
class Cylinder{
    double radius;
    double height;
    double volume(){
     return  3.14 * radius * radius * height;
    }
}
public class Example4 {
    public static void main(String[] args) {
     Cylinder cylinder = new Cylinder();
     cylinder.radius = 10;
     cylinder.height = 10;

        System.out.println(cylinder.volume());
    }
}
//hardcoded data
