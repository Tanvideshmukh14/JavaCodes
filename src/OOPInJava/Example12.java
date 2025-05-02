package OOPInJava;
class RectangleEntity{
    int len;
    int bre;
     RectangleEntity(){
         this.len = 10;
         this.bre = 14;
     }
     int area(){
         return this.len * this.bre;
     }
}

class CuboidEntity extends RectangleEntity{
    int h;

    CuboidEntity(){
        super(); // This should be the very first line while having parent-child relationship
        this. h = 100;
    }
    int volume(){
        return this.h * this.len *this.bre;
    }

}
public class Example12 {
    public static void main(String[] args) {
        CuboidEntity c1 = new CuboidEntity();

        int area = c1.area();
        System.out.println("Area " + area);

        int volume = c1.volume();
        System.out.println("Volume : " + volume);

        System.out.println("Length : " +c1.len );
        System.out.println("Breadth : " +c1.bre );
        System.out.println("Height : " +c1.h );

        RectangleEntity r1 = new RectangleEntity();
        area = r1.area();
        System.out.println(area);

        //Parent can hold the object if child
        RectangleEntity r2 = new CuboidEntity();
    }
}
