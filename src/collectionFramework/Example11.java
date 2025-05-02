package collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private int age;

    public Student(){
    }

    public Student(int rollNo, String name,int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;

    }
    @Override
    public int compareTo(Student student){
        if (this.rollNo < student.rollNo){
            return -1;
        }
        else if(this.rollNo > student.rollNo){
            return 1;
        }else {
            return 0;
        }

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Example11 {
    public static void main(String[] args) {
        TreeSet<Student> student = new TreeSet<>();

        Student student1  = new Student(1,"Tanvi",22);
        Student student2  = new Student(2,"Tanvi2",22);
        Student student3  = new Student(3,"Tanvi",22);

        student.add(student1);
        student.add(student3);
        student.add(student2);

        System.out.println(student);



    }
}
