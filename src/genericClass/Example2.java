package genericClass;
class MyPrinter<T>{
    private T t1;

    public void setT1(T t1){
        this.t1 = t1;
    }
    public T getT1(){
        return this.t1;
    }
    public void print(){
        System.out.println(t1);
    }
}
public class Example2 {
    public static void main(String[] args) {
        MyPrinter<String> obj = new MyPrinter<String>();

        obj.setT1("Hello Tanvi");
        System.out.println(obj.getT1());
        obj.print();

        MyPrinter<Integer> obj2 = new MyPrinter<Integer>();

        obj2.setT1(23);
        obj2.print();
        System.out.println(obj2.getT1());


    }
}
