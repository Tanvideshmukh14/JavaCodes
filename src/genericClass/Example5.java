package genericClass;
//Integer + Float + Double
class MyAdditionClass<A,B,C>{
    // data members
    private A member1;
    private B member2;
    private C member3;

    public MyAdditionClass() {
    }

    public MyAdditionClass(A member1, B member2, C member3) {
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
    }

    public A getMember1() {
        return member1;
    }

    public void setMember1(A member1) {
        this.member1 = member1;
    }

    public B getMember2() {
        return member2;
    }

    public void setMember2(B member2) {
        this.member2 = member2;
    }

    public C getMember3() {
        return member3;
    }

    public void setMember3(C member3) {
        this.member3 = member3;
    }

    @Override
    public String toString() {
        return "MyAdditionClass{" +
                "member1=" + member1 +
                ", member2=" + member2 +
                ", member3=" + member3 +
                '}';
    }
}
public class Example5 {
    public static void main(String[] args) {
        MyAdditionClass<Integer,String,Float> object = new MyAdditionClass<>(12,"Tanvi",12.12f);
        System.out.println(object);
    }
}
