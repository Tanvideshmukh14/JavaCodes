package genericClass;
class MyGenericCalculator<T>
{
    private T x1;
    private T x2;
    public MyGenericCalculator(){}

    public MyGenericCalculator(T x1 ,T x2) {
      this.x1 = x1;
      this.x2 = x2;
    }

    public T getX1(){return this.x1;}
    public void setX1(T x1){this.x1 = x1;}

    public T getX2(){return this.x2;}
    public void setX2(T x2){this.x2 = x2;}
}
public class Example1 {
    public static void main(String[] args) {
        MyGenericCalculator<Integer> obj1 = new MyGenericCalculator<Integer>();

        MyGenericCalculator<Float> obj2 = new MyGenericCalculator<Float>();

        obj2.setX1(14.4f);
        obj2.setX2(12.12f);

        Float f1 = 12.12f;
        Float.sum(12f,14f);

        System.out.println(obj2.getX1());
        System.out.println(obj2.getX2());
    }
}
