package OOPInJava;

import java.util.Random;

class StudentEntity{
    private String studentId;
    private String studentName;
    private String studentEmail;
    public StudentEntity(){
         this.studentId = String.valueOf(new Random().nextInt(120000));//anonymous object
    }

    public StudentEntity(String studentId ,String studentName ,String studentEmail){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }
    ///Getters and setters
    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
/// toString Method


    @Override
    public String toString() {
        return "Name : " + this.studentId + "...." + this.studentName +"...." + this.studentEmail;
    }
}
public class Example11 {
    public static void main(String[] args) {
        StudentEntity student1 = new StudentEntity();
        System.out.println(student1);
        student1.setStudentEmail("xyz@gmail.com");
        student1.setStudentName("Tanvi Deshmukh");

        System.out.println(student1);
        StudentEntity student2 = new StudentEntity("12121212" ,"Tanvi","abc@gmail.com");
        System.out.println(student2);
    }
}
