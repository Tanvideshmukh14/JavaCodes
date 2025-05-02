package OOPInJava;


class Rectangle{
    double length;
    double breadth;

    double area(){
        return length* breadth;
    }

    double perimeter(){
        return 2 * (length + breadth);
    }
    
}

public class Example3 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 20;
        rec.breadth = 10;

        System.out.println("area : " + rec.area());
        System.out.println("perimeter : " + rec.perimeter());
    }


}
