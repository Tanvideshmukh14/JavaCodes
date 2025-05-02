package OOPInJava;
class Student{
    String name;
    String id;
        String printDetails(){
        System.out.println(name);
        System.out.println(id);

            return "";
        }
}
public class Example5 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Tanvi";
        student.id = "TAN2003";
        System.out.println(student.printDetails());
    }
}
