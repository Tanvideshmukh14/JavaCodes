package genericClass;

class MyPrinterClass<K,V>
{
    //data members
    private K member1;
    private V member2;

    //constructor
    public MyPrinterClass(K k1, V V1)
    {
        this.member1 = k1;
        this.member2 = V1;

        System.out.println("Constructor called");

    }

    public void printValues(){
        System.out.println(member1);
        System.out.println(member2);

    }
}
class MyPrinterClass2<A,B,C>{
    //data members
    private A member1;
    private B member2;
    private C member3;

    //constructor
    MyPrinterClass2(A a1,B b1, C c1){
        this.member1 = a1;
        this.member2 = b1;
        this.member3 = c1;
        System.out.println("constructor called");
    }
    public void printValues(){
        System.out.println(member1);
        System.out.println(member2);
        System.out.println(member3);
    }


}
public class Example4 {
    public static void main(String[] args) {
//        MyPrinterClass<String,Integer> obj = new MyPrinterClass<>("Tanvi",121212);
//        obj.printValues();

        MyPrinterClass2<String,Integer,Float> obj2 = new MyPrinterClass2<>("Tanvi",1212,1212.30f);
        obj2.printValues();
    }
}
