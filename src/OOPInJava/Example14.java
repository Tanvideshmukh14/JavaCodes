package OOPInJava;
class CircleEntity{
    float radius;
    CircleEntity(){
        this.radius = 12.00f;
    }
    float areaOfCircle(){
        return 3.14f * radius * radius;
    }
}

class CylinderEntity extends CircleEntity{
    float height;
    CylinderEntity(){
        super();
        this.height = 10.00f;
    }
    float totalSurfaceAreaOfCylinder(){
        return 2f * 3.14f * radius * ( radius + height );
    }

}
public class Example14 {
    public static void main(String[] args) {
        CylinderEntity cylinder1 = new CylinderEntity();

        float result = cylinder1.totalSurfaceAreaOfCylinder();
        System.out.println("TSA of cylinder " + result);

        System.out.println("Radius of cylinder : " + cylinder1.radius);
        System.out.println("Height of cylinder : " + cylinder1.height);


    }
}
